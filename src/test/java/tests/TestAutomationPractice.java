package test.java.tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import main.java.actions.InteracoesWeb;
import main.java.actions.ValidacaoAction;
import main.java.pages.CreateAccountPage;
import main.java.utils.Constants;
import main.java.utils.DriverContext;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAutomationPractice implements ValidacaoAction {
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
	
	
	@Test
	public void testCriarContaUsuario()  {
		i.clicar(CreateAccountPage.linkSignIn);
		i.escrever(CreateAccountPage.txtEmail, "rayanneblima7@gmail.com");
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
		
		validar(CreateAccountPage.linkUsername, "Rayanne Lima");
	}
	

}
