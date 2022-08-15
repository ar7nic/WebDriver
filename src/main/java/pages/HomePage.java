package pages;

import org.openqa.selenium.*;

public class HomePage extends BasePage{

    private static final String IMAGES = "div[role=main] a img";
    private static final String INPUT_FIELD = "input[role=combobox]";
    private static final String IMAGES_TAB = "//a[contains(text(),'Картинки')]";

    public WebElement getFirstImgItem() {
        return driver.findElements(By.cssSelector(IMAGES)).get(0);
    }

    public boolean imageIsDisplayedOnPage() {
        return (Boolean) ((JavascriptExecutor)driver)
            .executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", getFirstImgItem());
    }

    public void clickOnImagesTab() {
        driver.findElement(By.xpath(IMAGES_TAB)).click();
    }

    public void enterSearchKeyword(String keyword) {
        driver.findElement(By.cssSelector(INPUT_FIELD)).sendKeys(keyword, Keys.ENTER);
    }
    public HomePage(WebDriver driver) {
        super(driver);
    }
}
