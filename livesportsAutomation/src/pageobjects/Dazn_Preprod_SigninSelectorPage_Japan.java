package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Dazn_Preprod_SigninSelectorPage_Japan"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_Preprod_SigninSelectorPage_Japan {

	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"btn txtUpperCase custStyleBtn wrapper\")]")
	public WebElement Dazn_Preprod_SigninSelectorPage_Japan;
			
}
