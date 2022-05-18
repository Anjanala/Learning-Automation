import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.IOException;

public class QRcode1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qrgenerator.technologychannel.org/");


        WebElement username = driver.findElement(By.xpath("//*[@id=\"input\"]"));
        username.sendKeys("Learning Selenium");
        Thread.sleep( 2000);


        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\hello\\Learning java.png"));





    }
}
