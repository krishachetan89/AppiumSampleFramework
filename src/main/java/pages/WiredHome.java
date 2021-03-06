package pages;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class WiredHome extends BasePage {
    public WiredHome(AppiumDriver driver) {
        super(driver);
    }
    private By FeedBtn = By.xpath(".//*[@text='THE FEED']");
    private By WiredBTn = By.xpath(".//*[@text='WIRED25']");
    private By ExperimentalBtn = By.xpath(".//*[@text='EXPERIMENTAL']");
    private By HeaderText = By.xpath(".//*[@text='TOP STORIES']");
    private By SampleId = By.id("Dummy");
    private By NameSample = By.name("SampleName");
    private By  PartialLinkTest =  By.partialLinkText("PartialLink");



    public void Verifyhomescreen() throws InterruptedException
    {
        isEnableElement(FeedBtn);
        isEnableElement(WiredBTn);
        isEnableElement(ExperimentalBtn);
        isEnableElement(HeaderText);
    }

    public void ClickWiredButton() throws InterruptedException
    {
        click(WiredBTn);
    }

    public void ClickExperimentaldButton() throws InterruptedException
    {
        click(ExperimentalBtn);

    }
    public void DummyButton() throws InterruptedException
    {
        getText(SampleId);
        //assertText(ExperimentalBtn,"EXPERIMENTAL");
    }

}
