import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Elements1 {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"page-object-model\"]/div/div[1]/h1")).click();

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));

        driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[2]/a")).click();

        List<WebElement> elements = driver.findElements(By.className("sub-heading"));
        int total = 0;

        for (WebElement e : elements) {
            System.out.println(e.getText());
            total = total + 1;


        }

    }
}
