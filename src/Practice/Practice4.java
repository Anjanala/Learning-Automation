package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;



public class Practice4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/");
//full screen
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"scrolling-around\"]")).click();

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));
        WebElement scroll1 = driver.findElement(By.xpath("//*[@id=\"zone1\"]"));

        WebElement scroll2 = driver.findElement(By.xpath("//*[@id=\"zone2-entries\"]"));

//Creating object of an Actions class
        Actions action = new Actions(driver);
        Thread.sleep(5000);
        //action.moveToElement(scroll1).perform();


//Performing the mouse hover action on the target element.
        for(int i=0;i<5;i++) {
            action.moveToElement(scroll1).perform();
            action.moveToElement(scroll2).perform();
        }

    }

        }







