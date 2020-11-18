package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoQAMainPage {
    WebDriver driver;
    By mainPageTitle = By.xpath("//*[@id=\"content\"]/h1");
    By addEntriesButton = By.xpath("//*[@id=\"module_2\"]/div/ul[1]/li[1]/ul/li[1]/a");

    public AutoQAMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMainPageTitle() {
        return driver.findElement(mainPageTitle).getText();
    }

    public void clickAddEntriesButton(){
        driver.findElement(addEntriesButton).click();
    }
}
