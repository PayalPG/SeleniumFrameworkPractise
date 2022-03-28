package academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebDriver driver;
    By signin = By.cssSelector("a[href*='sign_in']");

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }


    public WebElement getSigninLink(){
        return driver.findElement(signin);
    }
}
