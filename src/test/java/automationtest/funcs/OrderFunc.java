package automationtest.funcs;

import automationtest.common.BaseTest;
import automationtest.pages.OrderPage;

public class OrderFunc extends BaseTest {

    OrderPage orderPage = new OrderPage();

    public void checkout(){
        driver.findElement(orderPage.getFazerCheckout()).click();
    }

    public void checkBoxShipping(){
        driver.findElement(orderPage.getCheckBoxShipping()).click();
    }

    public void selecionarFormaPagamento (String formaPagamento) {
        formaPagamento = formaPagamento.toUpperCase();
        if (formaPagamento.contains("CHECK")) {
            driver.findElement(orderPage.getPayByCheck()).click();
        } else {
            driver.findElement(orderPage.getPayByBankWire()).click();
        }
    }

    public void confirmMyOrder() {
        driver.findElement(orderPage.getConfirmMyOrder()).click();
    }

    public void backOrders(){
        driver.findElement(orderPage.getBackOrders()).click();
    }


    public void interacaoOrder(String formaPagamento){
        this.checkout();
        this.checkout();
        this.checkBoxShipping();
        this.checkout();
        this.selecionarFormaPagamento(formaPagamento);
        this.confirmMyOrder();
        this.backOrders();

    }
}
