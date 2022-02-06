package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchField;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@data-csa-c-slot-id='HamburgerMenuDesktop']")
    private WebElement popupCategoryMenu;

    @FindBy(xpath = "//a[@data-menu-id='6']")
    private WebElement computersHamburgerMenu;

    @FindBy(xpath = "//*[contains(text(),'Monitors')]")
    private WebElement subCategoryMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void typeTextSearchField(String text) {
        searchField.isDisplayed();
        searchField.sendKeys(text);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickPopupCategoryMenu() {
        popupCategoryMenu.click();
    }

    public void clickComputersHamburgerMenu() throws InterruptedException {
        Thread.sleep(2000);
        computersHamburgerMenu.click();
    }

    public void clickSubCategoryMenu() throws InterruptedException {
        Thread.sleep(2000);
        subCategoryMenu.click();
    }
}
