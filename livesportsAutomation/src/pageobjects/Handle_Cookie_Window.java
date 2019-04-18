package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;

@Page( title="Handle_Cookie_Window"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Handle_Cookie_Window {

	@LinkType()
	@FindBy(css = "a.btn.txtUpperCase.custStyleBtn.wrapper.closeBtn.desktop")
	public WebElement Handle_Cookie_Alert_OK;
	
	
			
}
