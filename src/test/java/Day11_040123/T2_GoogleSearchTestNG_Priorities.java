package Day11_040123;

import Reusuable_Library.ReusableMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T2_GoogleSearchTestNG_Priorities {


    //to make variable global, you must declare it outside of the annotation methods
    WebDriver driver;

    //create before suite method to define chrome driver
    @BeforeSuite
    public void setUpDriver(){
        driver = ReusableMethods.defineChromeDriver();
    }// end of before suite

    //@Test is a replacement of the main method to execute your code
    @Test(priority = 1)
    public void SearchBMW() {
        //navigate to google home
        driver.navigate().to("https://www.google.com");

        //enter BMW within search field
        ReusableMethods.sendKeysMethod(driver, "//*[@name='q']", "BMW", "Search Field");

        //submit of google search
        ReusableMethods.submitMethod(driver, "//*[@name='btnK']", "Google Search");
    }//End of Test 1

    @Test (priority = 3)
    public void captureSearchnumberforBMW(){
        //capture the text and print out the number
        String result = ReusableMethods.captureTextMethod(driver,"//*[@id='result-stats']","Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Search number for BMW: " + arrayResult[1]);
    }//End of Test 2

    @Test (priority = 3)
    public void clickFinance(){
        ReusableMethods.clickMethod(driver,"//div[text()='Finance']","Finance");
    }

    //Start of after suite
    @AfterSuite
    public void quitSession(){
        //quit the driver
        driver.quit();
    }//end of after suite

}//end of testNG

