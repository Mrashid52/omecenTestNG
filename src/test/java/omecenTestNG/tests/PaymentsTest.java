package omecenTestNG.tests;





import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import omecenTestNG.base.BaseClass;
import omecenTestNG.pages.LoginPage;
import omecenTestNG.pages.PaymentsPage;

public class PaymentsTest extends BaseClass {
	@BeforeTest
	public void oppenApplication() {
		oppenApp();


	}
	@Test
	public void paymentsTest() throws InterruptedException {
		LoginPage lp=new LoginPage(); //class refferential variable
		PaymentsPage pp=new PaymentsPage();
		//here lp as object name
		//new keyword create the object
		//LoginPage() constractor initialize the object
		Thread.sleep(5000);
		lp.userName("admin");   
		lp.passWord("admin_test");
		lp.signIn();
		Thread.sleep(5000);
		pp.Payments();
	}



}























