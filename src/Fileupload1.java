import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Fileupload1 {
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://webdriveruniversity.com/");

            driver.manage().window().maximize();

            driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).click();

            ArrayList tabs = new ArrayList(driver.getWindowHandles());
            driver.switchTo().window((String) tabs.get(1));
            Thread.sleep(5000);


            driver.findElement(By.id("myFile")).sendKeys("C:/hello/screenshot.png");
            driver.findElement(By.id("submit-button")).click();


        }
}
