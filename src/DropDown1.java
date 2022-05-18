import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
                Thread.sleep(2000);
        Select s = new Select(driver.findElement(By.id("dropdowm-menu-1")));
        s.selectByIndex(3);
Thread.sleep(2000);
        WebElement s1=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[4]"));
        s1.click();

    }

}
