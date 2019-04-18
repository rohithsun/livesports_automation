package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.PageWaitAfter;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_help_termsPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_help_termsPage {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(field = "Dazn_help_termsPage_Terms_of_Use_Lable", timeoutSeconds = 10)
	@TextType()
	@FindBy(xpath = "//span[contains(@class, 'questCustom ng-binding')]")
	public WebElement Dazn_help_termsPage_Terms_of_Use_Lable;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(field = "Dazn_help_termsPage_RelatedArticles_Label", timeoutSeconds = 10)
	@TextType()
	@FindBy(xpath = "//span[contains(@class,'fontSmall ng-binding')]")
	public WebElement Dazn_help_termsPage_RelatedArticles_Label;
			
}
