package test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Test;

import appium.core.BaseTest;
import page.MenuPage;
import page.WebViewPage;

public class WebViewTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();
	
	@Test
	public void deveFazerLogin() throws MalformedURLException {
		//acessar o menu
		menu.acessarSeuBarrigaHibrido();
		esperar(3000);
		page.entrarContextoWeb();
		
		//preencher email	
		page.setEmail("vinny12@v.com");
		
		//senha
		page.setSenha("123456");
		
		//entrar
		page.entrar();
		
		//verificar
		assertEquals("Bem vindo, Vinicius do Prado!", page.getMensagem());
	}
	
	@After
	public void tearDown() throws MalformedURLException {
		page.sairContextoWeb();
	}

}
