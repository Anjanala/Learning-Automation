import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search1 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //Web id or name by left click inspect box and the search box and copy
        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("camera");
        searchbox.submit();
    }
}
