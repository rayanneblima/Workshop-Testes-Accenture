package main.java.actions;

import org.junit.Assert;
import org.openqa.selenium.By;

import main.java.utils.DriverContext;

public interface ValidacaoAction {
	
	default void validar(By elemento, String texto) {
		Assert.assertTrue(DriverContext.getDriver().findElement(elemento).getText().equals(texto));
		//System.out.println("Validouuuuu!");
	}

}