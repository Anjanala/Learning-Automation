package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.edge.driver", "c://edgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://webdriveruniversity.com");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[6]/a/div/div[1]/h1")).click();

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));

        driver.findElement(By.xpath("//*[@id=\"manual-testing-accordion\"]")).click();
Thread.sleep(2000);


    }
}
