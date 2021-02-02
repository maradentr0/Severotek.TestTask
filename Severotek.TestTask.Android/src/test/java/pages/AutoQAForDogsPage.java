package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AutoQAForDogsPage {
    AndroidDriver driver;

    By textView = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout" +
            "/android.view.ViewGroup/android.widget.TextView");
    By food = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]" +
            "/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]");

    public AutoQAForDogsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public String getTextView() {
        return driver.findElement(textView).getText();
    }

    public void clickFood(){
        driver.findElement(food).click();
    }
}
