package uk.co.library.browsefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import uk.co.library.propertyreader.PropertyReader;

import java.time.Duration;

public class ManageBrowser
{
    public static WebDriver driver;
    static String baseUrl= PropertyReader.getInstance().getProperty("baseUrl");

    public void selectBrowser(String browser)
    {
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Wrong Name");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseUrl);

    }

    public void closeBrowser()
    {
        if(driver != null)
        {
            driver.quit();
        }
    }
}
