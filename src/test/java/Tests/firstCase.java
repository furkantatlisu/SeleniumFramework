package Tests;

import Common.Util;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class firstCase {

    String driverPath = "chromedriver.exe";
    WebDriver driver;
    MainPage mainPage;

    public void getObject(){
        mainPage = new MainPage(driver);
    }

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://techcrunch.com/");
        driver.manage().window().maximize();
        System.out.println("mainpage executed");
    }

    @AfterTest
    public void shutdown(){
        driver.quit();
    }

    @Test
    public void mainSenario(){
        getObject();
        mainPage.checkMainPageTitle();  //verify main page
        mainPage.confirmLatestNewsAuthorList();
        mainPage.confirmLatestNewsImageList();
        mainPage.compareRandomChosenTitle();
    }



}
