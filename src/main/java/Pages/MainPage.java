package Pages;

import Common.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainPage {
    WebDriver driver;
    Util util;

    By titleText = By.xpath("//*[@class='button button--secondary button--subscribe']");
    By latestNewsTitleList = By.xpath("//*[@class='river river--homepage ']//*[@class='post-block__title__link']");
    By latestNewsAuthorList = By.xpath("//*[@class='river river--homepage ']//*[@class='post-block__title__link']//parent::*//following-sibling::*//*[@class='river-byline__authors']");
    By latestNewsImageList = By.xpath("//*[@class='button button--secondary button--subscribe']");

    public MainPage(WebDriver driver) {
        util = new Util(driver);
        this.driver = driver;
    }

    public boolean checkMainPageTitle(){
        if (util.isDisplayed(titleText)){
            return true;
        }
        else {
            return false;
        }
    }

    public void confirmLatestNewsAuthorList(){
        List<WebElement> elementList = util.findAll(latestNewsAuthorList);
        List<String> titleTextList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
        System.out.println(titleTextList);
    }

    public void confirmLatestNewsImageList(){
        List<WebElement> elementList = util.findAll(latestNewsImageList);
        List<String> titleImageList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
        System.out.println(titleImageList);
    }

}
