package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class Practiue2 {
    public static void main(String[] args)  {
        System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[8]/a/div/div[1]/h1")).click();


        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/p")).click();

    }
}
