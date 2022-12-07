package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Util {

    WebDriver driver;

    public Util(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public String getText(By locator){
        return find(locator).getText();
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator,String logText){
        find(locator).click();
    }

    public void type(By locator , String text,String logText){
        find(locator).sendKeys(text);
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }
}
