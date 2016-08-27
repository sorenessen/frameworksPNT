package Forms;


import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by soren on 8/24/2016.
 */
public class AddCart extends Base{

    @Test
    public void searchElectronics() throws InterruptedException, IOException {

        typeByCss("#searchForm","iphone 6s digitizer");
        sleepFor(3);
        clickByXpath(".//*[@id='results-body']/div[2]/div[1]/a[2]/span");
        sleepFor(3);
        clickByCss(".buttonLink");
        sleepFor(3);
        clickByXpath(".//*[@id='searchDisplayModeTarget']/div[2]/a[6]/h5");
        sleepFor(3);
        clickByXpath(".//*[@id='productOptions']/div[10]/p[1]/span[1]/input");
        sleepFor(3);
        clickByCss("#addToCart");
        sleepFor(3);
        clickByCss(".buttonLink.minicartCheckout");
        sleepFor(3);
        clickByCss("#remove-314037-2");



//        clickByXpath(".//*[@id='home-page-top']/div/div[1]/a[2]");
//        sleepFor(5);
//        typeByCss("#email","thejerk@thelookingglasslounge.com");
//        typeByCss("#password","password");
//        sleepFor(2);
//        clickByCss("#loginBtn");
//        sleepFor(3);
//        clickByXpath(".//*[@id='mainHeader']/nav/a[3]/span");
//        sleepFor(3);
//        clickByCss("/Store/Tools/64-Bit-Driver-Kit/IF145-299-1");

        //WebDriverWait wait = new WebDriverWait(driver,15);
        //WebDriverWait waiter = new WebDriverWait(driver, 90, 1000);
       // waiter.until(new ExpectedCondition<Boolean>(){
            //public Boolean apply(WebDriver d) {
                //return (d.findElement(By.id("yourElementID"))!=null);
            //}});
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); reader.readLine();
        //typeByCss("#reg-unique-username","SeleniumUnique1");

       // typeByCss("#reg-email","email1@email.com");
        //typeByCss("#reg-password","password");
        //sleepFor(3);
        //clickByCss("#registerBtn");
//        typeByCss("#searchForm","iPhone 6s screen");
//        sleepFor(3);
//        clickByXpath(".//*[@id='results-body']/div[2]/div[2]/a[2]/span");
//        sleepFor(5);
//        clickByXpath(".//*[@id='topContent']/div[5]/div[5]/a/h5");
        sleepFor(5);
    }

}

