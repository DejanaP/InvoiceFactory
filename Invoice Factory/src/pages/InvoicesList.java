package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoicesList extends PageObject{
	
	public InvoicesList(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className="v-select__slot")
	WebElement chooseClient;
	@FindBy(name="Miroslav Popovic")
	List<WebElement> client;
	@FindBy(id="filter-from")
	WebElement date;
	@FindBy(id="filter-to")
	WebElement date2;
	@FindBy(className="v-btn__content")
	WebElement selectMonth;
	@FindBy(id="this-month")
	WebElement thisMonth;
	@FindBy(id="filter-reset")
	WebElement reset;
	
}
	