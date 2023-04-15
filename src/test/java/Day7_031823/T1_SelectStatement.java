package Day7_031823;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_SelectStatement {
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

        //navigate to yahoo home page
        driver.navigate().to("https://www.mortgagecalculator.org");

        Thread.sleep(2000);

        //select start month as april from the dropdown using select selenium
        //store the start month locator as an WebElement
        WebElement strMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));

        //call select function to store the dropdown locator
        Select startMonthDropdown = new Select(strMonth);

        //Select visible text
        startMonthDropdown.selectByVisibleText("Apr");

        //select by value
        //startMonthDropdown.selectByValue("4");

        //select by Index
        //startMonthDropdown.selectByIndex(3);

    }//end of main
}//end of class
