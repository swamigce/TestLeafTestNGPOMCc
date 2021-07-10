package pagesPOM;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClasses.SeleniumBaseClass;
import utilitypackage.UtilityWrapperMethods;

public class ContactRequestPage extends SeleniumBaseClass{
	/*
	 * public ContactRequestPage(RemoteWebDriver driver, Properties prop) {
	 * this.driver=driver; this.prop=prop;
	 * 
	 * }
	 */

	public NewContactReqPage clickCloneBtn() {
		WebElement eleCloneBtn = getDriver().findElementByXPath("//div[@title='Clone']");
		UtilityWrapperMethods.eleClick(getDriver(), eleCloneBtn);
		return new NewContactReqPage();
		//return new NewContactReqPage(driver, prop);
	}
	
}
