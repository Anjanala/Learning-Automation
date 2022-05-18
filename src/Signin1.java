import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin1 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bishworaj100.github.io/reactloginapp/");


        WebElement username = driver.findElement(By.id("mui-1"));
        username.sendKeys("admin");


        WebElement password = driver.findElement(By.id("mui-2"));
        password.sendKeys("admin");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

    }
}
