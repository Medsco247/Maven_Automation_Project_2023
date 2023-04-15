package Action_Items;

import Reusuable_Library.ReusableMethods;
import org.openqa.selenium.WebDriver;

public class Action_Item_5 {
    public static void main(String[] args) throws InterruptedException {

        //declare webdriver command
        WebDriver driver = ReusableMethods.defineChromeDriver();

        //navigate to bestbuy website
        driver.navigate().to("http://www.bestbuy.com");
        
        //click on search bar
        ReusableMethods.clickMethod(driver,"//*[@class='search-input']","search bar");

        //typing "iphone" within search bar
        ReusableMethods.sendKeysMethod(driver,"//*[@class='search-input']","iphone", "search bar");

        //clicking on search
        ReusableMethods.clickMethod(driver,"//*[@class='header-search-button']"," click search");

        Thread.sleep(2000);

        //click on sort dropdown
        ReusableMethods.clickMethod(driver,"//*[@class='tb-select']"," click dropdown");

        //select best-selling by text
        ReusableMethods. selectByTextMethod(driver, "//*[@class='tb-select']","Best Selling","Select Best Selling");

        Thread.sleep(2000);

        //click on first iphone
        ReusableMethods.clickMethodByIndex(driver,"//*[@class='image-link']",0,"first iphone link");

        //scroll down to "Learn about Total-tech"
        ReusableMethods.scrollingByElementMethod(driver,"//*[@data-qa='learn-more-button']",null, "scroll down");

        //click on "Add to cart"
        ReusableMethods.clickMethod(driver,"//*[@class='fulfillment-add-to-cart-button']","Add to Cart");

        Thread.sleep(2000);

        //capture price
        String result = ReusableMethods.captureTextMethod(driver,"//*[@class='sub-total v-fw-medium']","Price Capture");
        System.out.println("My result is " + result);

        Thread.sleep(2000);

        //hover mouse over "continue shopping"
        ReusableMethods.mouseHoverMethod(driver,"//*[@class='c-button-link continue-shopping']","continue shopping","hovering  over element");

        Thread.sleep(2000);

        //click on continue shopping
        ReusableMethods.clickMethod(driver,"//*[@class='c-button-link continue-shopping']","click on continue shopping");

        driver.quit();

    }//end of main
}//end of class
