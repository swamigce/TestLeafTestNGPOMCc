package POMTests;

import org.testng.annotations.Test;

import baseClasses.SeleniumBaseClass;
import pagesPOM.SalesForceHomePage;

public class CloneContactrReqSAL152 extends SeleniumBaseClass{
	@Test (dataProvider = "FetchData1")
	public void cloneContactReq(String strCloneReq, String strPrefPhone) throws InterruptedException {
		new SalesForceHomePage()
		.clickAppLauncher()
		.clickViewAll()
		.ClickContactReq()
		.clickRecentlyViewed()
		.clickAllContactsReqs()
		.clickContactReq(strCloneReq)
		.clickCloneBtn()
		.enterPreferredPhone(strPrefPhone)
		.clickReqReasonDropDown()
		.clickReqReasonValue("General")
		.clickMainSave()
		.verifyCloneSuccess();
		
	}

}
