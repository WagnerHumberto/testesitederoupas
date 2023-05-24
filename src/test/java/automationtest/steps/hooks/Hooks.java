package automationtest.steps.hooks;

import automationtest.common.BaseTest;
import automationtest.enuns.Web;
import org.junit.After;
import org.junit.Before;

public class Hooks extends BaseTest {

    @Before
    public void beforeTest(){
        super.inicializarDriver(Web.CHROME);
    }


    @After
    public void afterTest(){
        driver.quit();
    }
}
