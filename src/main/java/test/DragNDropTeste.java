package test;

import static org.junit.Assert.assertArrayEquals;

import java.net.MalformedURLException;

import org.junit.Test;

import appium.core.BaseTest;
import page.DragNDropPage;
import page.MenuPage;

public class DragNDropTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private DragNDropPage page = new DragNDropPage();
	private String[] estadoInicial = new String[] {"Esta", "� uma lista", "Drag em Drop!", "Fa�a um clique longo,", "e arraste para", "qualquer local desejado."};
	private String[] estadoIntermediario = new String[] {"� uma lista", "Drag em Drop!", "Fa�a um clique longo,", "e arraste para", "Esta", "qualquer local desejado."};
	private String[] estadoFinal = new String[] {"Fa�a um clique longo,", "� uma lista", "Drag em Drop!", "e arraste para", "Esta", "qualquer local desejado."};
	
	@Test
	public void deveEfetuarDragNDrop() throws MalformedURLException {
		
		//acessar menu
		menu.clicarDragNDrop();
		
		//verificar estado inicial
		esperar(1000);
		assertArrayEquals(estadoInicial, page.obterLista());
		
		//Comando apenas para pegar a lista inicial 
		//page.obterLista();
		
		//arrastar "Esta" para "e arraste para"
		page.arrastar("Esta", "e arraste para");
		
		
		//verificar estado intermediario
		assertArrayEquals(estadoIntermediario, page.obterLista());
		
		//arrastar "Fa�a um clique longo," para "� uma lista" ,
		page.arrastar("Fa�a um clique longo,", "� uma lista");
		
		//verificar estado final
		assertArrayEquals(estadoFinal, page.obterLista());
		
		
		
	}
	
}
