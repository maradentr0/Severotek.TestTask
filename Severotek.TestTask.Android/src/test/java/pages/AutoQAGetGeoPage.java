package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AutoQAGetGeoPage {
    AndroidDriver driver;

    By textView = By.id("com.mobium8918.app:id/textTextView");
    By declineButton = By.id("com.mobium8918.app:id/decline_button");

    public AutoQAGetGeoPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public String getTextView() {
        return driver.findElement(textView).getText();
    }

    public void clickDeclineButton(){
        driver.findElement(declineButton).click();
    }

}
