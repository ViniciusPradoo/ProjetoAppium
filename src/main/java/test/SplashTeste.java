package test;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Test;

import appium.core.BaseTest;
import page.MenuPage;
import page.SplashPage;

public class SplashTeste extends BaseTest {
	
	
	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();
	
	@Test
	public void deveAguardarSplashSumir() throws MalformedURLException {
		
		//acessar menu splash
		menu.acessarSplash();
		
		//verificar que o splash esta sendo exibido
		page.isTelaSplashVisivel();
		
		//aguardar saida do splash
		page.aguardarSplashSumir();
		
		
		//verificar que o formulario esta aparecendo
		assertTrue(page.existeElementoPorTexto("Formulário"));
	}

}
