package automationtest.steps;

import automationtest.funcs.HomeFunc;
import automationtest.funcs.OrderFunc;
import automationtest.funcs.WomenFunc;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class OrderStep {

    HomeFunc homeFunc = new HomeFunc();
    WomenFunc womenFunc = new WomenFunc();

    OrderFunc orderFunc = new OrderFunc();

    @Quando("realizar a compra de um produto da seção {string} com a forma de pagamento {string}")
    public void realizarCompraFormaPagamento(String subMenu, String formaPagamento){
        homeFunc.selecionarSubMenu(subMenu);
        womenFunc.selecionarProduto();
        womenFunc.adicionarProdutoCarrinho();
        orderFunc.interacaoOrder(formaPagamento);


    }
}

