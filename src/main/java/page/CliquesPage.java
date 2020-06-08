package page;

import static appium.core.DriverFactory.getDriver;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import appium.core.BasePage;

public class CliquesPage extends BasePage {

	
	public void cliqueLongo() throws MalformedURLException {
		
		
		cliqueLongo(By.xpath("//*[@text='Clique Longo']"));		 
		
	}
	
	public String obterTextoCampo() throws MalformedURLException {
		return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
	}
	
	
	
}
