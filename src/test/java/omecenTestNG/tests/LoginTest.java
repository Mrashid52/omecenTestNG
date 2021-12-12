package omecenTestNG.tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import omecenTestNG.base.BaseClass;
import omecenTestNG.pages.LoginPage;

public class LoginTest extends BaseClass {
	@BeforeTest
	public void oppenAppication(){

		oppenApp();	

//System.out.println("window name: "+driver.getWindowHandles());
	}
	@Test
	public void possitiveLogin() {
		LoginPage lp=new LoginPage(); //class refferential variable
		//here lp as object name
		//new keyword create the object
		//LoginPage() constractor initialize the object
		lp.userName("admin");   
		lp.passWord("admin_test");
		lp.signIn();


	}
/*@AfterTest
public void finishTest() {
	driver.quit();
}
*/

}
