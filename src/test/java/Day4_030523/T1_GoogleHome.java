package Day4_030523;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_GoogleHome {
    public static void main(String[] args) throws InterruptedException {

        //Set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver that you will use for automation test
        WebDriver driver = new ChromeDriver();

        //navigate to google home page
        driver.navigate().to("https://www.google.com");

        //maximize the browser
        //driver.manage().window.maximize(): //for windows
        driver.manage().window().fullscreen(); //for mac
        //wait for two seconds
        Thread.sleep(2000);

        //simply close the driver/browser
        //driver.close();

        //enter keyword bmw in search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("BMW");

        //click on google search
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

        //whenever you go to a new page or navigate, always use 2-3 seconds wait to pause your script a bit
        Thread.sleep(2000);

       //capture the search results using .getText()
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

       //System.out.println("Search results: " + result);
       //print out only the number
        String[] arrayResult = result.split(" ");
        System.out.println("Search Number: " + arrayResult[1]);


        System.out.println("Search Number: " + arrayResult[1] + " Seconds: " + arrayResult[3] + " " + arrayResult[4]);

        //simply close/quit the driver/browser
        driver.quit();

// String newResult = result.replace("(","").replace(")","");

    }//End of Main

}//End of Class
