package stepDefs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[text()='Log in'])[1]")
    public WebElement initialLogin;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement pwd;

    @FindBy(xpath = "//*[@value='Log in']")
    public WebElement loginButtn;

    public void clickLoginInitialButton() {
        initialLogin.click();
    }

    public void clickLoginButton() {
        loginButtn.click();
    }

    public void captureEmail(String uname) {
        email.sendKeys(uname);
    }

    public void capturePassword(String password) {
        pwd.sendKeys(password);
    }


}
