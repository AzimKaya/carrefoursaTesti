package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class UserHomePage extends Base{
protected static utils.ReusableMethods ReusableMethods;

        @FindBy(xpath = "(//*[@href='javascript:void(0)'])[2]")
        public WebElement linkLogin;//Hompage ==>> Login button

        @FindBy(xpath = "//*[text()='Kabul Et']")
        public static WebElement cookie;//Login Home page ==>> Cookie button

        @FindBy(xpath = "//*[@id='j_username']")
        public static WebElement emailBoxLogin;//Login Home page ==>> Email address Text Box

        @FindBy(xpath = "(//*[text()='Giriş Yap'])[2]")
        public WebElement buttonEmailBoxSignIn;//Hompage  ==>> EmailBox SignIn button

        @FindBy(xpath = "//*[@id='emailPasswordInput']")
        public static WebElement passwordBox;//Login Home page ==>> Password  Text Box

        @FindBy(xpath = "//*[@id='emailPswConfimationBtn']")
        public WebElement buttonPasswordBoxSignIn;//Hompage  ==>> Password SignIn button

        @FindBy (xpath = "//*[text()='Keşfet']")
        public WebElement discoverClose;//Hompage ==>> Discover Close button

        @FindBy (xpath = "(//*[text()='Facebook'])[2]")
        public WebElement linkFacebook;//Hompagefooter ==>> Facebook link button

        @FindBy(xpath = "(//*[text()='YouTube'])[2]")
        public WebElement linkYouTube;//Hompagefooter ==>> YouTube link button

        @FindBy (xpath = "(//*[text()='Twitter'])[2]")
        public WebElement linkTwitter;//Hompagefooter ==>> Twitter link button

        @FindBy(xpath = "(//*[text()='LinkedIn'])[2]")
        public WebElement linkLinkedin;//Hompagefooter ==>> Linkedin link button

        @FindBy(xpath = "(//*[text()='Instagram'])[2]")
        public WebElement linkInstagram;//Hompagefooter ==>> Instagram link button

        @FindBy(xpath = "(//*[text()='Kategoriler'])[2]")
        public WebElement katogoriler ;//Hompage Katogoriler  ==>>

        @FindBy(xpath = "//*[text()='CarrefourSA Özel']")
        public WebElement karfursaÖzel;//Hompage Katogoriler kağıt-kozmetik ==>>

        @FindBy(xpath = "(//*[text()='Gıda, Şekerleme '])[1]")
        public WebElement gıdaSekerleme;//Hompage Katogoriler gıdaSekerleme ==>>





}




