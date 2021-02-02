package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidTest {
    private static AndroidDriver driver;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    AutoQAGetInfoPage objGetInfo;
    AutoQAGetGeoPage objGetGeo;
    AutoQAChooseTheRegionPage objChooseTheRegion;
    AutoQAMainPage objMain;
    AutoQAForDogsPage objForDogs;
    AutoQAFoodPage objFood;
    AutoQADietFoodPage objDietFood;
    AutoQACartPage objCart;

    @Before
    public void logIn() {
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 30");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\marad\\IdeaProjects\\Severotek.TestTask.Android\\src\\test\\APK\\12933-App-Android.apk");
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        objGetInfo = new AutoQAGetInfoPage(driver);
        objGetGeo = new AutoQAGetGeoPage(driver);
        objChooseTheRegion = new AutoQAChooseTheRegionPage(driver);
        objMain = new AutoQAMainPage(driver);
        objForDogs = new AutoQAForDogsPage(driver);
        objFood = new AutoQAFoodPage(driver);
        objDietFood = new AutoQADietFoodPage(driver);
        objCart = new AutoQACartPage(driver);
    }

    @Test
    public void mainTest() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(objGetInfo.getTextView().contains("Получайте информацию о новинках, скидках и акциях"));

        objGetInfo.clickDeclineButton();
        Assert.assertTrue(objGetGeo.getTextView().contains("Разрешите доступ к геопозиции, чтобы мы показали условия доставки товаров в ваш город"));

        objGetGeo.clickDeclineButton();
        Assert.assertTrue(objChooseTheRegion.getTextView().contains("Choose the region"));

        objChooseTheRegion.clickCity();
        Assert.assertTrue(objMain.getMainLabel().contains("Главная"));

        objMain.clickForDogs();
        Assert.assertTrue(objForDogs.getTextView().contains("Для собак"));

        objForDogs.clickFood();
        Assert.assertTrue(objFood.getTextView().contains("Корма"));

        objFood.clickDietFood();
        Assert.assertTrue(objDietFood.getTextView().contains("Диеты"));

        objDietFood.clickAddFirstButton();
        objDietFood.clickAddOneMoreButton();
        objDietFood.clickAddOneMoreButton();
        Assert.assertTrue(objDietFood.getCountDietFood().contains("3"));

        objDietFood.clickActionCart();
        Assert.assertTrue(objCart.getTextView().contains("Cart"));

        Assert.assertTrue(objCart.getNameProduct().contains("Корм для собак ROYAL CANIN Hypoallergenic Canine, конс. 200г"));
        Assert.assertTrue(objCart.getCountProduct().contains("3"));
    }


    @After
    public void logOut() {
        driver.quit();
    }
}
