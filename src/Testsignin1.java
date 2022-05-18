//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//public class Testsignin1 {
//
//    public class TestRunner {
//        WebDriver driver = new ChromeDriver();
//
//        @Given("Open Google Chrome")
//        public void open_google_chrome() {
//            Testsignin1.gotoGoogle();
//            driver.get("https://bishworaj100.github.io/reactloginapp/&quot");
//        }
//        @When("I Enter Valid Email And Password")
//        public void i_enter_valid_email_and_password() {
//            driver.findElement(By.id("mui-1")).sendKeys("admin");
//            driver.findElement(By.id("mui-2")).sendKeys("admin");
//        }
//        @Then("User Should Be Able to Login")
//        public void user_should_be_able_to_login() {
//            driver.findElement(By.tagName("button")).click();
//            String result = driver.findElement(By.tagName("h4")).getText();
//            if(result.equals("Login info is correct")){
//                System.out.println("Login is correct");
//            }else{
//                System.out.println("Test failed.");
//            }
//        }
//
//    }
//}
