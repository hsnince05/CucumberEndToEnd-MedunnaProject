package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MedunnaRoomPage {
    public MedunnaRoomPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createNewRoom;

    @FindBy(id = "room-roomNumber")
    public WebElement roomNumber;

    @FindBy(id = "room-roomType")
    public WebElement RoomType;

    @FindBy(id = "room-price")
    public WebElement price;
    @FindBy(id = "room-description")
    public WebElement Description;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//*[.='Created Date']")
    public WebElement CreatedDate;

    @FindBy(xpath = "//div//table//tbody//tr")
    public WebElement tabloNumber;



}
