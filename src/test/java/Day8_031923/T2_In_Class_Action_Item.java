package Day8_031923;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class T2_In_Class_Action_Item {
    public static void main(String[] args) throws InterruptedException {
        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();

        //add --kiosk for mac
        //options.addArguments("--kiosk");

        //add incognito mode to option
        options.addArguments("incognito");

        //add options to run your driver on the background(headless)
        //options.addArguments("headless");

        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //Arraylist of US cities destinations
        ArrayList<String> destinations = new ArrayList<>();
        destinations.add("New York");
        destinations.add("Tokyo");
        destinations.add("San Diego");

        //navigate to hotels.com page
        driver.navigate().to("https://www.hotels.com");

        Thread.sleep(2000);

        //button to increase and decrease amount of adults and children
        ArrayList<WebElement> travelerBtn = new ArrayList<>(driver.findElements((By.xpath("//*[@class='uitk-layout-flex-item uitk-step-input-touch-target']"))));

        //for loop
        for (int i = 0; i < destinations.size(); i++) {

            //Click on search field
            try {
                driver.findElement(By.xpath("//*[@data-stid='destination_form_field-menu-trigger']")).click();
                System.out.println("Successfully clicked search button");
            } catch (Exception e) {
                System.out.println("Failed clicked search button");
            }//end of search exception

            //clear search field
            try {
                driver.findElement(By.xpath("//*[@id='destination_form_field']")).clear();
                System.out.println("Successfully cleared the search button");
            } catch (Exception e) {
                System.out.println("Failed clearing search button");
            }//end of clear search exception


            //Typing within search field
            try {
                driver.findElement(By.xpath("//*[@id='destination_form_field']")).sendKeys(destinations.get(i));
                System.out.println("Successfully typed within the search button");
            } catch (Exception e) {
                System.out.println("Failed typing within search button");
            }//end of typing exception

            Thread.sleep(2000);

            //Submitting search field
            try {
                WebElement submitSearch = driver.findElements(By.xpath("//*[@class='uitk-action-list-item-content']")).get(0);
                submitSearch.click();
                System.out.println("Successfully submitted search");
            } catch (Exception e) {
                System.out.println("Failed to submit search");
            }//end of typing exception

            Thread.sleep(2000);

            //click on adult list
            try {
                driver.findElement(By.xpath("//*[@class='uitk-menu-trigger uitk-fake-input uitk-form-field-trigger']")).click();
                System.out.println("Successfully clicked on adult list");
            } catch (Exception e) {
                System.out.println("Failed to click on adult list");
            }//end of clicking adult list exception

            Thread.sleep(2000);

            // change adult list to 1
            try {
                travelerBtn.get(0).click();
                System.out.println("Successfully changed adult list to 1");
            } catch (Exception e) {
                System.out.println("Failed to change adult list 1");
            }//end of adult list change to 1 exception

            Thread.sleep(2000);

            //change children list to 1
            try {
                travelerBtn.get(3).click();
                System.out.println("Successfully change child list to 1");
            } catch (Exception e) {
                System.out.println("Failed to change child list to 1");
            }//end of changing child list to 1 exception

            //dropdown for child age
            WebElement childAge = (WebElement) driver.findElement(By.xpath("//*[@name='child-traveler_selector_children_age_selector-0-0']"));
            //call select function to store the dropdown locator
            Select startChildAgeDropdown = new Select(childAge);

            try {
                //Selecting child age by visible text
                startChildAgeDropdown.selectByVisibleText("10");
                System.out.println("Successfully used dropdown");
            } catch (Exception e) {
                System.out.println("Failed to use dropdown");
            } //End of dropdown exception

            //click on done button
            try {
                driver.findElement(By.xpath("//*[@id='traveler_selector_done_button']")).click();
                System.out.println("Successfully clicked on done button");
            } catch (Exception e) {
                System.out.println("Failed to click on done button");
            }//end of clicking done button exception

            //click on search button
            try {
                driver.findElement(By.xpath("//*[@id='search_button']")).click();
                System.out.println("Successfully clicked on search button");
            } catch (Exception e) {
                System.out.println("Failed to click on search button");
            }//end of clicking search button exception

            Thread.sleep(2000);


            //click on resort link
            try { WebElement resortLink = driver.findElements(By.xpath("//*[@class='uitk-card-link']")).get(1);
                resortLink.click();
                System.out.println("Successfully clicked link");
            } catch (Exception e) {
                System.out.println("Failed to click link");
            }//end of clicking resort link exception

            Thread.sleep(5000);

            //capture the name of the resort
            try {
                String resortName = driver.findElement(By.xpath("//*[@data-stid='content-hotel-title']")).getText();
                System.out.println(resortName + "Successfully captured resort name");
            }catch (Exception e){
                System.out.println("Failed to capture resort name");
            }//end of capturing name


                //call the window handles in array list
            //ArrayList<String> tabs =new ArrayList<>(driver.getWindowHandles());
            //switch to the new tab by index of 1
           // driver.switchTo().window(tabs.get(2));

            //click on reserve now
            try {WebElement reserveNow = driver.findElements(By.xpath("//*[@data-stid='submit-hotel-reserve']")).get(0);
                reserveNow.click();
                System.out.println("Successfully clicked reserve now");
            } catch (Exception e) {
                System.out.println("Failed to reserve now");
            }//end of clicking resort link exception



        }//end of for loop


    }//end of main
}//end of class
