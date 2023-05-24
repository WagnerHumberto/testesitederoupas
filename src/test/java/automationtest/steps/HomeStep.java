package automationtest.steps;

import automationtest.funcs.HomeFunc;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;

public class HomeStep {

    HomeFunc homeFunc = new HomeFunc();

    @Dado("estiver na tela home")
    public void estiverTelaHome(){
        homeFunc.acessarTelaHome();
    }

    @E("selecionar o submenu {string}")
    public void selecionarSubmenu(String subMenu){
        homeFunc.selecionarSubMenu(subMenu);

    }
}
