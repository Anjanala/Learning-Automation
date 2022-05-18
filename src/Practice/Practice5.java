package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Practice5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));


        driver.findElement(By.xpath("//*[@id=\"datepicker\"]/span/i")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[2]/td[1]")).click();
    }
}
