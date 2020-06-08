package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appium.core.BaseTest;
import appium.core.DriverFactory;
import io.appium.java_client.MobileBy;
import page.FormularioPage;
import page.MenuPage;

public class PreenchendoCampoTextoTeste extends BaseTest{

	private MenuPage menu = new MenuPage();
	private FormularioPage page = new FormularioPage();

	@Before
	public void inicializarAppium() throws MalformedURLException {

		menu.acessarFormulario();

	}
	

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {

		page.escreverNome("Vinicius");
		assertEquals("Vinicius", page.obterNome());

	}

	@Test
	public void deveInteragirComOCombo() throws MalformedURLException {

		page.selecionarCombo("Nintendo Switch");
		assertEquals("Nintendo Switch", page.obterValorCombo());

	}

	@Test
	public void deveInteragirComSwitchCheckBox() throws MalformedURLException {

		assertFalse(page.isCheckMarcado());
		assertTrue(page.isSwitchMarcado());

		page.clicarCheck();
		page.clicarSwitch();

		assertTrue(page.isCheckMarcado());
		assertFalse(page.isSwitchMarcado());

	}

	@Test
	public void deveRealizarCadastro() throws MalformedURLException {

		page.escreverNome("Vinicius");
		page.clicarCheck();
		page.clicarSwitch();
		page.selecionarCombo("Nintendo Switch");

		page.salvar();

		assertEquals("Nome: Vinicius", page.obterNomeCadastrado());
		assertEquals("Console: switch", page.obterConsoleCadastrado());
		assertTrue(page.obterCheckCadastrado().endsWith("Off"));
		assertTrue(page.obterSwitchCadastrado().endsWith("Marcado"));

	}

	@Test
	public void deveRealizarCadastroDemorado() throws MalformedURLException {

		
		page.escreverNome("Vinicius");
		
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		page.salvarDemorado();
		//esperar(3000);
		
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text= 'Nome: Vinicius']")));

		assertEquals("Nome: Vinicius", page.obterNomeCadastrado());
		

	}
	
	@Test
	public void deveAlterarData() throws MalformedURLException {
		
		page.clicarPorTexto("01/01/2000");
		page.clicarPorTexto("20");
		page.clicarPorTexto("OK");
		assertTrue(page.existeElementoPorTexto("20/2/2000"));
		
	}
	
	@Test
	public void deveAlterarHora() throws MalformedURLException {
		page.clicarPorTexto("06:00");
		page.clicar(MobileBy.AccessibilityId("10"));
		page.clicar(MobileBy.AccessibilityId("40"));
		page.clicarPorTexto("OK");

		assertTrue(page.existeElementoPorTexto("10:40"));
		
	}
	
	@Test
	public void deveInteragirComSeekbar() throws MalformedURLException {
		// clicar no seekbar
		page.clicarSeekBar(0.67);
		
		// salvar
		page.salvar();
		
		
		
	}

}
