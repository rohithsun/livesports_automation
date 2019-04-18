package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="SignIn"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class SignIn {

	@LinkType()
	@FindBy(xpath = "//a[contains(@href, 'signin')]")
	public WebElement signIn;
	@TextType()
	@FindBy(xpath = "//input[contains(@name, 'email')]")
	public WebElement Email;
	@TextType()
	@FindBy(xpath = "//input[contains(@name, 'password')]")
	public WebElement Password;
			
}
