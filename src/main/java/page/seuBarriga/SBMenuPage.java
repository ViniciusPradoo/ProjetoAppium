package page.seuBarriga;

import java.net.MalformedURLException;

import appium.core.BasePage;

public class SBMenuPage extends BasePage {
	
	public void acessarContas() throws MalformedURLException {
		clicarPorTexto("CONTAS");
	}

}
