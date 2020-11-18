package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoQAManageEntryPage {
    WebDriver driver;
    By lastNoteCheckBox = By.xpath("//*[@id=\"result_list\"]/tbody/tr[1]/td[1]/input");
    By lastNoteTitle = By.xpath("//*[@id=\"result_list\"]/tbody/tr[1]/th/a");
    By selectOption = By.xpath("//*[@id=\"changelist-form\"]/div[2]/label/select/option[2]");
    By doButton = By.xpath("//*[@id=\"changelist-form\"]/div[2]/button");

    public AutoQAManageEntryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLastNoteTitle() {
        return driver.findElement(lastNoteTitle).getText();
    }

    public void clickLastNoteCheckBox(){
        driver.findElement(lastNoteCheckBox).click();
    }

    public void clickSelectOption() {
        driver.findElement(selectOption).click();
    }

    public void clickDoButton(){
        driver.findElement(doButton).click();
    }

    public void manageEntryToAutoQA () {
        this.clickLastNoteCheckBox();
        this.clickSelectOption();
        this.clickDoButton();
    }


}
