package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DAZN_ChangePasswordPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class DAZN_ChangePasswordPage {

	@TextType()
	@FindBy(id = "changePassword:theForm:password")
	public WebElement Dazn_reset_password_page_field_verify;
	@TextType()
	@FindBy(xpath = "//input[contains(@name,'password')]")
	public WebElement Dazn_ChangePasswordPage_New_Password_Textbox;
	@TextType()
	@FindBy(xpath = "//input[contains(@name,'confirmPassword')]")
	public WebElement Dazn_ChangePasswordPage_Verify_New_Password_Textbox;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//a[contains(@id,'cpwbtn')]")
	public WebElement Dazn_ChangePasswordPage_Change_Password_Button;
			
}
