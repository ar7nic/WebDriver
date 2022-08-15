package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest extends BaseTest{

    private static final String KEYWORD = "image";
    private static final long DEFAULT_TIMEOUT = 30;

    @Test
    public void imagesDisplayedOnSearchPage() {
         getHomePage().enterSearchKeyword(KEYWORD);
         getHomePage().clickOnImagesTab();
         assertTrue(getHomePage().waitVisibilityOfElement(DEFAULT_TIMEOUT,getHomePage().getFirstImgItem()));
         assertTrue(getHomePage().imageIsDisplayedOnPage());
        }
}
