package pagesPOM;

import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import baseClasses.SeleniumBaseClass;

public class SalesForceHomePage extends SeleniumBaseClass{

	/*
	 * public SalesForceHomePage(RemoteWebDriver driver, Properties prop) { // TODO
	 * Auto-generated constructor stub this.driver=driver; this.prop = prop; }
	 */

	public SalesForceHomePage clickAppLauncher() {
		
		getDriver().findElementByXPath("//*[contains(@class,'salesforceIdentityAppLauncherHeader')]/div").click();
		//System.out.println("Page= SalesForceHomePage - Property File name = "+prop.getProperty("fileName"));
		return this;
	}
	
	public AppLauncher clickViewAll() {
		getDriver().findElementByXPath("//lightning-button/button[text()='View All']").click();
		return new AppLauncher();
		//return new AppLauncher(driver, prop);
	}
	
}
