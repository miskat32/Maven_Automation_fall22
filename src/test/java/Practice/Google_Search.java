package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {
    public static void main(String[] args) throws InterruptedException {
        //search multiple cities and each time capture the search number from the result page
        //set an array
        String[] cities = new String[4];
        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "Manhattan";
        cities[3] = "Bronx";
        //define the outside for loop
        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        for (int i = 0; i < cities.length; i++) {

         //simply open the google
         driver.navigate().to("https://www.google.com");
         //maximized it
            driver.manage().window().maximize();
            // wait
            Thread.sleep(3000);
            //searching for cities on google search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities[i]);

            //hit submit on google search button
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();

            //wait
            Thread.sleep(2000);

            //capture  the search result and store it as a variable
            String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

            //declaring the array variable to split the result
           String[] arrayResult = result.split(" ");

           //now print the search number only
            System.out.println("My search number for City " +cities[i] + " is " + arrayResult[1]);

        }//end of loop
        driver.quit();

    }//end of main
}//end of class
