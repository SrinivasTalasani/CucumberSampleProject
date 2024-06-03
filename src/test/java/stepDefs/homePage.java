package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    WebDriver driver;

    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@href='/computers'])[3]")
    public WebElement selcomputer;

    @FindBy(xpath = "(//a[@href='/desktops'])[3]")
    public WebElement selDesktop;

    @FindBy(xpath = "(//*[@value='Add to cart'])[1]")
    public WebElement Atc1;


    @FindBy(xpath = "(//*[@value='Add to cart'])[1]")
    public WebElement Atc2;

    @FindBy(xpath = "(//*[text()='Shopping cart'])[1]")
    public WebElement shoppingct;

    @FindBy(xpath = "(//*[@type='checkbox'])[1]")
    public WebElement chkbox1;

    @FindBy(xpath = "(//*[@type='checkbox'])[2]")
    public WebElement chkbox2;

    @FindBy(name = "checkout")
    public WebElement chkout;

    @FindBy(xpath = "//*[@title='Continue']")
    public WebElement cont1;

    @FindBy(xpath = "(//*[@title='Continue'])[2]")
    public WebElement cont2;

    @FindBy(xpath = "(//*[@value='Continue'])[3]")
    public WebElement cont3;

    @FindBy(xpath = "(//*[@value='Continue'])[4]")
    public WebElement cont4;

    @FindBy(xpath = "(//*[@value='Continue'])[5]")
    public WebElement cont5;

    @FindBy(xpath = "//*[@value='Confirm']")
    public WebElement confm;

    @FindBy(xpath = "//ul[@class='details']/li")
    public WebElement ornum;


    public void selectcomputer() {
        selcomputer.click();
    }

    public void selectDesktop() {
        selDesktop.click();
    }

    public void Acceptts() {
        Atc1.click();
    }

    public void Acceptts2() {
        Atc2.click();
    }

    public void shoppingcart() {
        shoppingct.click();
    }

    public void checkbox1() {
        chkbox1.click();
    }

    public void checkbox2() {
        chkbox2.click();
    }

    public void checkout() {
        chkout.click();
    }

    public void continue1() {
        cont1.click();
    }

    public void continue2() {
        cont2.click();
    }

    public void continue3() {
        cont3.click();
    }

    public void continue4() {
        cont4.click();
    }

    public void continue5() {
        cont5.click();
    }

    public void confirm() {
        confm.click();
    }

    public void orderNum() {
        confm.click();
    }
}
