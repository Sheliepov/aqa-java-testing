package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitForPageLoadComplete(long timeToWait) {
        new WebDriverWait(driver, timeToWait).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void waitUntilIsTrue(long timeToWait, WebElement webElement) {
        new WebDriverWait(driver, timeToWait).until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilTrue(long timeToWait, List<WebElement> webElement) {
        new WebDriverWait(driver, timeToWait).until(ExpectedConditions.visibilityOfAllElements(webElement));
    }
}