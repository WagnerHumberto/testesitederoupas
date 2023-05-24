package automationtest.steps;

import automationtest.funcs.HistoryFunc;
import io.cucumber.java.pt.Então;
import org.junit.Assert;

public class HistoryStep {

    HistoryFunc historyFunc = new HistoryFunc();

    @Então("deve visualizar a compra realizada com sucesso utilizando a forma de pagamento {string}")
    public void visualizarCompraRealizadaFormaPagamento(String formaPagamento) {
        Assert.assertEquals(formaPagamento, historyFunc.getFormaPagamento());
    }
}
