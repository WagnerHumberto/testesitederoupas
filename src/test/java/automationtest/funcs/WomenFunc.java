package automationtest.funcs;

import automationtest.common.BaseTest;
import automationtest.pages.HomePage;
import automationtest.pages.WomenPage;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WomenFunc extends BaseTest {

    WomenPage womenPage = new WomenPage();

    public void clicarFiltroRoupas(){
        driver.findElement(womenPage.getFiltroRoupas()).click();

    }

    public List<String> getOpcoesFiltro(){
        int elementos = driver.findElements(womenPage.getOpcoesFiltroRoupas()).size();
        List<String> opcaoFiltro = new ArrayList<>();
        for (int i = 0; i < elementos; i++){
            String opcao = driver.findElements(womenPage.getOpcoesFiltroRoupas()).get(i).getText();
            opcaoFiltro.add(opcao);
        }
        return opcaoFiltro;
    }

    public void selecionarProduto(){
        List<WebElement> listaProdutos = driver.findElements(womenPage.getListaProdutos());
        listaProdutos.get(0).click();
    }

    public void adicionarProdutoCarrinho(){
        driver.switchTo().frame(0);
        driver.findElement(womenPage.getButtonAdicionarProdutoCarrinho()).click();
        driver.switchTo().defaultContent();

    }
}
