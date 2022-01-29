package Day_09_01082022;

import org.openqa.selenium.WebDriver;

public class UPS_ReusableMethod {
    public static void main(String[] args) {
        WebDriver driver = Reusable_Actions.setDriver();

        //navigate to ups
        driver.navigate().to("https://www.ups.com/us");
        //click on Track
        Reusable_Actions.clickMethod(driver,"//*[text()= Tracking']","Track");
        //click on track a package
        Reusable_Actions.clickMethod(driver,"//*[text()='Track a package']","Track a Package");


    }//end of test
}//end of class
