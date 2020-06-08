package page.seuBarriga;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import appium.core.BasePage;

public class SBContasPage extends BasePage {

	
	public void setConta(String nome) throws MalformedURLException {
		
		escrever(By.className("android.widget.EditText"), nome);
		
	}
	
	public void salvar() throws MalformedURLException {
		clicarPorTexto("SALVAR");
	}
	
	public void excluir() throws MalformedURLException {
		clicarPorTexto("EXCLUIR");
	}
	
	public void selecionarConta(String conta) throws MalformedURLException {
		
		cliqueLongo(By.xpath("//*[@text='"+conta+"']"));	
		
	}
	
}
