package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoQABlogPage {
    WebDriver driver;
    By newNoteTitle = By.xpath("//*[@id=\"entries\"]/h2[1]/a");

    public AutoQABlogPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getNewNoteTitle() {
        return driver.findElement(newNoteTitle).getText();
    }
}
