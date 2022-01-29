package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_01 {
    public static void main(String[] args)
    {//set the property and path to the chromedriver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //define the chrome driver basically what driver im going to use for automation

        WebDriver driver = new ChromeDriver();

        //navigate to google search page
        driver.navigate().to("https:/www.google.com");

        //maximize the browser
        driver.manage().window().maximize();
        //close my browser
        driver.close();



    }//end of main
}//end of java class
