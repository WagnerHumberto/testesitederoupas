package automationtest.pages;

import org.openqa.selenium.By;

public class HomePage {

    By subMenuWomen = By.xpath("//a[@title='Women']");

    By subMenuDresses = By.xpath("//a[@title='Dresses'and following-sibling::ul[@class='submenu-container clearfix first-in-line-xs']]");

    By getSubMenuTshirts = By.xpath("//a[@title='T-shirts'and parent::li/parent::ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']]");

    public By getSubMenuWomen() {
        return subMenuWomen;
    }

    public By getSubMenuDresses() {
        return subMenuDresses;
    }

    public By getGetSubMenuTshirts() {
        return getSubMenuTshirts;
    }
}
