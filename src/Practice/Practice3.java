package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[9]/a/div/div[1]/h1")).click();

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/p"));

        driver.findElements(By.xpath("/html/body/div/div[2]/div/div[1]/p/b"));
        driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
    }
}
