package page;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import appium.core.BasePage;

public class AccordionPage extends BasePage {
	
	
	public void selecionarOp1() throws MalformedURLException {
		clicarPorTexto("Op��o 1");
	}
	
	public String obterValorOp1() throws MalformedURLException {
		return obterTexto(By.xpath("//*[@text='Op��o 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView"));
	}
	
	
	
	
	
	
	
	

}
