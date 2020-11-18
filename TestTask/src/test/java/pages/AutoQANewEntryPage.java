package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoQANewEntryPage {
    WebDriver driver;
    By entryPageTitle = By.xpath("//*[@id=\"content\"]/h1");
    By title = By.xpath("//*[@id=\"id_title\"]");
    By slug = By.xpath("//*[@id=\"id_slug\"]");
    By textMarkdown = By.xpath("//*[@id=\"id_text_markdown\"]");
    By text = By.xpath("//*[@id=\"id_text\"]");
    By saveButton = By.xpath("//*[@id=\"entry_form\"]/div/div/input[1]");

    public AutoQANewEntryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getEntryPageTitle() {
        return driver.findElement(entryPageTitle).getText();
    }

    public void setTitle(String strTitle){
        driver.findElement(title).sendKeys(strTitle);
    }
    public void setSlug (String strSlug){
        driver.findElement(slug).sendKeys(strSlug);
    }
    public void setTextMarkdown(String strTextMarkdown){
        driver.findElement(textMarkdown).sendKeys(strTextMarkdown);
    }
    public void setText(String strText){
        driver.findElement(text).sendKeys(strText);
    }

    public void clickSaveButton(){
        driver.findElement(saveButton).click();
    }

    public void entryToAutoQA (String strTitle, String strSlug, String strTextMarkDown, String strText) {
        this.setTitle(strTitle);
        this.setSlug(strSlug);
        this.setTextMarkdown(strTextMarkDown);
        this.setText(strText);
        this.clickSaveButton();
    }

        /*String openLinkInNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);

        String openNewTab = Keys.chord(Keys.CONTROL,"t");
        driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);*/
}
