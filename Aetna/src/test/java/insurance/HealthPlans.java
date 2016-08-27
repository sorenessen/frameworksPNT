package insurance;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by soren on 8/26/2016.
 */
public class HealthPlans extends Base {

    @Test
    public void insurancePlans() throws InterruptedException {
        clickByXpath("html/body/div[3]/div[2]/div[2]/div/div/div/ul/li[2]/a"); //clicks employers' plan tab
        sleepFor(2);
        clickByXpath(".//*[@id='main']/div[3]/div/div/div[3]/ul[1]/li[1]/a"); //clicks on small business options
        sleepFor(5);
        driver.navigate().back();
        driver.findElement(By.cssSelector("html body div div img")).sendKeys(Keys.chord(Keys.ALT, Keys.F4)); //closes the pop up advertisement
        sleepFor(5);
        clickByXpath(".//*[@id='main']/div[3]/div/div/div[3]/ul[1]/li[2]/a");
        sleepFor(5);
    }
}
