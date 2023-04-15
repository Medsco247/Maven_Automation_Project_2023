package Action_Items;

import Reusuable_Library.ReusableAnnotations;
import Reusuable_Library.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.awt.*;
import java.util.ArrayList;


public class Action_Item_6 extends ReusableAnnotations {

    @Test
    public void fidelisCare_pt1() throws InterruptedException {

        driver.navigate().to("https://www.fideliscare.org");
        //click on search icon
        ReusableMethods.clickMethod(driver, "//*[@class='fal fa-search']", "Search Icon");

        //Type "Get dental coverage" within search bar
        ReusableMethods.sendKeysMethod(driver, "//*[@class='form-control search-input']", "Get Dental Coverage", "Dental Search");

        //click on search icon after typing
        ReusableMethods.clickMethod(driver, "//*[@class='input-group-btn']", "Search Icon pt2");

        Thread.sleep(2000);

        //Capture search result
        String result = ReusableMethods.captureTextMethod(driver, "//*[@class='gsc-above-wrapper-area-container']", "Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Search Number is " + arrayResult[1]);

        //click on get dental coverage link
        ReusableMethods.clickMethodByIndex(driver, "//b[contains(text(),'Get Dental Coverage')]", 0, "click link");

    }//end of test 1

    @Test(dependsOnMethods = "fidelisCare_pt1" )
    public void fidelisCare_pt2() throws InterruptedException {

        //switch tabs
        ReusableMethods.switchTabByIndexMethod(driver, "1", "switch tab");

        //Click and type first name
        ReusableMethods.clickMethod(driver, "//*[@id='firstName']", "First Name click");
        ReusableMethods.sendKeysMethod(driver, "//*[@id='firstName']", "Ahmed", "First name info");

        //Click and type last name
        ReusableMethods.clickMethod(driver, "//*[@id='lastName']", "Last Name click");
        ReusableMethods.sendKeysMethod(driver, "//*[@id='lastName']", "Othman", "Last name info");

        //Click and type zipcode
        ReusableMethods.clickMethod(driver, "//*[@id='zipCode']", "Zipcode click");
        ReusableMethods.sendKeysMethod(driver, "//*[@id='zipCode']", "10703", "zipcode info");

        //Click county dropdown
        ReusableMethods.clickMethod(driver, "//*[@id='county']", "click county dropdown");
        ReusableMethods.selectByTextMethod(driver, "//*[@id='county']", "Westchester", "county dropdown info");

        //Click and type phone number
        ReusableMethods.clickMethod(driver, "//*[@id='phoneNumber']", "Phone number click");
        ReusableMethods.sendKeysMethod(driver, "//*[@id='phoneNumber']", "1236784590", "phone number info");

        //Click and type email
        ReusableMethods.clickMethod(driver, "//*[@id='email']", "email click");
        ReusableMethods.sendKeysMethod(driver, "//*[@id='email']", "ahmed_email@gmail.com", "email info");

        //Click checkbox
        ReusableMethods.clickMethodByIndex(driver, "//*[@for='contactMe']", 1, "checkBox click");

        Thread.sleep(2000);

        //Click "contact me"
        ReusableMethods.clickMethodByIndex(driver, "//*[contains(text(),'Contact Me')]", 2, "contact me click");

        //Capture and split thank you message
        String result = ReusableMethods.captureTextMethod(driver, "//*[@class='alert alert-success']", "Capture and split thank you");
        String[] arrayResult = result.split(" ");
        System.out.println(arrayResult[0] + " " + arrayResult[1] + " " + arrayResult[2] + " " + arrayResult[3] + " " + arrayResult[4]);

        //close current tab
        driver.close();
        
    }// end of test 2

    @Test(dependsOnMethods = "fidelisCare_pt2")
    public void fidelisCare_pt3() {

        //switch tabs
        ReusableMethods.switchTabByIndexMethod(driver, "0", "switch tab");

        //click on login
        ReusableMethods.clickMethod(driver, "//*[@class='dropdown-toggle']", "login click");

        //click on Member online portal
        ReusableMethods.clickMethod(driver, "//*[@class='link-external']", "Member online portal click");

        //switch tabs
        ReusableMethods.switchTabByIndexMethod(driver, "1", "switch tab");

        //capture and print "Helpful Hints"
        String result = ReusableMethods.captureTextMethod(driver, "//*[contains(text(),'Helpful Hints')]", "Capture and split Helpful Hints");
        String[] arrayResult = result.split(" ");
        System.out.println(arrayResult[0]+ " " + arrayResult[1]);

        //close tab
        driver.close();
    }// end of test 3

}//end of class
