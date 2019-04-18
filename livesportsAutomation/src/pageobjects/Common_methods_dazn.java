package pageobjects;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page(title = "Common_methods_dazn", connection = "DAZN")
public class Common_methods_dazn {
	WebDriver driver;
	WebDriverWait wait;
	public Common_methods_dazn(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, 25);
	}

	public void click_Link(String linkname) {


		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//a[text()='%s']", linkname))));
		element.click();
		//driver.findElement(By.xpath(String.format("//a[text()='%s']", linkname))).click();
	}

	public void verify_Link_Exist(String linkname) {
		WebDriverWait wait = new WebDriverWait(driver, 25);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//a[text()='%s']", linkname))));
		element.isDisplayed();
		////*[text()="CHANGE LANGUAGE"]
	}

	public void verify_TextBox_ErrorMessage(String fieldlabel, String Errormsg) {
		WebDriverWait wait = new WebDriverWait(driver, 25);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//span[text()='%s']/following::span[1][text()=\"%s\"]", fieldlabel,Errormsg))));
		element.isDisplayed();
		////span[text()='%s']/following::div[@class='Hint error'][1]/div/span[text()="%s"][1]
		////span[text()='%s']/following::span[1][text()=\"%s\"]
	}
	public void verify_Text_Exist(String text) {
		WebDriverWait wait = new WebDriverWait(driver, 25);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//*[text()=\"%s\"]", text))));
		element.isDisplayed();
		////*[text()="CHANGE LANGUAGE"]
	}

	public void clickLanguageCheckBox(String lang){

		WebDriverWait wait = new WebDriverWait(driver, 25);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(lang))); //input[contains(@class,'RadioOption') and contains(@id,'ja')]
		element.click();
	}

	@TextType()
	@FindBy(name = "j_id0:fMylogin:idemail121")
	public WebElement myaccemail;


	public boolean verifySixRegisteredDevices(int size){

		WebDriverWait wait = new WebDriverWait(driver, 25);

		List<WebElement> element = driver.findElements(By.xpath("//span[contains(@class,'deviceNamed')]"));
		if(size>1){
			for(int i=0;i<size;i++){
				driver.findElement(By.xpath("//span[contains(@id,'frmMyAccount:theRepeat:"+i+":theValue')]")).isDisplayed();

				System.out.println("devices are displayed");
				return true;
			}
		}else{
			return false;
		}
		return true;
	}
	public String lowerCaseString(String str){
		String var = str.toLowerCase();
		return var;
	}

	public String upperCaseString(String str){
		String var =str.toUpperCase();
		return var;
	}

	public int NumberOfRegisteredDevices(){

		WebDriverWait wait = new WebDriverWait(driver, 25);

		List<WebElement> devices=driver.findElements(By.xpath("//div[contains(@class,'trashSymbl')]"));

		int NumberofDevices=devices.size();

		return NumberofDevices;

	}


	public int NumberOfDevicesInSalesForce(){

		WebDriverWait wait = new WebDriverWait(driver, 25);

		driver.switchTo().frame(driver.findElement(By.id("0669E000000Ds2n")));

		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id,'userDevicesTable')]/tbody/tr"));

		int NumberofDevicesInSalesForce=rows.size();

		return NumberofDevicesInSalesForce;

	}
	public void SelectingFromContactUs(String Subject){
		WebDriverWait wait = new WebDriverWait(driver, 25);

		List<WebElement> DropDown = driver.findElements(By.xpath("//blockquote[@id='ddMenu']//span[contains(@id,'id')]//li/div"));

		for(WebElement Values : DropDown){

			String DropDownValue=Values.getText();

			if(Subject.equals(DropDownValue)){

				Values.click();

			} else{
				continue;
			}
		}
	}
	public void LoginToDaznFromSF(){
		WebDriverWait wait = new WebDriverWait(driver, 25);

		List<WebElement> DropDown = driver.findElements(By.xpath("//input[@id='workWithPortalGo']"));

		if(DropDown.size()>0){
			driver.findElement(By.xpath("//select[@id='workWithPortalSelect']")).click();

			driver.findElement(By.xpath("//select[@id='workWithPortalSelect']//option[3]")).click();

			driver.findElement(By.xpath("//input[@id='workWithPortalGo']")).click(); 
		}
		else{

			driver.findElement(By.xpath("//span[@id='workWithPortalLabel']")).click();

			driver.findElement(By.xpath("//div[@id='workWithPortal']/div[2]/a[2]")).click();
		}
	}
	public int YearsInCreditCard(){

		WebDriverWait wait = new WebDriverWait(driver, 25);
		Calendar now = Calendar.getInstance();
		int CurrentYear=now.get(Calendar.YEAR);
		return CurrentYear;
	} 

