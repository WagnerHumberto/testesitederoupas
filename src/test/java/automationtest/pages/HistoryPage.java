package automationtest.pages;

import org.openqa.selenium.By;

public class HistoryPage {

    By firstItem = By.xpath("//td[@class='history_method' and parent::tr[@class='first_item ']]");

    public By getFirstItem() {
        return firstItem;
    }
}

