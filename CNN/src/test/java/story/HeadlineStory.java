package story;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by soren on 8/24/2016.
 */
public class HeadlineStory extends Base{

    @Test
    public void searchStory() throws InterruptedException {
        clickByCss("#search-button");
        typeByCss("#search-input-field", "space");
        sleepFor(8);
        driver.navigate().back();
        sleepFor(8);
        clickByXpath(".//*[@id='nav']/div[2]/div[2]/a[1]");
        sleepFor(8);

    }



}
