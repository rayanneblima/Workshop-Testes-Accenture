package main.java.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import main.java.utils.DriverContext;

public interface TecladoAction {
	
	default void escrever(By elemento,String texto)
	{
		UtilActions.esperarElementoExistir(elemento);
		DriverContext.getDriver().findElement(elemento).clear();
		DriverContext.getDriver().findElement(elemento).sendKeys(texto);		
		
	}
	
	default void selecionar(By elemento,String valor)
	{	
		UtilActions.esperarElementoExistir(elemento);
		Select cbElement  = new Select((WebElement) DriverContext.getDriver().findElement(elemento));
		cbElement.selectByValue(valor);
	}
	
	default void confirmar(By elemento)
	{	
		DriverContext.getDriver().findElement(elemento).sendKeys(Keys.ENTER);
	}
	

}
