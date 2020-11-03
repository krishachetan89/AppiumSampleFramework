package testcase;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;


public class Pageview_medium {
    private static WebDriver driver;
    private static WebDriverWait wait;


    @Test
    public void doTestCase() throws  InterruptedException {


        for (int i = 0; i < 999999 ; i++)
        {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("incognito");
            ChromeDriver driver = new ChromeDriver(options);
            System.out.println(i);
            try
            {
                driver.get("https://krishnachetan.medium.com/setup-appium-on-mac-1e06f1178427");
                Thread.sleep(15000);

                for (int j = 0; j < 12; j++)
                {
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("window.scrollBy(0,2300)");
                    Thread.sleep(20000);
                    System.out.println("Swiped for:  " + j );
                }

                driver.quit();

            }
            catch (Exception e )
            {
                System.out.println("hello");
            }

        }
    }
}
