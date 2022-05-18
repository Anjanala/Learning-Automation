import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class CloseClick1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com");

driver.manage().window().maximize();
        WebElement buttonclick = driver.findElement(By.xpath("//*[@id=\"button-clicks\"]/div/div[1]/h1"));
        buttonclick.click();
        ArrayList tabs=new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));

        WebElement SearchBox = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
        SearchBox.click();
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        button.click();
        driver.close();



    }
}
