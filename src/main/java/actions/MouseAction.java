package main.java.actions;

import org.openqa.selenium.By;

import main.java.utils.DriverContext;

public interface MouseAction {

	default void clicar(By elemento) {
		UtilActions.esperarElementoExistir(elemento);
		DriverContext.getDriver().findElement(elemento).click();
	}


}
