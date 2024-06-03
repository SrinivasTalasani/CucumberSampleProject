package stepDefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import org.openqa.selenium.*;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.edge.EdgeDriver;


public class Steps {
    WebDriver driver;
    homePage HomePage;
    loginPage login;

    public Steps() {
    }


    @Before
    public void launchBrowser() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\Drivers\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\srini\\Drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

//    @After
//    public void closeBrowser() {
//        driver.close();
//    }


    @Given("User Logged in to the shopping site with username {string} and password {string}")
    public void userLoggedInToTheShoppingSiteWithUsernameAndPassword(String uname, String password) throws InterruptedException {
        driver.get("https://demowebshop.tricentis.com/");
        login = new loginPage(driver);
        login.clickLoginInitialButton();
        Thread.sleep(2000);
        login.captureEmail(uname);
        login.capturePassword(password);
        login.clickLoginButton();

    }

    @When("User go to computer menu and select desktops")
    public void user_go_to_computer_menu_and_select_desktops() throws InterruptedException {
        Thread.sleep(2000);
        HomePage = new homePage(driver);
        HomePage.selectcomputer();
        Thread.sleep(2000);
        HomePage.selectDesktop();
    }

    @And("User chooses build you own cheap computer as {string}")
    public void userChoosesBuildYouOwnCheapComputerAs(String product) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(3000);
        HomePage = new homePage(driver);
        HomePage.Acceptts();
    }

    @And("User add it to cart and accept Ts and Cs and checkout")
    public void userAddItToCartAndAcceptTsAndCsAndCheckout() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(3000);
        HomePage = new homePage(driver);
        HomePage.Acceptts2();
        Thread.sleep(2000);
        HomePage.shoppingcart();
        Thread.sleep(2000);
        HomePage.checkbox1();
        Thread.sleep(2000);
        HomePage.checkbox2();
        Thread.sleep(2000);
        HomePage.checkout();
    }

    @And("User Complete billing and shipping details and chooses payment method as COD")
    public void userCompleteBillingAndShippingDetailsAndChoosesPaymentMethodAsCOD() throws InterruptedException {
//      This already registed user no need to give address details. We tried to create new user but was j=not possible
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//*[@class='valid']")).click();
//        driver.findElement(By.xpath("//*[text()='Alaska']")).click();
//        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("abcd");
//        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("abcd");
//        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("12345");
//        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("09876788999");
        Thread.sleep(3000);
        HomePage = new homePage(driver);
        HomePage.continue1();
        Thread.sleep(3000);
        HomePage.continue2();
        Thread.sleep(3000);
        HomePage.continue3();
        Thread.sleep(3000);
        HomePage.continue4();
        Thread.sleep(3000);
        HomePage.continue5();
    }

    @Then("User confirms Orders and capture order number")
    public void userConfirmsOrdersAndCaptureOrderNumber() throws InterruptedException {
        Thread.sleep(3000);
        HomePage = new homePage(driver);
        HomePage.confirm();
        Thread.sleep(3000);
        HomePage.orderNum();
    }


}
