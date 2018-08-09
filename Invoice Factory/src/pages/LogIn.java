package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogIn extends PageObject {

	public LogIn(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="login-form-email")
	WebElement email;
	
	@FindBy(id="login-pass")
	WebElement password;
	
	@FindBy(id="login-form-btn")
	WebElement loginbutton;
	
	@FindBy(className="v-messages__message")
	WebElement errorMsg;
	
	@FindBy(id="home-page-user")
	WebElement myAccount;
	
	public void fillInputs(String email, String password) {
		this.email.clear();
		this.email.sendKeys(email);
		
		
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	public void submit() {
		loginbutton.click();
	}
	
	public boolean isAt() {
		return email.isDisplayed();
	}
	public boolean isMsgPresent() {
		wait.until(ExpectedConditions.visibilityOf(errorMsg));
		return errorMsg.isDisplayed();
	
    }
	
	public boolean myAccountVerify() {
		return myAccount.isDisplayed();
	}

	
		
	}

	


