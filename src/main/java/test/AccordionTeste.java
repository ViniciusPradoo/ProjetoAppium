package test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.Test;

import appium.core.BaseTest;
import page.AccordionPage;
import page.MenuPage;


public class AccordionTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AccordionPage page = new AccordionPage();
	
	@Test
	public void deveInteragirComAccordion() throws MalformedURLException {
		
		//acessar menu accordion
		menu.acessarAccordion();
		
		//clicsr op��o 1
		page.selecionarOp1();
		
		esperar(1000);
		//verificar texto op��o 1
		assertEquals("Esta � a descri��o da op��o 1", page.obterValorOp1());
		
		//
		
		
		
	}

}
