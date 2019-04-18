package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Dazn_Docomo_SignIn_Password_Page"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_Docomo_SignIn_Password_Page {

	@TextType()
	@FindBy(xpath = "//input[@name='authpass']")
	public WebElement Dazn_Docomo_SignIn_Password_TextBox_Page;
	@ButtonType()
	@FindBy(xpath = "//input[@class=\"button_submit nextaction\"]")
	public WebElement Dazn_Docomo_SignIn_Password_Page_Next_Button;
			
}
