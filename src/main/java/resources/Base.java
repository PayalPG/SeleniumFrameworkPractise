package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public WebDriver driver;

    public WebDriver initializeDriver() {
        Properties props = new Properties();
        try {
            FileInputStream fis = new FileInputStream("/Users/akash/IdeaProjects/FrameworkPractise/src/main/java/resources/data.properties");
            props.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String browserName = props.getProperty("browser");
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/akash/IdeaProjects/SeleniumPractice/Drivers/chromedriver");
            driver = new ChromeDriver();
        } else if (browserName.equals("safari")) {

        } else {

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
