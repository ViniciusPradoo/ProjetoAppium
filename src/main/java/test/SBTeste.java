package test;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

import appium.core.BaseTest;
import page.MenuPage;
import page.seuBarriga.SBContasPage;
import page.seuBarriga.SBLoginPage;
import page.seuBarriga.SBMenuPage;

public class SBTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SBLoginPage login = new SBLoginPage();
	private SBMenuPage menuSB = new SBMenuPage();
	private SBContasPage contas = new SBContasPage();

	@Before
	public void setup() throws MalformedURLException {

		menu.acessarSeuBarrigaNativo();
		login.setEmail("vinny12@v.com");
		login.setSenha("123456");
		login.entrar();

	}

	@Test
	public void deveInserirContaComSucesso() throws MalformedURLException {
		// entrar em contas
		menuSB.acessarContas();

		// digitar nome conta
		contas.setConta("Conta de Teste");

		// salvar
		contas.salvar();

		// verificar mensagem
		assertTrue(contas.existeElementoPorTexto("Conta adicionada com sucesso"));
	}

	@Test
	public void deveExcluirConta() throws MalformedURLException {
		// entrar em contas
		menuSB.acessarContas();
		
		esperar(2000);
		//clique longo na conta
		contas.selecionarConta("Conta de Teste");
		esperar(2000);
		//excluir
		contas.excluir();
		esperar(1000);
		//verificarmensagem
		assertTrue(contas.existeElementoPorTexto("Conta excluída com sucesso"));
	}

}
