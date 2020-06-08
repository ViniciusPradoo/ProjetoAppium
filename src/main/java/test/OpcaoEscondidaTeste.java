package test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appium.core.BaseTest;
import appium.core.DriverFactory;
import page.MenuPage;

public class OpcaoEscondidaTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveEncontrarOpcaoEscondida() throws MalformedURLException {
		//scroll down
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		System.out.println("Começando");
		menu.scroll(0.9, 0.1);
		
		//clicar menu
		menu.clicarPorTexto("Opção bem escondido");
		
		//verificar mensagem
		assertEquals("Você achou essa opção", menu.obterMensagemAlerta());
		//sair
		menu.clicarPorTexto("OK");
	}

}
