package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Dazn_Docomo_SignIn_Page"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_Docomo_SignIn_Page {

	@TextType()
	@FindBy(xpath = "//input[@name=\"authid\"]")
	public WebElement Dazn_Docomo_SignIn_Page_UserName_TextBox;
	@ButtonType()
	@FindBy(xpath = "//input[@name=\"subForm\"]")
	public WebElement Dazn_Docomo_SignIn_Page;
			
}
