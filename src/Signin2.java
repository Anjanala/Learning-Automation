import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");


        WebElement firstname = driver.findElement(By.name("first_name"));
        firstname.sendKeys("Anjana");



        WebElement lastname = driver.findElement(By.name("last_name"));
        lastname.sendKeys("Lamichhane");



        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("anjanalamichhane3@gmail.com");


        WebElement message = driver.findElement(By.name("message"));
        message.sendKeys("Awesome service.keep it up.");


        WebElement button=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        button.click();

        Thread.sleep(5000);



    }

    }
