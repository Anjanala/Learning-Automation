import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin3 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");


        WebElement username = driver.findElement(By.id("text"));
        username.sendKeys("admin");


        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("admin");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();


    }
}
