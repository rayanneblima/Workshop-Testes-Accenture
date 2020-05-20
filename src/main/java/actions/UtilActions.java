package main.java.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.utils.Constants;
import main.java.utils.DriverContext;

public class UtilActions {

	static WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), Constants.timeOut);

	public static void esperarElementoExistir(By elemento) {
		wait.until(ExpectedConditions.presenceOfElementLocated(elemento));	
	}	
	

}
