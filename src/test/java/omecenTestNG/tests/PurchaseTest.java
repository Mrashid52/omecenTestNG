package omecenTestNG.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import omecenTestNG.base.BaseClass;
import omecenTestNG.pages.LoginPage;

public class PurchaseTest extends BaseClass {
	@BeforeTest
	public void oppenApplication() {
		oppenApp();
		
		}
	@Test
	public void PurchaseTest() throws InterruptedException {
		
	LoginPage lp=new LoginPage();	
	PurchaseTest pt=new PurchaseTest();
	Thread.sleep(5000);
		lp.userName("admin");
		lp.passWord("admin_test");
		lp.signIn();
		Thread.sleep(5000);
		pt.PurchaseTest();
		
		
		
	}
	
	
	

}
