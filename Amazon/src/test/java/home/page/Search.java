package home.page;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by soren on 8/24/2016.
 */
public class Search extends Base {

    @Test
    public void searchItems()throws InterruptedException{
        typeByCss("#twotabsearchtextbox", "Laptop");
        sleepFor(3);
    }



}
