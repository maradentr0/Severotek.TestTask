package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AutoQAMainPage {
    AndroidDriver driver;

    By mainLabel = By.id("com.mobium8918.app:id/largeLabel");
    By forDogs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]" +
            "/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup" +
            "/android.widget.LinearLayout/android.view.ViewGroup[1]");

    public AutoQAMainPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public String getMainLabel() {
        return driver.findElement(mainLabel).getText();
    }

    public void clickForDogs(){
        driver.findElement(forDogs).click();
    }
}
