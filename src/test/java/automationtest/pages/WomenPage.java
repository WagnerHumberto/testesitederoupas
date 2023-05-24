package automationtest.pages;

import org.openqa.selenium.By;

public class WomenPage {

    By filtroRoupas = By.id("selectProductSort");

    By opcoesFiltroRoupas = By.xpath("//select[@id='selectProductSort']/child::option[not(contains(text(),'--'))]");

    By listaProdutos = By.xpath("//img[@class='replace-2x img-responsive' and parent::a[@class='product_img_link']]");

    By buttonAdicionarProdutoCarrinho = By.xpath("//button[@name='Submit']");


    public By getFiltroRoupas() {
        return filtroRoupas;
    }
    public By getOpcoesFiltroRoupas() {
        return opcoesFiltroRoupas;
    }

    public By getListaProdutos() {
        return listaProdutos;
    }

    public By getButtonAdicionarProdutoCarrinho() {
        return buttonAdicionarProdutoCarrinho;
    }



}
