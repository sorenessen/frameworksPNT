package search;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by soren on 8/24/2016.
 */
public class SearchContent extends Base {

    @Test
    public void searchNews() throws InterruptedException {
        clickByCss(".button.search-button");
        typeByCss("#search-input", "football concussion");
        sleepFor(3);
        clickByXpath(".//*[@id='searchResults']/ol/li[2]/div[2]/h3/a");
        //driver.findElement(By.cssSelector("html body div div img")).sendKeys(Keys.chord(Keys.ALT, Keys.F4));
        //driver.navigate().back();
        sleepFor(5);
        clickByCss(".button.search-button");
        typeByCss("#search-input","best sellers list");
        sleepFor(5);
        clickByXpath(".//*[@id='searchResults']/ol/li[8]/div/h3/a");
        sleepFor(15);
        clickByCss("#nyt-button-sub");
        sleepFor(5);
    }
}
