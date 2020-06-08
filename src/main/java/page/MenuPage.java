package page;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appium.core.BasePage;
import appium.core.DriverFactory;

public class MenuPage extends BasePage {

	public void acessarFormulario() {
		try {
			clicarPorTexto("Formulário");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void acessarSplash() {
		try {
			clicarPorTexto("Splash");
		} catch (MalformedURLException e) {
		}
	}

	public void acessarAlertas() {
		try {
			clicarPorTexto("Alertas");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void acessarAbas() {
		try {
			clicarPorTexto("Abas");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void acessarAccordion() {
		try {
			clicarPorTexto("Accordion");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void acessarCliques() {
		try {
			clicarPorTexto("Cliques");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void acessarSwipe() {
		try {
			clicarPorTexto("Swipe");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void clicarSwipeList() throws MalformedURLException {
		// scroll down
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		System.out.println("Começando");

		scroll(0.9, 0.1);

		clicarPorTexto("Swipe List");

	}
	
	
	public void clicarDragNDrop() throws MalformedURLException {
		// scroll down
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		System.out.println("Começando");

		scroll(0.9, 0.1);

		clicarPorTexto("Drag and drop");

	}
	
	public void acessarSeuBarrigaHibrido() {
		try {
			clicarPorTexto("SeuBarriga Híbrido");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public void acessarSeuBarrigaNativo() {
		try {
			clicarPorTexto("SeuBarriga Nativo");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
