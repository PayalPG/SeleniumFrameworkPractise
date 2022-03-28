package academy;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import resources.Base;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends Base {

    public WebDriver driver;
    @Test
    public void signin() throws InterruptedException {
        driver = initializeDriver();
        driver.get("https://qaclickacademy.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        HomePage homePage=new HomePage(driver);
        homePage.getSigninLink().click();
        Thread.sleep(5000);

        Actions enter = new Actions(driver);
        enter.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(4000);
        homePage.getSigninLink().click();
        Thread.sleep(2000);

    }

}
