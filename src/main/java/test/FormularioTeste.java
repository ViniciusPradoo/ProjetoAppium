package test;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import appium.core.BaseTest;
import appium.core.DriverFactory;
import page.MenuPage;

public class FormularioTeste extends BaseTest {

	private MenuPage menu = new MenuPage();

	@Before
	public void inicializarAppium() throws MalformedURLException {

		menu.acessarFormulario();
		
	}

	@Test
	public void deveInstalarAPK() throws MalformedURLException {

	}

	@After
	public void tearDown() {

		DriverFactory.killDriver();
	}

}
