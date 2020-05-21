package main.java.pages;

import org.openqa.selenium.By;

public class SearchPage {
	
	public static By txtSearch     			    = By.id("search_query_top");
	public static By itensLista    			    = By.xpath("//div[@class='product-container']//a[@class='product-name']");
	public static By btnQtd   	   			    = By.xpath("//p[@id='quantity_wanted_p']//a[2]");
	public static By cbSize   	   			    = By.id("group_1");
	public static By btnAddCart    			    = By.name("Submit");
	
	public static By btnProceedCheckout         = By.linkText("Proceed to checkout");
	public static By btnSumaryProceedCheckout   = By.linkText("Proceed to checkout");
	public static By btnAdressProceedCheckout   = By.xpath("//*[@id='center_column']/form/p/button");
	public static By ckTermos 				    = By.id("cgv");
	public static By btnShippingProceedCheckout = By.xpath("//*[@id='form']/p/button");
	public static By btnPayByBank				= By.className("bankwire");
	public static By btnConfirm 				= By.xpath("//*[@id='cart_navigation']/button");


}
