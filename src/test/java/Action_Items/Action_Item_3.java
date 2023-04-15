package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Collection;

public class Action_Item_3 {
    public static void main(String[] args) throws InterruptedException {
//set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();

        //add --kiosk for mac
        options.addArguments("--kiosk");

        //add incognito mode to option
        options.addArguments("incognito");

        //add options to run your driver on the background(headless)
        //options.addArguments("headless");

        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //ArrayList of zipcodes
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("10703");
        zipCode.add("10467");
        zipCode.add("10460");

        for (int i = 0; i < zipCode.size(); i++) {
            //navigate to yahoo home page
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");

            Thread.sleep(2000);

            //click on find a workshop
            driver.findElement(By.xpath("//*[@class= 'menuItemIconWrapper-1Hrfo']")).click();

            Thread.sleep(2000);

            //click on In-person link
            driver.findElement(By.xpath("//*[@class= 'studioIcon-2TdMR']")).click();

            Thread.sleep(2000);

            //clear zipcode
            WebElement zCode = driver.findElement(By.xpath("//*[@class= 'input input-3TfT5']"));
            zCode.clear();

            //enter zipcode
            ((WebElement) zCode).sendKeys(zipCode.get(i));

            //click search arrow
            driver.findElement(By.xpath("//*[@class= 'rightArrow-daPRP']")).click();

            Thread.sleep(2000);

            // capturing all addresses and studios using WebElements arraylist
            ArrayList<WebElement> studio = new ArrayList<>(driver.findElements(By.xpath("//*[contains(text(),'WW Studio @')]")));
            ArrayList<WebElement> address = new ArrayList<>(driver.findElements(By.className("address-3-YC0")));

            //Capture and print address based on which studio it is
            if (i == 0) {
                System.out.println("First studio address is " + address.get(0).getText());
                studio.get(1).click();
            } else if (i == 1) {
                System.out.println("Second studio address is " + address.get(0).getText());
                studio.get(3).click();
            } else if (i == 2) {
                System.out.println("Third studio address is " + address.get(0).getText());
                studio.get(0).click();
            }//end of if statement

            // command to scroll on the webpage
            JavascriptExecutor jse = (JavascriptExecutor) driver;

            //scroll down to schedule table
            jse.executeScript("scroll(0,875)");

            Thread.sleep(1000);

            // Captures date and time for each studio
            String schedule = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']")).getText();
            System.out.println(" ");
            System.out.println("Date and time table: " + schedule);
        }//end of loop


    }//end of main
}//end of class
