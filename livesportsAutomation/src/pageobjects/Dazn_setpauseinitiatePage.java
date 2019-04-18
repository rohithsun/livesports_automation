package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_setpauseinitiatePage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_setpauseinitiatePage {

	@TextType()
	@FindBy(xpath = "//input[contains(@id, 'resumeDate')]")
	public WebElement Dazn_setpauseinitiatePage_Select_Your_Restart_Date_Calendar_Icon;
	@TextType()
	@FindBy(xpath = "//a[contains(@href,\"initiate\")]")
	public WebElement Dazn_setpauseinitiatePage_Go_Ahead_Pause_Button;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id, 'setPauseForm:stay')]")
	public WebElement Dazn_setpauseinitiatePage_No__I_want_To_Stay_Button;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href, '/cancel')]")
	public WebElement Dazn_setpauseinitiatePage_I_still_want_to_cancel_Link;
	@TextType()
	@FindBy(xpath = "//li[contains(@class, \"picked\")]")
	public WebElement Dazn_setpauseinitiatePage_Select_Your_Restart_Date_From_Calendar;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,\"datepicker-panel\")]/ul[2]/li")
	public WebElement Dazn_setpauseinitiatePage_Select_Your_Restart_Date_Calendar_CrossIcon;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,\"setPauseForm:pause\")]")
	public WebElement Dazn_setpauseinitiatePage_Go_Ahead_Pause_Confirm_Button;
	@LinkType()
	@FindBy(linkText = "OK")
	public WebElement Dazn_setpauseinitiatePage_Go_Ahead___Pause_Ok_Button;
	@TextType()
	@FindBy(xpath = "//*[contains(@id,\"setPauseForm:confirm\")]")
	public WebElement Dazn_setpauseinitiatePage_Confirm_RestartDate_Button;
	
	@TextType()
//	@FindBy(xpath = "//li[@class='muted' and @data-view='day next'][1]")
	
	@FindBy(xpath = "//li[@data-view='day' or @class='muted disabled' and @ data-view='day next'][1]")
	public WebElement Dazn_setpasuseinitiatePage_Amend_Date;		
}
