package automationtest.funcs;

import automationtest.common.BaseTest;
import automationtest.pages.HomePage;

public class HomeFunc extends BaseTest {

    HomePage homePage = new HomePage();

    public void acessarTelaHome(){
        driver.navigate().to("https://automationtest.shop/index.php");

    }

    public void selecionarSubMenu(String subMenu){
        subMenu = subMenu.replace(" ", "").toUpperCase();

        switch (subMenu){
            case "WOMEN":
                driver.findElement(homePage.getSubMenuWomen()).click();
                break;
            case "DRESSES":
                driver.findElement(homePage.getSubMenuDresses()).click();
                break;
            case "TSHIRTS":
                driver.findElement(homePage.getGetSubMenuTshirts()).click();
                break;
            default:
                System.out.println("SubMenu não existe " + subMenu);
        }

    }
}
