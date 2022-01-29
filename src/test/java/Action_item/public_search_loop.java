package Action_item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class public_search_loop {
    public static void main(String[] args) throws InterruptedException {

        String[] hobby = new String[6];
        hobby[0] = "Fishing";
        hobby[1] = "Racing";
        hobby[2] = "Painting ";
        hobby[3] = "Gym";
        hobby[4] = "Drawing";
        hobby[5] = "Music";

        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        for (int i = 0; i < hobby.length; i++)
        {  //navigate to google search page
            driver.navigate().to("https://www.bing.com");
            //maximize the browser
            driver.manage().window().maximize();
            //put few seconds wait
            Thread.sleep(3000);
            //identify the search filed and enter a keyword 'hobby'
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(hobby[i]);
            //put few seconds wait1
            Thread.sleep(3000);
            //hit submit on search icon
            driver.findElement(By.xpath("//*[@id='sb_form_go']")).submit();
            //put few seconds wait
            Thread.sleep(2500);
            //chapter the search  result and only print out the number
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            System.out.println("My full result is " + result );
            //extract the number from the search result print it using split
            String[] arrayResult = result.split(" ");
            System.out.println("My search number for hobby " + hobby[i] + " is " + arrayResult[0]);

        }//end of loop
        driver.quit();
    }//end of main
}//end of java class
