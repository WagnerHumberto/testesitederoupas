package automationtest.funcs;

import automationtest.common.BaseTest;
import automationtest.pages.MyAccountPage;

public class MyAccountFunc extends BaseTest {

    MyAccountPage myAccountPage = new MyAccountPage();

    public String getNomeUsuarioLogado(){
         return driver.findElement(myAccountPage.getTitleUsuarioLogado()).getText();

    }
}
