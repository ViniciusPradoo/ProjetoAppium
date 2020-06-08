package test;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Test;

import appium.core.BaseTest;
import page.MenuPage;

public class SwipeTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveRealizarSwipe() throws MalformedURLException {
		//acessar menu
		menu.acessarSwipe();
		
		//verificar texto 'a esquerda'
		assertTrue(menu.existeElementoPorTexto("a esquerda"));
		
		//swipe para a direita 
		menu.swipe(0.9, 0.1);
		
		//verificar o texto'E veja se'
		assertTrue(menu.existeElementoPorTexto("E veja se"));
		
		//clicar botão direita
		menu.clicarPorTexto("›");
		
		//verificar o texto 'Chegar ate o fim'
		assertTrue(menu.existeElementoPorTexto("Chegar até o fim!"));
		
		//swipe esquerda
		menu.swipe(0.1, 0.9);
		
		//clicar no botão da esquerda
		menu.clicarPorTexto("‹");
		
		//verificar texto 'a esquerda'
		assertTrue(menu.existeElementoPorTexto("a esquerda"));
		
		
	}
	
}
