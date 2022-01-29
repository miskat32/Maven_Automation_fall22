package Action_item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class action_item {
    public static void main(String[] args) throws InterruptedException {String[] cities = new String[6];
        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "Manhattan";
        cities[3] = "Bronx";
        cities[4] = "Long island ";
        cities[5] = "Staten island";

        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();
        for (int i = 0; i < cities.length; i++) {
            //declare and define the chrome options
            ChromeOptions options = new ChromeOptions();
            //declare all the arguments you need
            //to maximize my driver
            options.addArguments("start-maximized");
            //set as incognito mode
            options.addArguments("incognito");
            //set as headless(running the driver on background)
            options.addArguments("headless");

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
            System.out.println("My full result is " + result );
            //extract the number from the search result print it using split
            String[] arrayResult = result.split(" ");
            System.out.println("My search number for city" + cities[i] + " is " + arrayResult[0]);

        }//end of loop

        driver.quit();
        }//end of main
        }//end of java class
