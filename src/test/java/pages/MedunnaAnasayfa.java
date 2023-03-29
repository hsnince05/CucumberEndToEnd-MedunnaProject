package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaAnasayfa {

    public MedunnaAnasayfa(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@data-icon='user']")
    public WebElement kullaniciSimgesi;

    @FindBy(id = "login-item")
    public WebElement SignInAlani;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement SingInButton;

    @FindBy(xpath = "//text()[.='User management']")
    public WebElement kullaniciAdi;



}
