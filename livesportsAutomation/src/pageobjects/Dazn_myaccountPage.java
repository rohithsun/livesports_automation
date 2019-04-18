package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.PageWaitAfter;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_myaccountPage"                                
, summary=""
, relativeUrl=""
, connection="dazn_mylogin"
		)             
public class Dazn_myaccountPage {

	@LinkType()
	@FindBy(xpath = "//a[contains(@id,\"editName\")]")
	public WebElement Dazn_myaccountPage_Personal_Details_Name_Edit;
	@TextType()
	@FindBy(xpath = "//input[contains(@id,\"idFirstname\")]")
	public WebElement Dazn_myaccountPage_Personal_Details_Name_Edit_First_Name;
	@TextType()
	@FindBy(xpath = "//input[contains(@id,\"idSurname\")]")
	public WebElement Dazn_myaccountPage_Personal_Details_Name_Edit_Last_Name;
	@PageWaitAfter.Timed(durationSeconds = 10)
	@LinkType()
	@FindBy(xpath = "//ul[@class=\"cancelSaveSec\"]/descendant::li[contains(@class,\"sveBtnNew\")]/descendant::a[text()]")
	public WebElement Dazn_myaccountPage_Personal_Details_Name_Edit_Save;
	@LinkType()
	@FindBy(xpath = "//ul[contains(@class,\"cancelSaveSec\")]/descendant::li[contains(@class,\"cancelBtnNew\")]/a[text()]")
	public WebElement Dazn_myaccountPage_Personal_Details_Name_Edit_Cancel;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,\"emailEdit\")]")
	public WebElement Dazn_myaccountPage_Personal_Details_Email_Address_Edit;
	@PageWaitAfter.Timed(durationSeconds = 10)
	@TextType()
	@FindBy(xpath = "//input[contains(@id,\"frmMyAccount:email\")]")
	public WebElement Dazn_myaccountPage_Personal_Details_Email_Address_Edit_Email;
	@PageWait.Timed(durationSeconds = 10)
	@TextType()
	@FindBy(xpath = "//input[contains(@id,\"frmMyAccount:idEmailPwd\")]")
	public WebElement Dazn_myaccountPage_Personal_Details_Email_Address_Edit_Password;
	@LinkType()
	@FindBy(xpath = "//ul[contains(@class,\"cancelSaveSec\")]/descendant::li[contains(@class,\"cancelBtnNew\")]/a[text()]")
	public WebElement Dazn_myaccountPage_Personal_Details_Email_Address_Edit_Cancel;
	@LinkType()
	@FindBy(xpath = "//ul[@class=\"cancelSaveSec\"]/descendant::li[contains(@class,\"sveBtnNew\")]/descendant::a[text()]")
	public WebElement Dazn_myaccountPage_Personal_Details_Email_Address_Edit_Save;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,\"frmMyAccount:ChangePassword\")]")
	public WebElement Dazn_myaccountPage_Personal_Details_Password_Change;
	@TextType()
	@FindBy(xpath = "//input[contains(@id,\"frmMyAccount:idCurrentPassword\")]")
	public WebElement Dazn_myaccountPage_Personal_Details_Password_Change_Current_Password;
	@TextType()
	@FindBy(xpath = "//input[contains(@id, \"frmMyAccount:password\")]")
	public WebElement Dazn_myaccountPage_Personal_Details_Password_Change_New_Password;
	@TextType()
	@FindBy(xpath = "//input[contains(@id,\"frmMyAccount:confirmPassword\")]")
	public WebElement Dazn_myaccountPage_Personal_Details_Password_Change_Confirm_New_Password;
	@TextType()
	@FindBy(xpath = "//ul[contains(@class,\"cancelSaveSec\")]/descendant::li[contains(@class,\"cancelBtnNew\")]/a[text()]")
	public WebElement Dazn_myaccountPage_Personal_Details_Password_Change_Cancel;
	@TextType()
	@FindBy(xpath = "//ul[@class=\"cancelSaveSec\"]/descendant::li[contains(@class,\"sveBtnNew\")]/descendant::a[text()]")
	public WebElement Dazn_myaccountPage_Personal_Details_Password_Change_Save;
	@LinkType()
	@FindBy(xpath = "//a[@href=\"ChangePaymentMethod\"]")
	public WebElement Dazn_myaccountPage_Subscription_Changepaymentmethod;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"giftcode\")]")
	public WebElement Dazn_myaccountPage_Subscription_Add_a_gift_code;
	@LinkType()
	@FindBy(xpath = "//a[@href=\"paymenthistory\"]")
	public WebElement Dazn_myaccountPage_Subscription_View_Payment_History;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class,\"cancelSub\")]")
	public WebElement Dazn_myaccountPage_Subscription_Cancel_Subscription;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,\"frmMyAccount:ConfirmDevicesSignOut\")]")
	public WebElement Dazn_myaccountPage_Signed_in_devices_Sign_Out_From_All_Device;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class,\"okBtn\")]")
	public WebElement Dazn_myaccountPage_Sign_Out_From_all_devices_banner_Cancel;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,\"frmMyAccount:SignOutAllDevices\")]")
	public WebElement Dazn_myaccountPage_Sign_Out_From_all_devices_banner_Sign_Out;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,\"SaveLanguageBtn\")]")
	public WebElement Dazn_myaccountPage_Language_Save_Lang;
	@TextType()
	@FindBy(id = "pwdValidation")
	public WebElement dazn_myaccount_PasswordError;

	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'emailvalidation')]")
	public WebElement Dazn_Myaccount_EmailEditErrorMessage;
	@LinkType()
	@FindBy(linkText = "MY ACCOUNT")
	public WebElement Dazn_myaccountPage_MyAccount_Label;
	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"helpLink\")]//a")
	public WebElement Dazn_myaccountPage_Footer_Help_Link;
	@LinkType()
