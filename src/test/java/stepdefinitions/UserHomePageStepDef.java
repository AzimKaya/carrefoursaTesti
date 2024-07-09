package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import pages.Base;
import pages.UserHomePage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;
import static org.junit.Assert.*;
public class UserHomePageStepDef extends Base {
        UserHomePage userHomePage =new UserHomePage();
    @Given("Go to {string}")
    public void go_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Given("Clicks the Login buttonLink on the home page")
    public void clicks_the_login_button_link_on_the_home_page() {
        ReusableMethods.wait(2);
        ReusableMethods.clickAndVerify(userHomePage.linkLogin);
        userHomePage.cookie.click();

    }
    @Given("Login by entering valid {string} and {string} on the SignIn page.")
    public void login_by_entering_valid_and_on_the_sign_ın_page(String email, String password) {
        ReusableMethods.wait(2);
        ReusableMethods.loginUser(ConfigReader.getProperty(email), ConfigReader.getProperty(password));
        ReusableMethods.wait(2);
        ReusableMethods.clickAndVerify(userHomePage.discoverClose);
    }
    @Then("The page scrolls down until the social media icons.")
    public void the_page_scrolls_down_until_the_social_media_icons() {
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",userHomePage.linkFacebook);
    }
    @Given("Verify that the body redirect buttons {string},{string},{string},{string},{string},are working.")
    public void clickButton(String Facebook, String YouTube, String Twitter, String Linkedin, String Instagram) {
        String[] buttonArray = new String[]{"Facebook", "YouTube", "Twitter", "Linkedin", "Instagram",};
        for (String button : buttonArray) {
            switch (button) {
                case "Facebook":
                    ReusableMethods.wait(2);
                    ReusableMethods.clickAndVerify(userHomePage.linkFacebook);
                    expectedUrl = "https://www.facebook.com/carrefoursa";
                    actualUrl = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrl, actualUrl);
                    ReusableMethods.wait(2);
                    Driver.getDriver().navigate().back();
                    break;
                case "YouTube":
                    ReusableMethods.clickAndVerify(userHomePage.linkYouTube);
                    expectedUrl = "https://www.youtube.com/user/CarrefourSATurkiye";
                    actualUrl = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrl, actualUrl);
                    ReusableMethods.wait(2);
                    Driver.getDriver().navigate().back();
                    break;
                case "Twitter":
                    ReusableMethods.clickAndVerify(userHomePage.linkTwitter);
                    expectedUrl = "https://x.com/CarrefourSA";
                    actualUrl = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrl, actualUrl);
                    ReusableMethods.wait(2);
                    Driver.getDriver().navigate().back();
                    break;
                case "Linkedin":
                    ReusableMethods.clickAndVerify(userHomePage.linkLinkedin);
                    expectedUrl = "https://www.linkedin.com/company/carrefoursa?trk=prof-exp-company-name";
                    actualUrl = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrl, actualUrl);
                    ReusableMethods.wait(3);
                    Driver.getDriver().navigate().back();
                    break;
                case "Instagram":
                    ReusableMethods.clickAndVerify(userHomePage.linkInstagram);
                    expectedUrl = "https://www.instagram.com/carrefoursa/";
                    actualUrl = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrl, actualUrl);
                    ReusableMethods.wait(2);
                    Driver.getDriver().navigate().back();
                    Driver.quitDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid button name");
            }
        }
    }

    @Then("All Categories in the nav bar on the home page that the drop-down menu is visible verify.")
    public void all_categories_in_the_nav_bar_on_the_home_page_that_the_drop_down_menu_is_visible_verify() {

        ReusableMethods.clickAndVerify(userHomePage.katogoriler);

    }
    @Then("Go to the All Categories dropdown menu click.")
    public void go_to_the_all_categories_dropdown_menu_click() {
        /*
        ReusableMethods.clickAndVerify(userHomePage.karfursaÖzel);
        ReusableMethods.clickAndVerify(userHomePage.katogoriler);
        ReusableMethods.clickAndVerify(userHomePage.gıdaSekerleme);

         */

        userHomePage.karfursaÖzel.click();
        userHomePage.katogoriler.click();
        userHomePage.gıdaSekerleme.click();

    }


}












