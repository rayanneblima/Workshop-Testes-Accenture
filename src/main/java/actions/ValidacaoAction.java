package main.java.actions;

import org.junit.Assert;
import org.openqa.selenium.By;

import main.java.utils.DriverContext;

public interface ValidacaoAction {
	
	default void validarCadastro(By elemento, String texto) {
		UtilActions.esperarElementoExistir(elemento);
		Assert.assertTrue(DriverContext.getDriver().findElement(elemento).getText().equals(texto));
		//System.out.println("Validouuuuu (cadastro)!");
	}

	
	default void validarCompra(By elemento, String texto) {
		UtilActions.esperarElementoExistir(elemento);
		Assert.assertTrue(DriverContext.getDriver().findElement(elemento).getText().equals(texto));
		//System.out.println("Validouuuuu (compra)!");
	}
}