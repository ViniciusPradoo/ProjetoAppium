package test;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Test;

import appium.core.BaseTest;
import page.AbasPage;
import page.MenuPage;

public class AbasTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AbasPage page = new AbasPage();
	
	@Test
	public void deveInteragirComAbas() throws MalformedURLException {
		//acessar menu abas
		menu.acessarAbas();
		
		//verificar que esta na aba 1
		assertTrue(page.isAba1());
		
		
		//acessar aba 2
		page.selecionarAba2();
		
		//verificar que esta na aba 2
		assertTrue(page.isAba2());
		
		
	}
	
}
