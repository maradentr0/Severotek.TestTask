package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class AutoQAGetInfoPage {
    AndroidDriver driver;
    By textView = By.id("com.mobium8918.app:id/textTextView");
    By declineButton = By.id("com.mobium8918.app:id/decline_button");

    public AutoQAGetInfoPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public String getTextView() {
        return driver.findElement(textView).getText();
    }

    public void clickDeclineButton(){
        driver.findElement(declineButton).click();
    }
}
