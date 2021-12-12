package omecenTestNG.pages;

import org.openqa.selenium.By;

import omecenTestNG.base.BaseClass;

public class LoginPage extends BaseClass {
	
	public void userName(String userName ) {
	driver.findElement(By.name("username")).sendKeys(userName);	
		
	}
	
	public void passWord(String passWord) {
	driver.findElement(By.name("password")).sendKeys(passWord);	
		
		}
	
	public void signIn() {
		driver.findElement(By.id("kt_login_signin_submit")).click();	
		
	}
	
	
	
	
	
	
	
	
	
	

}
