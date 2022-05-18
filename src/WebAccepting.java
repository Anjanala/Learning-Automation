import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Scanner;

public class WebAccepting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name: ");
        String bookName = sc.nextLine();


        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();



// Check on Amazon
        driver.get("https://www.amazon.com");
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement amazonSearch = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearch.sendKeys(bookName);
        amazonSearch.submit();

        String whole = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[3]/div[1]/div[1]/div[2]/a/span/span[2]/span[2]")).getText();
        String decimal = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[3]/div[1]/div[1]/div[2]/a/span/span[2]/span[3]")).getText();

        String amazonPrice = whole + "." +decimal;

// Check on Ebay
        driver.get("https://www.ebay.com");
                WebElement ebaySearchBox = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        ebaySearchBox.sendKeys(bookName);
        ebaySearchBox.submit();

        String ebayPrice = driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/div[2]/div[1]/span")).getText();
// Removing $ from ebay price
        ebayPrice = ebayPrice.replace("$","");

//Calculate and Display
// Convert to double
        Double ebayP = Double.parseDouble(ebayPrice);
        Double amazonP = Double.parseDouble(amazonPrice);

        System.out.println("Price from Amazon: "+amazonPrice);
        System.out.println("Price from Ebay: "+ebayPrice);

        if(amazonP < ebayP){
            System.out.println("Amazon price is less than ebay price by "+(amazonP-ebayP));
        }else{
            System.out.println("Ebay price is less than amazon price by "+(ebayP-amazonP));
        }

    }
}