public boolean MonthsInCreditCard(){

		
			boolean flag=false;
		ArrayList<String> list1 =new ArrayList();
		List<WebElement> listValues=driver.findElements(By.xpath("//div[contains(@class,'selectMonthpicker')]//ul/li/a/span[1]")); 

		for(WebElement eachTab: listValues)
		{
			String s = eachTab.getText().trim();
			list1.add(s);

		}
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("");
		list2.add("01");
		list2.add("02");
		list2.add("03");
		list2.add("04");
		list2.add("05");
		list2.add("06");
		list2.add("07");
		list2.add("08");
		list2.add("09");
		list2.add("10");
		list2.add("11");
		list2.add("12");
		
		int actualSize=0;
		
		if(list1.equals(list2)){
			flag = true;
		}       
		return flag;
	} 
 public void Select_Dazn_ContactUs_Dropdown(String cs_accounttype, String cs_subject, String cs_topic, String cs_query, String cs_emailaddress, String cs_comment) throws InterruptedException {

              //Select Account Type details
              if(cs_accounttype != null){
                     WebElement mySelectAccType = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format("//span[contains(@id, 'idProvider')]/li[@name=\"%s\"]", cs_accounttype))));
                     mySelectAccType.click();
              }

              //Select Subject details
              if(cs_subject!=null){
              WebElement mySelectSubjectdd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='caseTypeSendPanel']")));
              mySelectSubjectdd.click();
              Thread.sleep(2000);
              WebElement mySelectSubject = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//span[contains(@id, 'contactUsFrm:subjectPanel')]/span/li[@name=\"%s\"]", cs_subject))));
              mySelectSubject.click();
              }
              
              //Select Topic details
              if(cs_topic!=null){
              WebElement mySelectTopicdd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='caseSubTypeSendPanel']")));
              mySelectTopicdd.click();
              WebElement mySelectTopic = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//span[contains(@id, 'contactUsFrm:subTypePanel')]/span/li[@name=\"%s\"]", cs_topic))));
              mySelectTopic.click();
              }
              //Select Query details
              if(cs_query!=null){
              WebElement mySelectQuerydd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='caseSubType2SendPanel']")));
              mySelectQuerydd.click();
              WebElement mySelectQuery = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//span[contains(@id, 'contactUsFrm:subType2Panel')]/span/li[@name=\"%s\"]", cs_query))));
              mySelectQuery.click();
              }
              
              //Enter email details
              if(cs_emailaddress != null){
                     WebElement emailadd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@id, 'contactUsFrm:emailAddress')]")));
                     emailadd.sendKeys(cs_emailaddress);
              }
              
              //Enter description details
              if(cs_comment != null){
                     WebElement cscomment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[contains(@id, 'contactUsFrm:comment')]")));
                     cscomment.sendKeys(cs_comment);
              }
       }
 
 public void getcurrenturl(){
 WebDriverWait wait = new WebDriverWait(driver, 25);
 String getUrl=driver.getCurrentUrl();
 if(getUrl.equals("https://be.cognizant.com")){

	driver.navigate().refresh();
	try{
	Thread.sleep(2000);}
	catch (Exception e) {
		// TODO: handle exception
	}
 }
}
}
