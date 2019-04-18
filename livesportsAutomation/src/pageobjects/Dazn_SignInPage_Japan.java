package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_SignInPage_Japan"                                
     , summary=""
     , relativeUrl=""
     , connection="daznmylogin"
     )             
public class Dazn_SignInPage_Japan {

	@ButtonType()
	@FindBy(xpath = "//button[contains(@class,'daznSignin')]/span[@class='buttonText']")
	public WebElement Dazn_SignInPage_Japan_Dazn;
	@TextType()
	@FindBy(xpath = "//input[@type='email']")
	public WebElement Dazn_SignInPage_Japan_email_textBox;
	@TextType()
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement Dazn_SignInPage_Japan_Password;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class,'SubmitButton')]")
	public WebElement Dazn_SingInPage_Japan_StartWatching;
			
}
