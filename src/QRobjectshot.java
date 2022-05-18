import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class QRobjectshot {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qrgenerator.technologychannel.org/");

driver.manage().window().fullscreen();
        driver.findElement(By.cssSelector("#input")).sendKeys("learning Selenium");
        Thread.sleep( 2000);


        File src= ((TakesScreenshot)driver.findElement(By.tagName("canvas"))).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\hello\\QR.png"));
    }

}
