package main.java.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import main.java.utils.DriverContext;

public interface MouseAction {

	default void clicar(By elemento) {
		UtilActions.esperarElementoExistir(elemento);
		DriverContext.getDriver().findElement(elemento).click();
	}
	
	
	default void clicarLista(By itensLista, String texto) {
		
		List<WebElement> links =  DriverContext.getDriver().findElements(itensLista);
		
		for(WebElement link: links) {
			if(link.getText().contains(texto)) {
				link.click();
				break;
			}
		}
		
	}


}
