package uiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
//import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws InterruptedException 
     */
    @org.testng.annotations.Test
    public void testApp() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "./src/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:9999/index.html#");
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/h2")).getText().equals("Shipwreck List"));
        driver.close();
        driver.quit();
        
    }
}
