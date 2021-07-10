package pagesPOM;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClasses.SeleniumBaseClass;
import utilitypackage.UtilityWrapperMethods;

public class NewContactReqPage extends SeleniumBaseClass{

	
	/*
	 * public NewContactReqPage(RemoteWebDriver driver, Properties prop) { // TODO
	 * Auto-generated constructor stub this.driver = driver; this.prop = prop; }
	 */
	public NewContactReqPage clickSearchContacts() {
		getDriver().findElementByXPath("//input[@title='Search Contacts']").click();
		return this;
	}
	public NewContactReqPage clickNewContIcon() {
		getDriver().findElementByXPath("//span[@title='New Contact']").click();
		return this;
	}
	public NewContactReqPage clickSalutation() {
		getDriver().findElementByXPath("//span[text()='Salutation']/parent::span/following-sibling::div//a").click();
		return this;
	}
	 public NewContactReqPage clickMr() {
		 getDriver().findElementByXPath("//a[@title='Mr.']").click();
		 return this;
	 }
	public NewContactReqPage enterFName(String strFN) {
		getDriver().findElementByXPath("//input[contains(@class,'firstName')]").sendKeys(strFN);
		return this;
	}
	
	public NewContactReqPage enterLName(String strLN) {
		getDriver().findElementByXPath("//input[contains(@class,'lastName')]").sendKeys(strLN);
		return this;
	} 
	
	public NewContactReqPage clickSave() {
		getDriver().findElementByXPath("//div[contains(@class,'modal-footer')]//span[text()='Save']").click();
		return this;
	}
	public NewContactReqPage verifySuccess() throws InterruptedException {
		WebElement eleSuccess = getDriver().findElementByXPath("//div[@data-key='success']/div//span");
		System.out.println("Contact Create success "+eleSuccess.getText());
		Thread.sleep(3000);
		return this;
	}	
	public ContactRequestDashBoardPage clickMainSave() throws InterruptedException {
		Thread.sleep(6000);
		WebElement eleMainSave = getDriver().findElementByXPath("//div[@class='inlineFooter']//span[text()='Save']");
		UtilityWrapperMethods.eleClick(getDriver(), eleMainSave);
		return new ContactRequestDashBoardPage();
		//return new ContactRequestDashBoardPage(driver, prop);
	}
	public NewContactReqPage enterReqDescription(String strDesc) {
		WebElement eleReqDescTextArea = getDriver().findElementByXPath("//span[text()='Request Description']/parent::label/following-sibling::textarea");
		UtilityWrapperMethods.eleSendKeys(getDriver(), eleReqDescTextArea, strDesc); 
		
		return this;
	}
	
	public NewContactReqPage enterPreferredPhone(String strDesc) {
		WebElement elePreferredPhone = getDriver().findElementByXPath("//span[text()='Preferred Phone Number']/parent::label/following-sibling::input");
		UtilityWrapperMethods.eleSendKeys(getDriver(), elePreferredPhone, strDesc); 
		
		return this;
	}
	
	public NewContactReqPage clickReqReasonDropDown() {
		WebElement eleReqReasonDropDown = getDriver().findElementByXPath("//*[text()='Request Reason']/parent::span/following-sibling::*//a");
		UtilityWrapperMethods.eleClick(getDriver(), eleReqReasonDropDown);
		return this;
	}
	
	public NewContactReqPage clickReqReasonValue(String strReqReasonVal) {
		WebElement eleReqReasonValue = getDriver().findElementByXPath("//a[@title='"+strReqReasonVal+"']");
		UtilityWrapperMethods.eleClick(getDriver(), eleReqReasonValue);
		return this;
	}
	
	public NewContactReqPage clickReqStatusDropDown() throws InterruptedException {
		Thread.sleep(6000);
		WebElement eleReqStatusDropDown = getDriver().findElementByXPath("//span[text()='Request Status']/parent::span/following-sibling::div//a");
		UtilityWrapperMethods.eleClick(getDriver(), eleReqStatusDropDown);
		return this;
	}
	public NewContactReqPage clickReqStatusAttempted() {
		WebElement eleAttemptedLink = getDriver().findElementByXPath("//a[@title='Attempted']");
		UtilityWrapperMethods.eleClick(getDriver(), eleAttemptedLink);
		return this;
	}
	
	
	public NewContactReqPage getLastModUser() {
		WebElement eleLastModUserlabel = getDriver().findElementByXPath("//*[text()='Last Modified By']/parent::div/following-sibling::div//span[contains(@class,'OutputText')]");
		System.out.println("Last Modified by = "+eleLastModUserlabel.getText());
		return this;
		
	}
	
	public NewContactReqPage getLastModDateTime() {
		WebElement eleLastModDateTimelabel = getDriver().findElementByXPath("//*[text()='Last Modified By']/parent::div/following-sibling::div//span[contains(@class,'OutputDateTime')]");
		System.out.println("Last Modified by = "+eleLastModDateTimelabel.getText());
		return this;
		
	}
	
}
