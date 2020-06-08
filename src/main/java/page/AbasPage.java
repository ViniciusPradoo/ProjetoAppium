package page;

import java.net.MalformedURLException;

import appium.core.BasePage;

public class AbasPage extends BasePage {
	
	public boolean isAba1() throws MalformedURLException {
		return existeElementoPorTexto("ABA 1");
	}
	
	public boolean isAba2() throws MalformedURLException {
		return existeElementoPorTexto("ABA 2");
	}
	
		
	public void selecionarAba2() throws MalformedURLException {
		clicarPorTexto("ABA 2");
	}

}
