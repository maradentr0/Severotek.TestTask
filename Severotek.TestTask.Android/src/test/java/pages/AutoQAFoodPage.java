package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AutoQAFoodPage {
    AndroidDriver driver;

    By textView = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout" +
            "/android.view.ViewGroup/android.widget.TextView");
    By dietFood = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]" +
            "/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");

    public AutoQAFoodPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public String getTextView() {
        return driver.findElement(textView).getText();
    }

    public void clickDietFood(){
        driver.findElement(dietFood).click();
    }
}
