package automationtest.steps;

import automationtest.funcs.LoginFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginStep {

    LoginFunc loginFunc = new LoginFunc();

    @Dado("estiver na tela de login")
    public void entrarLogin(){
        loginFunc.acessarTelaLogin();
    }


    @Quando("inserir os dados do usuário")
    public void inserirOsDadosDoUsuario(DataTable dataTable) {
        List<Map<String, String>> usuario = dataTable.asMaps();
        String email = usuario.get(0).get("email");
        String senha = usuario.get(0).get("senha");
        loginFunc.realizarLogin(email, senha);
    }

    @Então("deve visualizar a mensagem de erro {string}")
    public void deveVisualizarMensagem(String msg){
        Assert.assertEquals(msg, loginFunc.getMsgerroLogin());

    }
}
