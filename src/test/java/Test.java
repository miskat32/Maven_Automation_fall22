import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(); // why this exists?/
        //simply open the google web site
        driver.navigate().to("https://www.amazon.com");

        //maximize my browser

        driver.manage().window().maximize(); //for windows

        Thread.sleep(10000);

        //searching for laptop on google search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("a-page");

        //hit submit on google search button
        driver.findElement(By.xpath("//*[@value='Google Search']")).submit();
        //another wait statement since we come to a new page (result page )
        //capture  the search result and store it as a variable
        String result = driver.findElement(By.xpath("//*[@id='a-page']")).getText();
        //declaring the array variable to split the result
        String[] arrayResult = result.split( " ");
        //now print the search number only
        System.out.println("My search result is " + arrayResult[1]);


        //close it
        driver.close();
        driver.quit();


    }//end of main

}//end of class




