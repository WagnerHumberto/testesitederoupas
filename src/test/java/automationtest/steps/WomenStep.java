package automationtest.steps;

import automationtest.funcs.WomenFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.List;

public class WomenStep {

    WomenFunc womenFunc = new WomenFunc();

    @Quando("clicar no filtro de roupas")
    public void clicarFiltroRoupas(){
        womenFunc.clicarFiltroRoupas();
    }

    @Entao("deve visualizar as opções de filtro")
    public void deveVisualizarOpcoesFiltro(DataTable dataTable){
        List<String> opcoesFiltroRoupas = dataTable.asList();
        List<String> opcoesFiltro = womenFunc.getOpcoesFiltro();
        int cont = 0;
        for (String opcao: opcoesFiltroRoupas){
            Assert.assertEquals(opcao, opcoesFiltro.get(cont));
            cont++;
        }
    }
}


