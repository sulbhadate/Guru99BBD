package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import static UtilsLayer.SelectClass.*;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass{
	
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	
	@FindBy(name="reg_email__")
	private WebElement reg_email__;
	
	
	@FindBy(name="reg_email_confirmation__")
	private WebElement reg_email_confirmation__;
	
	
	@FindBy(name="reg_passwd__")
	private WebElement reg_passwd__;
	
	@FindBy(name="birthday_day")
	private WebElement birthday_day;
	
	@FindBy(name="birthday_month")
	private WebElement birthday_month;
	
	@FindBy(name="birthday_year")
	private WebElement birthday_year;
	
	@FindBy(name="//input[@type='radio']")
	private WebElement radio;
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void registerPageFunctionality(String fname,String lname,String email,String confirmemail,String password,String date,String month,String year,String Radio)
	{
		sendKeys(firstname,fname);
		sendKeys(lastname,lname);
		sendKeys(reg_email__,email);
		sendKeys(reg_email_confirmation__,confirmemail);
		sendKeys(reg_passwd__,password);
		selectByVisibleText(birthday_day,date);
		selectByVisibleText(birthday_month,month);
		selectByVisibleText(birthday_year,year);
		selectByVisibleText(radio,Radio);
		
		
		
	}

}
