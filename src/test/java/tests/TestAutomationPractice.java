package test.java.tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import main.java.actions.InteracoesWeb;
import main.java.pages.CreateAccountPage;
import main.java.pages.LoginPage;
import main.java.pages.SearchPage;
import main.java.pages.SucessPage;
import main.java.utils.Constants;
import main.java.utils.DriverContext;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAutomationPractice {
	static WebDriver driver;
	InteracoesWeb i = new InteracoesWeb();
	
	@BeforeClass
	public static void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
	}
	
	
	//Ação antes do cenário de execução de teste
	@Before
	public  void setUp() {
		DriverContext.getDriver().get("http://automationpractice.com/");
	}
	

	public void testCriarContaUsuario()  {
		i.clicar(CreateAccountPage.linkSignIn);
		i.escrever(CreateAccountPage.txtEmail, "rayanneblima13@gmail.com");
		i.clicar(CreateAccountPage.btnCreateAccount);
		i.clicar(CreateAccountPage.rdbSexoFeminino);
		i.escrever(CreateAccountPage.txtFirstName, "Rayanne");
		i.escrever(CreateAccountPage.txtLastName, "Lima");
		i.escrever(CreateAccountPage.txtPassword, "12345");
		i.selecionar(CreateAccountPage.cbDays, "22");
		i.selecionar(CreateAccountPage.cbMonths, "8");
		i.selecionar(CreateAccountPage.cbYears, "1997");
		i.clicar(CreateAccountPage.ckNewsletter);
		i.clicar(CreateAccountPage.ckPartners);
		
		i.escrever(CreateAccountPage.txtCompany, "None");
		i.escrever(CreateAccountPage.txtAddress1, "Rua dos Bobos");
		i.escrever(CreateAccountPage.txtAddress2, "Numero 0");
		i.escrever(CreateAccountPage.txtCity, "VRB");
		i.selecionar(CreateAccountPage.cbState, "5");
		i.escrever(CreateAccountPage.txtPostalcode, "00000");
		//i.selecionar(CreateAccountPage.cbCountry, "5");
		i.escrever(CreateAccountPage.txtAddInformation, "");
		i.escrever(CreateAccountPage.txtHomePhone, "327070");
		i.escrever(CreateAccountPage.txtMobilePhone, "327070");
		i.escrever(CreateAccountPage.txtAdressName, "Casa 1");
		
		i.clicar(CreateAccountPage.btnRegister);
		i.validarCadastro(SucessPage.linkUsername, "Rayanne Lima");
		
		//DESLOGA
		i.clicar(CreateAccountPage.linkSignOut);
		
	}

	
	@Test
	public void testRealizarCompra()  {
		i.clicar(LoginPage.linkSignIn);
		i.escrever(LoginPage.txtEmail, "rayanneblima8@gmail.com");
		i.escrever(LoginPage.txtPassword, "12345");
		i.clicar(LoginPage.btnSubmit);
		
		i.escrever(SearchPage.txtSearch, "dresses");
		i.confirmar(SearchPage.txtSearch);
		i.clicarLista(SearchPage.itensLista, "Printed Chiffon Dress");
		
		i.clicar(SearchPage.btnQtd);
		i.selecionar(SearchPage.cbSize, "2");
		i.clicar(SearchPage.btnAddCart);
	
		i.clicar(SearchPage.btnProceedCheckout);
		i.clicar(SearchPage.btnSumaryProceedCheckout);
		i.clicar(SearchPage.btnAdressProceedCheckout);
		i.clicar(SearchPage.ckTermos);
		i.clicar(SearchPage.btnShippingProceedCheckout);
		i.clicar(SearchPage.btnPayByBank);
		i.clicar(SearchPage.btnConfirm);
		
		i.validarCompra(SucessPage.linkSucessSale, "Your order on My Store is complete.");
		
	}
	

}