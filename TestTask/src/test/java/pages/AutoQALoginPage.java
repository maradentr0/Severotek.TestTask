package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoQALoginPage {
    WebDriver driver;
    By userName = By.id("id_username");
    By password = By.id("id_password");
    By login = By.xpath("//*[@id=\"login-form\"]/div[3]/input");

    public AutoQALoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName (String strUserName) {
        driver.findElement(userName).sendKeys(strUserName);
    }

    public void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);
    }

    public void clickLogin(){
        driver.findElement(login).click();
    }

    public void loginToAutoQA (String strUserName, String strPassword) {
        this.setUserName(strUserName);
        this.setPassword(strPassword);
        this.clickLogin();
    }

}
