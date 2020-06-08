package page.seuBarriga;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import appium.core.BasePage;

public class SBLoginPage extends BasePage {

	public void setEmail(String email) throws MalformedURLException {

		escrever(By.className("android.widget.EditText"), email);

	}

	public void setSenha(String senha) throws MalformedURLException {

		escrever(By.xpath("//android.widget.EditText[2]"), senha);
		
	}

	public void entrar() throws MalformedURLException {
		
		clicarPorTexto("ENTRAR");

	}

}