//	@FindBy(xpath = "//li[contains(@class, \"help/term\")]//a")
	@FindBy(xpath = "//a[contains(@href, \"/help/terms\")]")
	public WebElement Dazn_myaccountPage_Footer_Terms_of_Use_Link;
	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"imprintLink\")]//a")
	public WebElement Dazn_myaccountPage_Footer_Imprint_Link;
	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"faqLink\")]//a")
	public WebElement Dazn_myaccountPage_Footer_FAQ_Link;
	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"privacyLink\")]//a")
	public WebElement Dazn_myaccountPage_Footer_Privacy_Policy_Link;
	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"redeemLink\")]//a")
	public WebElement Dazn_myaccountPage_Footer_Redeem_Link;
	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"mediaLink\")]//a")
	public WebElement Dazn_myaccountPage_Footer_Media_Link;
	@TextType()
	@FindBy(xpath = "//li[contains(@class, \"tradeList\")]")
	public WebElement Dazn_myaccountPage_FooterDazn_assert;

	@TextType()
	@FindBy(xpath = "//h1[contains(@class, \"banner\")]")
	public WebElement Dazn_myaccountPage_Cancellation_Success_Pop_up_Assert;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'col-xs-12 col-sm-12 col-md-12 signOutAllBtn')]/span/a")
	public WebElement Dazn_myaccountPage_Cancellation_Success_Pop_up_OK_Button;
	@TextType()
	@FindBy(xpath = "//h1[contains(@class, \"banner\")]")
	public WebElement Dazn_myaccountPage_Welcome_Back_Pop_up_Assert;
	@LinkType()
	@FindBy(xpath = "//span[1]/div[2]/div/span[1]//a")
	public WebElement Dazn_myaccountPage_Welcome_Back_Pop_up_OK_Button; 

	@LinkType()
	@FindBy(linkText = "REACTIVATE SUBSCRIPTION")
	public WebElement Dazn_myaccountPage_Reactivate_Subscription_Button;
	@LinkType()
	@FindBy(linkText = "SUBSCRIBE")
	public WebElement Dazn_resubscribePage_Reactivate_Subscription_Subscribe_Button;
	@LinkType()
	@FindBy(linkText = "OK")
	public WebElement Dazn_resubscribePage_Reactivate_Subscription_Ok_Button;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'setPauseLink')]")
	public WebElement Dazn_myaccountPage_Change_Your_Restart_Date_Link;
	/*@LinkType()
	@FindBy(linkText = "De-register device")
	public WebElement Dazn_myaccountPage_deRegisterSingleDevice;*/
	@LinkType()
	@FindBy(xpath = "//*[contains(@id,\"frmMyAccount:btnSignUp\")]")
	public WebElement Dazn_myaccountPage_Sign_Out_From_Single_device_banner_Sign_Out;


	//Rajya Lakshmi
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'theLangRepeat:1')]")
	public WebElement Dazn_myaccountPage_Language_Otherthan_English;
	@TextType()
	@FindBy(xpath = "//h1[contains(@class, \"banner\")]")
	public WebElement Dazn_myaccountPage_changePay_banner_header;
	@TextType()
	@FindBy(xpath = "//span[contains(@class,'alertStat')]")
	public WebElement Dazn_myaccountPage_Success_message;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class,'okBtn')]")
	public WebElement Dazn_myaccountPage_ChangePayment_success_button;
	@TextType()
	@FindBy(xpath = "//label[@for=\"input-id\" and @class='sectionHeader detailsHdr']")
	public WebElement Dazn_myaccountPage_Header_PersonalDetails;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'j_id75')]/descendant::div[2]")
	public WebElement Dazn_myaccountPage_PersonalDetails_name_Label;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idName')]//div[contains(@class,'displayValue')]") 
	public WebElement Dazn_myaccountPage_PersonalDetails_Name_Value;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'j_id114')]//div[contains(@class,'subSectionHead')]")
	public WebElement Dazn_myaccountPage_PersonalDetails_Email_Label;
	@LinkType()
	@FindBy(xpath = "//span[contains(@id,'idEmail')]//div[contains(@class,'displayValue')]")
	public WebElement Dazn_myaccountPage_personalDetails_Email_Value;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idPassword')]/span/descendant::div[1]/descendant::div[1]")
	public WebElement Dazn_myaccountPage_PersonalDetails_Password_Label;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'displayPassword')]")
	public WebElement Dazn_myaccountPage_PersonalDetails_Password_Value;
	@TextType()
	@FindBy(xpath = "//label[contains(@class,'subscriptionHdr')]")
	public WebElement Dazn_myaccount_Subscription_Label;
	@TextType()
	@FindBy(xpath = "//span[contains(@class,'subscriptionDesc')]/span")
	public WebElement Dazn_myaccountPage_Monthly_Subscription_Label;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[1]/span[1]")
	public WebElement Dazn_myaccountPage_Subscription_Free_trail__Label;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[1]/span[2]")
	public WebElement Dazn_myaccountPage_subscription__Free_Trail__Value;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[2]/span[1]")
	public WebElement Dazn_myaccountPage_Subscription_subscription_Price_label;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[2]/span[2]")
	public WebElement Dazn_myaccountPage_Subscription_Subscription_price_value;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[1]/span[1]")
	public WebElement Dazn_myaccountPage_Subscription_ActivePaid_subscription_Price_label;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[1]/span[2]")
	public WebElement Dazn_myaccountPage_Subscription_ActivePaid_Subscription_price_value;
	
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[3]/span[1]")
	public WebElement Dazn_myaccountPage_Subscription_next_payment_label;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[3]/span[2]")
	public WebElement Dazn_myaccountPage_Subscription_Next_Payment_date_Value;
	
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[2]/span[1]")
	public WebElement Dazn_myaccountPage_Subscription_ActiveApid_next_payment_label;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[2]/span[2]")
	public WebElement Dazn_myaccountPage_Subscription_ActiveApid_Next_Payment_date_Value;


	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[5]/span[1]")
	public WebElement Dazn_myaccountPage_subscription_Subscription_Message_Renewal;
		@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[4]/span[1]")
	public WebElement Dazn_myaccountPage_subscription_ActivePaid_Subscription_Message_Renewal;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[3]")
	public WebElement Dazn_myaccount_Subscription_subscription_message_1;
	

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'payMethodHdr')]")
	public WebElement Dazn_myaccountPage_Subscription_Payment_method_Label;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href,'portability')]")
	public WebElement Dazn_myaccountPage_Subscription_Learn_more;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'8 margBot5 paymentDetails')]")
	public WebElement Dazn_MyaccountPage_Subscription_Payment_method_Value;
	@TextType()
	@FindBy(xpath = "//label[contains(@class,'laguageLbl')]")
	public WebElement Dazn_myaccountPage_Language_Label;
	@TextType()
	@FindBy(xpath = "//div[@class='margBot20']")
	public WebElement Dazn_myaccountPage_Language_Message;
	@TextType()
	@FindBy(xpath = "//*[@id='j_id0:frmMyAccount:theLangRepeat:1:iRow']/li/div/label/div/div")
	public WebElement Dazn_myaccountPage_Language_English_Radio;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"myAccount\")]")
	public WebElement Dazn_myaccountPage_My_Account_label;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'PreferenceSec')]/div/label")
	public WebElement Dazn_myaccountPage_Email_Preference_Label;
	@TextType()
	@FindBy(xpath = "//div[@id=\"ember1340\"]/label/p")
	public WebElement Dazn_myaccountPage_Email_Preferences_CheckBox1_Message;
	@TextType()
	@FindBy(xpath = "//input[contains(@class, \"chkBox\")]")
	public WebElement Dazn_myaccountPage_EmailPreference_CheckBox_1;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'0:iRow')]/li/div/input")
	public WebElement Dazn_myaccount_Page_Language_Non_English_Radio_Button;
	@TextType()
	@FindBy(xpath = "//label[@for='en_gb']")
	public WebElement Dazn_myaccountPage_Language_select_English;
	@LinkType()
	@FindBy(xpath = "//a[@class='backToHome']")
	public WebElement Dazn_myaccountPage_Back_to_Home_Link;
	@TextType()
	@FindBy(xpath = "//a[contains(@href,'/contactUs')]")
	public WebElement Dazn_myaccountPage_changepayment_went_Wrong_message;
	@TextType()
	@FindBy(xpath = "//a[contains(@href,'/contactUs')]")
	public WebElement Dazn_myaccountPage_Paymentwent_wrong;
	@TextType()
	@FindBy(xpath = "//div[contains(@id, 'NFLMarketingPreferences')]//label/p")
	public WebElement Dazn_myaccountPage_Email_Preferences_NFL_Assert_CA_;
	@TextType()
	@FindBy(xpath = "//div[contains(@onclick,'NFLPreferences')]//div[contains(@class,'layer-1')]")
	public WebElement Dazn_myaccountPage_Email_Preferences_NFL_Checkbox__CA_;
	@TextType()
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Account status:')]/following-sibling::span") 
	public WebElement Dazn_myaccountPage_Subscription_AccountStatus1; 

	@TextType()
	@FindBy(xpath = "//span[contains(@id,'j_id224')]//div[contains(@class,'payMethodHdr')]")
	public WebElement Dazn_myaccountPage_Subscription_LastPaymentMethod_Label;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'j_id224')]//div[contains(@class,'paymentDetails')]")
	public WebElement Dazn_myaccountPage_Subscription_LastPaymentMethod_Value;
	/*@TextType()
	@FindBy(xpath = "//div[contains(@id, 'NFLMarketingPreferences')]//label/p")
	public WebElement Dazn_myaccountPage_Email_Preferences_NFL_Assert_CA_;
	@TextType()
	@FindBy(xpath = "//input[contains(@name, 'j_id0:frmMyAccount:j_id327')]")
	public WebElement Dazn_myaccountPage_Email_Preferences_NFL_Checkbox__CA_;*/
	@LinkType()
	@FindBy(xpath = "//a[contains(@class,'okBtn')]")
	public WebElement Dazn_myaccountPage_ChangePayment_somethingwentWrong_button;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[2]/span[1]")
	public WebElement Dazn_myaccountPage_Subscription_PauseStarts_Label;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[2]/span[2]")
	public WebElement Dazn_myaccountPage_Subscription_PauseStarts_Value;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[3]/span[1]")
	public WebElement Dazn_myaccountPage_Subscription_PauseEnds_Label;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[3]/span[2]")
	public WebElement Dazn_myaccountPage_Subscription_PausEnds_Value;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, 'okBtn')]")
	public WebElement Dazn_myaccountPagePauseConfirmedBanner_Ok_Button;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, 'okBtn')]")
	public WebElement Dazn_myaccountPagePauseAmendedBanner_Ok_Button;


	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'j_id0:frmMyAccount:j_id224')]//div[@class= 'col-xs-12 col-sm-12 col-md-12 col-lg-12 payMethodHdr']")
	public WebElement Dazn_myaccountPage_Subscription_LastPaymentMade_Label;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'j_id0:frmMyAccount:j_id224')]//div[@class= 'col-xs-12 col-sm-12 col-md-12 col-lg-12 paymentDetails']")
	public WebElement Dazn_myaccountPage_Subscription_LastPaymentMade_Value;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class,\"cancelSub daznActive\")]")
	public WebElement Dazn_myaccountPage_Keep_My_Dazn_Active_Button; 
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'viewMoreDev')]/a")
	public WebElement Dazn_myaccountPage_Devices_ViewMore;
	@LinkType()
	@FindBy(xpath = "//span[contains(@class,'trashBtn')]/a[contains(@onclick,':theRepeat:0')]")
	public WebElement Dazn_myaccountPage_deRegisterSingleDevice;
	@LinkType()
	@FindBy(xpath = "//span[contains(@class,'trashBtn')]/a[contains(@onclick,':theRepeat:1')]")
	public WebElement Dazn_myaccountPage_deRegisterSingleDevice_PrevSession;

	@LinkType()
	@FindBy(xpath = "//a[contains(@class, 'okBtn')]")
	public WebElement Dazn_myaccountPage_Keep_My_Dazn_Active_Your_DAZN_Will__Stay_Active_Pop_Up_OK_Button;

	@LinkType()
	@FindBy(xpath = "//a[contains(@class, 'backToHome')]")
	public WebElement Dazn_myaccountPage_BackToHome_Link;


	@TextType()
	@FindBy(xpath = "//span[contains(@id,'idSubscription')]/div[2]/descendant::div[1]/span[4]")
	public WebElement Dazn_myaccount_ActiveRecord_subscription_message_1;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'bannerContent')]//h1")
	public WebElement Dazn_myaccountPagePauseAmendedBanner_assert; 
	
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, 'cancelSub')]")
	public WebElement Dazn_myaccountPage_Restart_Now_Button;
	@TextType()
	@FindBy(xpath = "//*[contains(@id, \"frmMyAccount:theLangRepeat:1:iRow\")]/li/div//label")
	public WebElement Dazn_MyAccountPage_NonENG_RadioBtn;
	
	@TextType()
	@FindBy(xpath = "//*[contains(@id, \"frmMyAccount:theLangRepeat:0:iRow\")]/li/div//label")
	public WebElement Dazn_MyAccountPage_ENG_RadioBtn;
	
	@LinkType()
	@FindBy(xpath = "//*[contains(@id,'frmMyAccount:idSaveEmailPrefBtn')]")
	public WebElement Dazn_myaccountPage_Email_Save_Button;
	
}
