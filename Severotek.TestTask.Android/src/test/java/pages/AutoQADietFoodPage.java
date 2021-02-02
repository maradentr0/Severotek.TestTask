package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AutoQADietFoodPage {
    AndroidDriver driver;

    By textView = By.xpath("\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout" +
            "/android.view.ViewGroup/android.widget.TextView");
    By nameDietFood = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]" +
            "/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup" +
            "/android.widget.TextView[1]");
    By addFirstButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]" +
            "/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup" +
            "/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView");
    By addOneMoreButton = By.id("com.mobium8918.app:id/stepper_plus_button");
    By actionCart = By.id("com.mobium8918.app:id/action_cart");
    By countDietFood = By.id("com.mobium8918.app:id/stepper_number_button");

    public AutoQADietFoodPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public String getTextView() {
        return driver.findElement(textView).getText();
    }

    public String getNameDietFood() {
        return driver.findElement(nameDietFood).getText();
    }

    public void clickAddFirstButton(){
        driver.findElement(addFirstButton).click();
    }

    public void clickAddOneMoreButton(){
        driver.findElement(addOneMoreButton).click();
    }

    public String getCountDietFood() {
        return driver.findElement(countDietFood).getText();
    }

    public void clickActionCart(){
        driver.findElement(actionCart).click();
    }
}
