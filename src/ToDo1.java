import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDo1 {
    public static void main(String[] args) throws InterruptedException {
        String [] names= {"Ram","Shyam","Hari"};
        System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");


        WebElement inputBox = driver.findElement(By.tagName("input"));
        for (String name: names){
            inputBox.sendKeys(name);
            inputBox.sendKeys(Keys.RETURN);

            Thread.sleep(5000);

          //WebElement InputBox= driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[4]"));

           // JavascriptExecutor js = (JavascriptExecutor)driver;
            //js.executeScript("delete");

    }


    }
}

