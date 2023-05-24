package automationtest.configuration;

import automationtest.common.BaseTest;
import automationtest.enuns.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BaseTest {

    @Before
    public void beforeTest() {
        super.inicializarDriver(Web.CHROME);
    }


    @After
    public void afterTest(Scenario scenario){
        byte[] screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenShot, "image/png", scenario.getName());
        driver.quit();
    }
}