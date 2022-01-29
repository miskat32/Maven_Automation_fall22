package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.transform.Result;
import java.sql.Driver;

public class Automation_02 {
    public static void main(String[] args) throws InterruptedException {
        //search multiple cities and each time capture the search number from the result page
        //set an array
        String[] cities = new String[6];
        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "Manhattan";
        cities[3] = "Bronx";
        cities[4] = "Staten island";
        cities[5] = "long island";


        //define the outside for loop
        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        for (int i = 0; i < cities.length; i++)

        { //navigate to google search page
            driver.navigate().to("https://www.bing.com");
            //maximize the browser
            driver.manage().window().maximize();
            //put few seconds wait
            Thread.sleep(3000);
            //identify the search filed and enter a keyword 'city'
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities[i]);
            //put few seconds wait1
            Thread.sleep(3000);
            //hit submit on search icon
            driver.findElement(By.xpath("//*[@id='sb_form_go']")).submit();
            //put few seconds wait
            Thread.sleep(2500);
            //chapter the search  result and only print out the number
            String result = driver.findElement(By.xpath("//*[@id='b_tween']")).getText();
            System.out.println("My full result is " + result);
            //extract the number from the search result print it using split
            String[] arrayResult = result.split(" ");
            System.out.println("My search number is " + arrayResult[0]);
        }//end of loop
        driver.quit();
    }//end of main
}//end of class

