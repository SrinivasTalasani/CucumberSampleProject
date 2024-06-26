package stepDefs;

import io.cucumber.java.Before;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps {
    WebDriver driver;

    @Before
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser() {
        driver.close();
    }

    @Given("^I am on the Google search page$")
    public void iAmOnTheGoogleSearchPage() {

        driver.get("https://www.google.com/");

    }

    /**
     * @throws InterruptedException
     */
    @When("^I enter cucumber selenium in the search box$")
    public void i_enter_cucumber_selenium_in_the_search_box() throws InterruptedException {
        System.out.println("ddd");
        //driver.wait(2000);
        driver.findElement(By.name("q")).sendKeys("Cucumber Selenium" + Keys.ENTER);

//        WebElement m = driver.findElement(By.name("q"));
//        m.sendKeys("Cucumber Selenium");
//        m.sendKeys(Keys.ENTER);
    }

    /*
     * @When("I click the search button") public void iClickTheSearchButton() throws
     * InterruptedException { driver.wait(1000);
     * driver.findElement(By.name("btnK")).click(); }
     */
    @Then("I should see search results related to cucumber selenium")
    public void iShouldSeeSearchResultsRelatedTo() {
        String pageTitle = driver.getTitle();
        assert (pageTitle.contains("Cucumber Selenium"));
    }

//    @After(order = 1) // Cucumber After Hook with order 1
//    public void takeScreenShotOnFailedScenario(Scenario scenario) {
//
//        System.out.println("This is from After hook, order=1");
//        if ((scenario.isFailed())) {
//            final byte[] screenshot =
//                    ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName());
//        }
//    }
}
