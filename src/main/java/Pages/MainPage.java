package Pages;

import Common.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MainPage {
    WebDriver driver;
    Util util;

    By titleText = By.xpath("//*[@class='button button--secondary button--subscribe']");

    public MainPage(WebDriver driver) {
        util = new Util(driver);
        this.driver = driver;
    }

    public String getMainPageTitle(){
        return util.getText(titleText);
    }
}
