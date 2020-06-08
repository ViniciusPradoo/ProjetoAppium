package appium.core;

import static appium.core.DriverFactory.getDriver;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {

	public void escrever(By by, String texto) throws MalformedURLException {

		getDriver().findElement(by).sendKeys(texto);

	}

	public String obterTexto(By by) throws MalformedURLException {

		return getDriver().findElement(by).getText();

	}

	public void clicar(By by) throws MalformedURLException {
		getDriver().findElement(by).click();
	}

	public void clicarPorTexto(String texto) throws MalformedURLException {

		getDriver().findElement(By.xpath("//*[@text='" + texto + "']")).click();

	}

	public void selecionarCombo(By by, String valor) throws MalformedURLException {

		getDriver().findElement(by).click();
		clicarPorTexto(valor);
	}

	public boolean isCheckMarcado(By by) throws MalformedURLException {
		return getDriver().findElement(by).getAttribute("checked").equals("true");
	}

	public boolean existeElementoPorTexto(String texto) throws MalformedURLException {

		List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='" + texto + "']"));

		return elementos.size() > 0;
	}

	public void tap(int x, int y) throws MalformedURLException {

		new TouchAction<>(getDriver()).tap(PointOption.point(new Point(x, y))).perform();

	}

	public void scroll(double inicio, double fim) throws MalformedURLException {

		
		
		 Dimension size = getDriver().manage().window().getSize();
		  
		  int x = size.width / 2;
		  
		  int start_y = (int) (size.height * inicio); 
		  int end_y = (int) (size.height * fim);
		  
		  
		  
		  new TouchAction<>(getDriver())
		  .press(PointOption.point(new Point(x, start_y)))
		  .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
		  .moveTo(PointOption.point(new Point(x, end_y)))
		  .release()
		  .perform();
		  
		
	}

	public void swipe(double inicio, double fim) throws MalformedURLException {

		
		  Dimension size = getDriver().manage().window().getSize();
		  
		  int y = size.height / 2;
		  
		  int start_x = (int) (size.width * inicio);
		  int end_x = (int) (size.width * fim);
		  
		  new TouchAction<>(getDriver())
		  .press(PointOption.point(new Point(start_x, y)))
		  .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
		  .moveTo(PointOption.point(new Point(end_x, y)))
		  .release()
		  .perform();
		 

	}

	public String obterTituloAlerta() throws MalformedURLException {
		return obterTexto(By.id("android:id/alertTitle"));
	}

	public String obterMensagemAlerta() throws MalformedURLException {
		return obterTexto(By.id("android:id/message"));
	}

	public void swipeElement(MobileElement element, double inicio, double fim) throws MalformedURLException {

		
		  int y = element.getLocation().y + (element.getSize().height / 2);
		  
		  int start_x = (int) (element.getSize().width * inicio);
		  int end_x = (int) (element.getSize().width * fim);
		  
		  new TouchAction<>(getDriver())
		  .press(PointOption.point(new Point(start_x, y)))
		  .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
		  .moveTo(PointOption.point(new Point(end_x, y)))
		  .release()
		  .perform();
		 

	}
	
	public void cliqueLongo(By by) throws MalformedURLException {
		
		new TouchAction<>(getDriver())
		.longPress(PointOption.point(getDriver().findElement(by).getCenter()))
		.perform();
		
		
	}

}
