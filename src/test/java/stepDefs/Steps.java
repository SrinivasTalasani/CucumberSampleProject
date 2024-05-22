package stepDefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.SQLOutput;


public class Steps {
    WebDriver driver;

    @Before
    public void launchBrowser() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\Drivers\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\srini\\Drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser() {
        driver.close();
    }





    @Given("User Logged in to the shopping cart")
    public void userLoggedInToTheShoppingCart() {

        driver.get("https://demowebshop.tricentis.com/");


    }

    @When("User go to computer menu and select desktops")
    public void userGoToComputerMenuAndSelectDesktops() {
        driver.findElement(By.xpath("(//*[text()='Log in'])[1]")).click();
        driver.findElement(By.id("Email")).sendKeys("srinitalasani@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Sriraju@5");
        driver.findElement(By.xpath("//*[@value='Log in']")).click();
        driver.findElement(By.xpath("(//a[@href='/computers'])[3]")).click();
        driver.findElement(By.xpath("(//a[@href='/desktops'])[3]")).click();


    }

    @And("User chooses build you own cheap computer")
    public void userChoosesBuildYouOwnCheapComputer() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
//        WebElement element = driver.findElement(By.xpath("//*[text()='Build your own cheap computer']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
     Thread.sleep(3000);
      //  driver.findElement(By.xpath("//*[text()='Build your own cheap computer']")).click();

    }

    @And("User add it to cart and accept Ts and Cs and checkout")
    public void userAddItToCartAndAcceptTsAndCsAndCheckout() throws InterruptedException {
        driver.findElement(By.xpath("(//*[@value='Add to cart'])[1]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@value='Add to cart'])[1]")).click();
        driver.findElement(By.xpath("(//*[text()='Shopping cart'])[1]")).click();
        driver.findElement(By.xpath("(//*[@type='checkbox'])[1]")).click();
        driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("checkout")).click();


    }

    @And("User Complete billing and shipping details and chooses payment method as COD")
    public void userCompleteBillingAndShippingDetailsAndChoosesPaymentMethodAsCOD() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//*[@class='valid']")).click();
//        driver.findElement(By.xpath("//*[text()='Alaska']")).click();
//        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("abcd");
//        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("abcd");
//        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("12345");
//        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("09876788999");



        driver.findElement(By.xpath("//*[@title='Continue']")).click();
        Thread.sleep(3000);


        driver.findElement(By.xpath("(//*[@title='Continue'])[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//*[@value='Continue'])[3]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//*[@value='Continue'])[4]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//*[@value='Continue'])[5]")).click();



    }

    @Then("User confirms Orders and capture order number")
    public void userConfirmsOrdersAndCaptureOrderNumber() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@value='Confirm']")).click();
        Thread.sleep(6000);
       String orNumber= driver.findElement(By.xpath("//ul[@class='details']/li")).getText();
        System.out.println(orNumber);


    }


}
