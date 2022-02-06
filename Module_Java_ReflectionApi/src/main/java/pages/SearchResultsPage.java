package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[contains(@data-cel-widget, 'search_result_')]")
    private List<WebElement> productList;

    @FindBy(xpath = "//li[@aria-label='HP']//i[@class='a-icon a-icon-checkbox']")
    private WebElement hpMonitorsPage;

    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
    private List<WebElement> productContentList;

    @FindBy(xpath = "//*[@class='a-section aok-relative s-image-square-aspect']")
    private List<WebElement> imageBlockList;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductContentListDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        return productContentList.get(0).isDisplayed();
    }

    public void checkThatSearchResultsContainsWord() throws InterruptedException {
        Thread.sleep(2000);
        for (WebElement webElement : productContentList) {
            Assert.assertTrue(webElement.getText().contains("HP"));
        }
    }

    public void checkImageBlockAmount() {
        Assert.assertEquals(33, imageBlockList.size());
    }


    public void checkCountList() {
        int count = productList.size();
        switch (count) {
            case 32 ->
                    System.out.println("There are 32 picture elements on the page");
            case 34 ->
                    System.out.println("There are 34 picture elements on the page");
            default ->
                    System.out.println("There are more elements of pictures on the page");
        }
    }

    public boolean isProductListDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        return productList.get(1).isDisplayed();
    }

    public void clickHpMonitorsPage() throws InterruptedException {
        Thread.sleep(2000);
        hpMonitorsPage.click();
    }
}
