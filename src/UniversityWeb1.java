import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniversityWeb1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");


        WebElement SearchBox = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
        SearchBox.click();
        Thread.sleep(2000);
        WebElement button= driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        button.click();

        driver.close();

    }
}
