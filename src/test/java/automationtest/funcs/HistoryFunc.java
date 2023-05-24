package automationtest.funcs;

import automationtest.common.BaseTest;
import automationtest.pages.HistoryPage;

public class HistoryFunc extends BaseTest {

    HistoryPage historyPage = new HistoryPage();

    public String getFormaPagamento(){
        return driver.findElement(historyPage.getFirstItem()).getText();
    }
}
