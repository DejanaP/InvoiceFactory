package tests;






import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;



import pages.LogIn;



public class LogTest extends Browser {
	
	
	@Test(priority = 0)
	public void signIn() {
		LogIn log = new LogIn(driver);
		
		
		driver.get("http://app.invoice-factory.source-code.rs/login");
		Assert.assertTrue(log.isAt());
		
		log.fillInputs("", "");
		log.submit();
		
		  	
	}
	
	
	@Test(priority = 1)
	public void signIn1() {
		LogIn log = new LogIn(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs/login");
		Assert.assertTrue(log.isAt());
		
		log.fillInputs("dajenbovari@gmail.com", "");
		log.submit();
		
		assertTrue(log.isMsgPresent());
		  	
	}
	
	@Test(priority = 2)
	public void signIn2() {
		LogIn log = new LogIn(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs/login");
		Assert.assertTrue(log.isAt());
		
		log.fillInputs("", "qwe123");
		log.submit();
		
		assertTrue(log.isMsgPresent());
		  	
	}
	
	@Test(priority = 3)
	public void signIn3() {
		LogIn log = new LogIn(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs/login");
		Assert.assertTrue(log.isAt());
		
		log.fillInputs("dajenbovarigmail.com", "qwe123");
		log.submit();
		
		assertTrue(log.isMsgPresent());
		  	
	}
	
	@Test(priority = 4)
	public void signIn4() {
		LogIn log = new LogIn(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs/login");
		Assert.assertTrue(log.isAt());
		
		log.fillInputs("DAjenBovari@gmail.com", "qwe125");
		log.submit();
		
		
		  	
	}
	
	@Test(priority = 5)
	public void signIn5() {
		LogIn log = new LogIn(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs/login");
		Assert.assertTrue(log.isAt());
		
		log.fillInputs("dajenbovari@gmail.com", "qwe123");
		
		log.submit();
		  	
	}
	
	 @Test(priority=6) 
	  public void canGoToMyAccount() {
		  LogIn log = new LogIn(driver);
		  log.myAccountVerify();
		  
		  //LogIn log2 = new LogIn(driver);
		  assertTrue(log.myAccountVerify());
	  }

	
}
	
	
	
	
	
	
		
