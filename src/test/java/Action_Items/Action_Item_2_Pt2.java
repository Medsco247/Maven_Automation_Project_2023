package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Action_Item_2_Pt2 {
    public static void main(String[] args) throws InterruptedException {
        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver that you will use for automation test
        WebDriver driver = new ChromeDriver();

// ArrayList of sports
        ArrayList<String> sports = new ArrayList<>();
        sports.add("basketball");
        sports.add("football");
        sports.add("golf");
        sports.add("hockey");


        for (int i = 0; i < sports.size(); i++) {
            //navigate to bing home page
            driver.navigate().to("https://www.bing.com");

            //wait for 2 seconds
            Thread.sleep(2000);

            //enter sport in to search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sports.get(i));

            //click on Bing search button
            driver.findElement(By.xpath("//*[@name='search']")).submit();

            // //wait for 2 seconds
            Thread.sleep(2000);

            //capture the search results using .getText()
            String result = driver.findElement(By.xpath("//*[@id='b_tween']")).getText();

            //print out only the number
            String[] arrayResult = result.split(" ");
            System.out.println("For " + sports.get(i) + " the search number is about " + arrayResult[1]);

        }//end of loop

// quit/close the driver
        driver.quit();

    }//end of main
}//end of class

