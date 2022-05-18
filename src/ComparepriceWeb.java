import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ComparepriceWeb {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/itm/194972132153?epid=25053112677&_trkparms=ispr%3D1&hash=item2d653ea339:g:Qr0AAOSwf79iVH1p:sc:ShippingMethodExpress!27502!US!-1&amdata=enc%3AAQAHAAAA4MEBScNPfNrT2EMP3Gmc6IwX421U33W5PVO7k2JjmXYWasTXN1EEzXRSvwZaQmoX15hkOtI%2BFPqpFsQt5%2Fozy730%2By%2B3QxDGcZ9VC6aQgdIASP%2F5DRwVCtkNJf0vBOWxywXetKqX6j4%2Fk5GLfSEfP8MPwu49qJxBQ5Y0tANIa761uiqjodD%2FYy%2FabcNPPpazVetu7BrDUMZ" +
                "WqCxkxRWRW1I4zpwSG75kWVsYr0jJrdXlsgJXeMqR9oHdeOWLaeL9cb04x%2Bmh6sHLhgAhV3HCiqyyIKZGxkGjYjHoZKXHSk1b%7Ctkp%3ABFBMwuC9yZZg");
        String price1 = driver.findElement(By.xpath("//*[@id=\"prcIsum\"]")).getText();


        System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/Flagship-Acer-Chromebook-Processor-Microfiber/dp/B09X639ZWS/ref=sr_1_1_sspa?crid=1BGRC77O20KQA&keywords=acer+chromebook&qid=1652298044&sprefix=%2Caps%2C158&sr=8-1-spons&psc=1&smid=A2HR3WADFB8IU9&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUExRERBT1REOEZJQVo2JmVuY3J5cHRlZElkPUEwMTY0MDkzMUpXQTU1TlAxRDI3WSZlbmNyeXB0ZWRBZElkPUExMDAyOTM2OFMzUFMwM1NaWTQwJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
        String price2 = driver.findElement(By.xpath("//*[@id=\"corePriceDisplay_desktop_feature_div\"]/div[1]/span/span[2]/span[2]")).getText();


        price1 = price1.replace("$", "");
        price1 = price1.replace("US", "");
        price2 = price2.replace("$", "");
        System.out.println("Price of Acer Chrome book in Ebay " + price1);
        System.out.println("Price of Acer Chrome Book In Amazon " + price2);

        Double p1 = Double.parseDouble(price1);
        Double p2 = Double.parseDouble(price2);

        if (p1 < p2) {
            System.out.println("Amazon price is less than ebay price by " + (p2 - p1));
        } else {
            System.out.println("Ebay price is less than amazon price by " + (p1 - p2));
        }


    }

}

