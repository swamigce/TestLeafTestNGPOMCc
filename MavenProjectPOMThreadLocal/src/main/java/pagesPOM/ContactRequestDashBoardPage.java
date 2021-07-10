package pagesPOM;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.SeleniumBaseClass;
import utilitypackage.UtilityWrapperMethods;

public class ContactRequestDashBoardPage extends SeleniumBaseClass{
	//WebDriverWait wait = new WebDriverWait(driver, 20);
	
	/*
	 * public ContactRequestDashBoardPage(RemoteWebDriver driver, Properties prop) {
	 * // TODO Auto-generated constructor stub this.driver = driver; this.prop =
	 * prop; }
	 */
	public NewContactReqPage clickNew() {
		getDriver().findElementByXPath("//div[@title='New']").click();
		return new NewContactReqPage();
		
	}
	public ContactRequestDashBoardPage verifySuccess() {
		WebElement eleSuccess = getDriver().findElementByXPath("//div[@data-key='success']/div//span");
		System.out.println(eleSuccess.getText());
		
		return this;
	}
	
	public ContactRequestDashBoardPage getContactReqNumber() {
		WebElement eleContactNum = getDriver().findElementByXPath("//div[text()='Contact Request']/following-sibling::div");
		System.out.println(eleContactNum.getAttribute("title"));
		strContactReq = eleContactNum.getAttribute("title");
		return this;
	}
	
	public ContactRequestDashBoardPage clickDownIcon(String strdelReq) {
		System.out.println("Contact Req# for DownIcon= "+strdelReq);
		//WebElement eleDownIcon = driver.findElementByXPath("//a[@title='"+strContactReq+"']/ancestor::th/following-sibling::td//a");
		WebElement eleDownIcon = getDriver().findElementByXPath("//a[@title='"+strdelReq+"']/ancestor::th/following-sibling::td//a");
		UtilityWrapperMethods.eleClick(getDriver(), eleDownIcon);
		return this;
	}
	
	public ContactRequestDashBoardPage clickDelete() {
		WebElement eleDeleteLink = getDriver().findElementByXPath("//li/a[@title='Delete']");
		UtilityWrapperMethods.eleClick(getDriver(), eleDeleteLink);
		return this;
	}
	
	public NewContactReqPage clickEdit() {
		WebElement eleDeleteLink = getDriver().findElementByXPath("//li/a[@title='Edit']");
		UtilityWrapperMethods.eleClick(getDriver(), eleDeleteLink);
		return new NewContactReqPage();
		//return new NewContactReqPage(driver, prop);
	}
	
	public ContactRequestDashBoardPage clickDeleteBtn() {
		WebElement eleDelBtn = getDriver().findElementByXPath("//span[text()='Delete']");
		//UtilityWrapperMethods.eleClick(getDriver(), eleDelBtn);
		return this;
	}
	
	public ContactRequestDashBoardPage verifyDelSuccess(String strDelReq) {
		WebElement eleSuccess = getDriver().findElementByXPath("//div[@data-key='success']/div//span");
		System.out.println(eleSuccess.getText());
		String strTostrMsg = eleSuccess.getText();
		if(strTostrMsg.contains(strDelReq)) {
			if(strTostrMsg.contains("was deleted")) {
				System.out.println("Contact Request Deleted successfully, Hence Test is pass");
			}else {
				System.out.println("Test Failed. Not deleted");
			}
		}else {
			System.out.println("Test Failed. Not deleted request ");
		}
		
		return this;
		}

	public ContactRequestDashBoardPage verifyCloneSuccess() {
		WebElement eleSuccess = getDriver().findElementByXPath("//div[@data-key='success']/div//span");
		System.out.println(eleSuccess.getText());
		String strTostrMsg = eleSuccess.getText();
		if(strTostrMsg.contains("Contact Request")) {
			if(strTostrMsg.contains("was created")) {
				System.out.println("Contact Request Cloned successfully, Hence Test is pass");
			}else {
				System.out.println("Test Failed. Not Cloned");
			}
		}else {
			System.out.println("Test Failed. Not Cloned request ");
		}
		
		return this;
		}
	public ContactRequestDashBoardPage verifyReqStatus(String strEditReq, String strReqStatusValue) {
		WebElement eleReqStatusLabel  = getDriver().findElementByXPath("//a[@title='"+strEditReq+"']/ancestor::th/following-sibling::td[1]//span/span");
		if(eleReqStatusLabel.getText().equalsIgnoreCase(strReqStatusValue)) {
			System.out.println("Request Status is updated, Hence This test cases is pass");
		}else {
			System.out.println("Request Status is not updated, Hence This test cases is Failed ");
		}
		return this;
	}
	
	public ContactRequestDashBoardPage clickRecentlyViewed() {
		WebElement eleRecentlyViewedLink = getDriver().findElementByXPath("//*[text()='Contact Requests']/following-sibling::span[text()='Recently Viewed']");
		UtilityWrapperMethods.eleClick(getDriver(), eleRecentlyViewedLink);
		return this;
	}
	public ContactRequestDashBoardPage clickAllContactsReqs() {
		WebElement eleAllContactReqsLink = getDriver().findElementByXPath("//span[text()='All Contact Requests']");
		UtilityWrapperMethods.eleClick(getDriver(), eleAllContactReqsLink);
		return this;
	}
	public ContactRequestPage clickContactReq(String strdelReq) {
		System.out.println("Contact Req# = "+strdelReq);
		//WebElement eleDownIcon = driver.findElementByXPath("//a[@title='"+strContactReq+"']/ancestor::th/following-sibling::td//a");
		WebElement eleContReqNum = getDriver().findElementByXPath("//a[@title='"+strdelReq+"']");
		UtilityWrapperMethods.eleClick(getDriver(), eleContReqNum);
		return new ContactRequestPage();
		//return new ContactRequestPage(driver, prop);
	}
}
