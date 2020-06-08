package test;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Test;

import appium.core.BaseTest;
import page.MenuPage;
import page.SwipeListPage;

public class SwipeElementTeste extends BaseTest{
	
	private MenuPage menu = new MenuPage();
	private SwipeListPage page = new SwipeListPage();
	
	@Test
	public void deveResolverDesafio() throws MalformedURLException {
		
		menu.clicarSwipeList();
		
		page.swipeElementRight("Opção 1");
		
		page.clicarBotaoMais();
		
		assertTrue(page.existeElementoPorTexto("Opção 1 (+)"));
		
		page.swipeElementRight("Opção 4");
		
		page.clicarPorTexto("(-)");
		
		assertTrue(page.existeElementoPorTexto("Opção 4 (-)"));
		
		page.swipeElementLeft("Opção 5 (-)");
		
		assertTrue(page.existeElementoPorTexto("Opção 5"));
		
	}

}
