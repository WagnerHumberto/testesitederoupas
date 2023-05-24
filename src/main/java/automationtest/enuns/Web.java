package automationtest.enuns;

import automationtest.interfaces.AplicacaoWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public enum Web implements AplicacaoWeb {


    CHROME {
        @Override
        public WebDriver getDriver() {
            return new ChromeDriver();
        }
    },

    FIREFOX {
        @Override
        public WebDriver getDriver() {
            return new FirefoxDriver();
        }
    }
    ;
}
