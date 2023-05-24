package automationtest.pages;

import org.openqa.selenium.By;

public class OrderPage {

    By fazerCheckout = By.xpath("//span[contains(text(),'Proceed to checkout') and ancestor::p[@class='cart_navigation clearfix']]");

    By checkBoxShipping = By.id("cgv");

    By payByBankWire = By.xpath("//a[@title='Pay by bank wire']");

    By payByCheck = By.xpath("//a[@title= 'Pay by check.']");

    By confirmMyOrder = By.xpath("//button[@class='button btn btn-default button-medium']");

    By backOrders = By.xpath("//a[@title='Go to your order history page']");

    public By getFazerCheckout() {
        return fazerCheckout;
    }

    public By getCheckBoxShipping() {
        return checkBoxShipping;
    }

    public By getPayByBankWire() {
        return payByBankWire;
    }

    public By getPayByCheck() {
        return payByCheck;
    }

    public By getConfirmMyOrder() {
        return confirmMyOrder;
    }

    public By getBackOrders() {
        return backOrders;
    }
}

