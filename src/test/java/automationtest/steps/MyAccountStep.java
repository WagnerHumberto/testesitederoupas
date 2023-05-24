package automationtest.steps;

import automationtest.funcs.MyAccountFunc;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

public class MyAccountStep {

    MyAccountFunc myAccountFunc = new MyAccountFunc();

    @Entao("devo visualizar o nome {string}")
    public void devoVisualizarNome(String usuario){
        Assert.assertEquals(usuario, myAccountFunc.getNomeUsuarioLogado());

    }
}
