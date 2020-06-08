package test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

import appium.core.BaseTest;
import page.CliquesPage;
import page.MenuPage;

public class CliquesTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();

	@Before
	public void setUp() {
		// acessar menu
		menu.acessarCliques();
	}

	@Test
	public void deveRealizarCliqueLongo() throws MalformedURLException {

		// clique longo
		page.cliqueLongo();

		// Verificar texto
		assertEquals("Clique Longo", page.obterTextoCampo());

	}
	
	@Test
	public void deveRealizarCliqueDuplo() throws MalformedURLException {

		
		page.clicarPorTexto("Clique duplo");
		page.clicarPorTexto("Clique duplo");

		
		assertEquals("Duplo Clique", page.obterTextoCampo());

	}
	
	

}
