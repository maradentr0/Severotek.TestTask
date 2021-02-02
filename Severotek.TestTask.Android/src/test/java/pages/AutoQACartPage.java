package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AutoQACartPage {
    AndroidDriver driver;

    By textView = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout" +
            "/android.view.ViewGroup/android.widget.TextView");
    By nameProduct = By.id("com.mobium8918.app:id/titleTextView");
    By countProduct = By.id("com.mobium8918.app:id/stepper_number_button");

    public AutoQACartPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public String getTextView() {
        return driver.findElement(textView).getText();
    }

    public String getNameProduct() {
        return driver.findElement(nameProduct).getText();
    }

    public String getCountProduct() {
        return driver.findElement(countProduct).getText();
    }
}
