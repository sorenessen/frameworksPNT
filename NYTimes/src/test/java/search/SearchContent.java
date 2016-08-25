package search;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by soren on 8/24/2016.
 */
public class SearchContent extends Base {

    @Test
    public void searchNews() throws InterruptedException {
        clickByCss(".button.search-button");
        typeByCss("#search-input", "Olympic");
        sleepFor(3);
    }
}
