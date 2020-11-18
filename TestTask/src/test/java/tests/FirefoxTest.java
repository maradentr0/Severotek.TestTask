package tests;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.*;
import properties.ConfProperties;

public class FirefoxTest {
    private static WebDriver driver;
    AutoQALoginPage objLogin;
    AutoQAMainPage objMain;
    AutoQANewEntryPage objNewEntry;
    AutoQABlogPage objBlog;
    AutoQAManageEntryPage objManageEntry;
    AutoQAConfirmDeletePage objConfirmDelete;

    @Before
    public void logIn() {
        System.setProperty("webdriver.gecko.driver", ConfProperties.getProperty("geckodriver"));
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("url"));
    }

    @Test
    public void mainTest() {
        objLogin = new AutoQALoginPage(driver);
        objLogin.loginToAutoQA(ConfProperties.getProperty("userName"), ConfProperties.getProperty("password"));

        objMain = new AutoQAMainPage(driver);
        Assert.assertTrue(objMain.getMainPageTitle().contains("Панель управления"));
        objMain.clickAddEntriesButton();

        objNewEntry = new AutoQANewEntryPage(driver);
        Assert.assertTrue(objNewEntry.getEntryPageTitle().contains("Добавить entry"));
        objNewEntry.entryToAutoQA("Title123", "Slug123", "Markdown123", "Text123");

        driver.get("https://igorakintev.ru/blog/");
        objBlog = new AutoQABlogPage(driver);

        if(objBlog.getNewNoteTitle().contains("Title123")) {
            driver.get("https://igorakintev.ru/admin/blog/entry/");
            objManageEntry = new AutoQAManageEntryPage(driver);
            if(objManageEntry.getLastNoteTitle().contains("Title123")) {
                objManageEntry.manageEntryToAutoQA();
                objConfirmDelete = new AutoQAConfirmDeletePage(driver);
                objConfirmDelete.clickConfirmButton();
            }
        }
    }

    @After
    public void logOut() {
        driver.quit();
    }
}
