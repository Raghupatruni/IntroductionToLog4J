package Steps;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Google {
    public static void main(String[] args) {

        // Here we need to create logger instance so we need to pass Class name for
        //which  we want to create log file in my case Google is classname
        Logger logger = Logger.getLogger("Google");
        // configure log4j properties file
        PropertyConfigurator.configure("Log4j.properties");


        // Open browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nisum\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        logger.info("Browser Opened");
        logger.warn("This is test warning");

//        // Set implicit wait
//
//        logger.info("Implicit wait given");


        // Load application
        driver.get("https://www.google.co.in/");
        logger.info("Url opened");


        // type Selenium
        driver.findElement(By.name("q")).sendKeys("Selenium");
        logger.info("keyword type");
    }
}