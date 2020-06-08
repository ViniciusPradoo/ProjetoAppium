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
		
		page.swipeElementRight("Op��o 1");
		
		page.clicarBotaoMais();
		
		assertTrue(page.existeElementoPorTexto("Op��o 1 (+)"));
		
		page.swipeElementRight("Op��o 4");
		
		page.clicarPorTexto("(-)");
		
		assertTrue(page.existeElementoPorTexto("Op��o 4 (-)"));
		
		page.swipeElementLeft("Op��o 5 (-)");
		
		assertTrue(page.existeElementoPorTexto("Op��o 5"));
		
	}

}
