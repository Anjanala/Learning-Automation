import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;

public class Openwebsite {
    //Open amazon.com and save its title to the sitename.txt file.
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        String sitename= driver.getTitle();
            try {
                FileWriter myWriter = new FileWriter("sitename.txt");
                myWriter.write(sitename);
                myWriter.close();
                System.out.println("Write to file successful.");
            } catch (Exception e) {
                System.out.println("Error "+e.getMessage());
            }
        }




    }

