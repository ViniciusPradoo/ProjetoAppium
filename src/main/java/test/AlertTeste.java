package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

import appium.core.BaseTest;
import page.AlertaPage;
import page.MenuPage;

public class AlertTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AlertaPage page = new AlertaPage();
	
	
	@Before
	public void setUp() {
		
		menu.acessarAlertas();
		
	}
	
	@Test
	public void deveConfirmarAlerta() throws MalformedURLException, InterruptedException{
		
		//clicar em alerta confirm
		page.clicarAlertaConfirm();
		
		//verificar os textos
		assertEquals("Info", page.obterTituloAlerta());
		assertEquals("Confirma a operação?", page.obterMensagemAlerta());
				
		//confirmar alerta
		page.confirmar();
		
		
		page.sair();
		
		
	}
	
	@Test
	public void deveClicarForaAlerta() throws MalformedURLException {

		//clicar alerta simples
		page.clicarAlertaSimples();
		
		//clicar fora da caixa
		page.clicarForaCaixa();
		
		//verificar que a mensagem não está presente
		assertFalse(page.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
		
		
		
		
		
	}

}
