package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoQAConfirmDeletePage {
    WebDriver driver;
    By confirmButton = By.xpath("//*[@id=\"content\"]/form/div/input[4]");

    public AutoQAConfirmDeletePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickConfirmButton(){
        driver.findElement(confirmButton).click();
    }
}
