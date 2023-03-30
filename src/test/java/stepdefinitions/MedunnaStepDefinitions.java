package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaAnasayfa;
import pages.MedunnaRoomPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class MedunnaStepDefinitions {

    MedunnaAnasayfa medunnaAnasayfa = new MedunnaAnasayfa();
    MedunnaRoomPage medunnaRoomPage = new MedunnaRoomPage();

    Integer number = Faker.instance().number().numberBetween(1000, 1000000);
    @Given("Kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        ReusableMethods.waitFor(2);
    }
    @When("Kullanici kullanici simgesi butonuna tiklar")
    public void kullanici_kullanici_simgesi_butonuna_tiklar() {

        medunnaAnasayfa.kullaniciSimgesi.click();
        ReusableMethods.waitFor(2);

    }
    @Then("Kullanici Sign in alanina tiklar")
    public void kullanici_sign_in_alanina_tiklar() {
        medunnaAnasayfa.SignInAlani.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici username girer")
    public void kullanici_username_girer() {
        medunnaAnasayfa.userName.sendKeys(ConfigReader.getProperty("medunnaUsername"));
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici password girer")
    public void kullanici_password_girer() {
        medunnaAnasayfa.password.sendKeys(ConfigReader.getProperty("medunnaPassword"));
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Sign in butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {
        medunnaAnasayfa.SingInButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici giris yaptigini dogrular")
    public void kullanici_giris_yaptigini_dogrular() {
        Assert.assertTrue(medunnaAnasayfa.kullaniciAdi.isDisplayed());
    }
    @Then("Kullanici Items&Titles alanina tiklar")
    public void kullanici_items_titles_alanina_tiklar() {
        medunnaAnasayfa.Items.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici acilan listede Room tiklar")
    public void kullanici_acilan_listede_room_tiklar() {
        medunnaAnasayfa.room.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici Create a new Room alanina tiklar")
    public void kullanici_create_a_new_room_alanina_tiklar() {
        medunnaRoomPage.createNewRoom.click();
        ReusableMethods.waitFor(1);

    }
    @Then("Kullanici Room Number alanina gecerli deger girer")
    public void kullanici_room_number_alanina_gecerli_deger_girer() {
        medunnaRoomPage.roomNumber.sendKeys(number.toString());
        ReusableMethods.waitFor(1);

    }
    @Then("Kullanici Room Type TWIN olarak secer")
    public void kullanici_room_type_twin_olarak_secer() {
        Select select = new Select(medunnaRoomPage.RoomType);
        select.selectByVisibleText("TWIN");
        ReusableMethods.waitFor(2);

    }
    @Then("Kullanici Price alanina gecerli deger girer")
    public void kullanici_price_alanina_gecerli_deger_girer() {
        medunnaRoomPage.price.sendKeys("1905");
        ReusableMethods.waitFor(1);


    }
    @Then("Kullanici Description alanina gecerli deger girer")
    public void kullanici_description_alanina_gecerli_deger_girer() {
        medunnaRoomPage.Description.sendKeys("Gariban Hasta Odasi");
        ReusableMethods.waitFor(2);

    }
    @Then("Kullanici Save alanina tiklar")
    public void kullanici_save_alanina_tiklar() {
        medunnaRoomPage.saveButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici Rooms sayfasinda Created Date'a tiklayarak odalari olusturma tarihine gore siralar")
    public void kullanici_rooms_sayfasinda_created_date_a_tiklayarak_odalari_olusturma_tarihine_gore_siralar() {
        medunnaRoomPage.CreatedDate.click();
        ReusableMethods.waitFor(2);

    }
    @Then("Kullanici odanin olustugunu dogrular")
    public void kullanici_odanin_olustugunu_dogrular() {
        assert medunnaRoomPage.tabloNumber.isDisplayed();
    }



}
