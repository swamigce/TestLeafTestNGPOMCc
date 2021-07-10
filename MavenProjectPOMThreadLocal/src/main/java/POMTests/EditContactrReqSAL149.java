package POMTests;

import org.testng.annotations.Test;

import baseClasses.SeleniumBaseClass;
import pagesPOM.SalesForceHomePage;

public class EditContactrReqSAL149 extends SeleniumBaseClass{
	@Test (dataProvider = "FetchData1")
	public void editContactReq(String strEditReq, String strReqStatusVal) throws InterruptedException {
		new SalesForceHomePage()
		.clickAppLauncher()
		.clickViewAll()
		.ClickContactReq()
		.clickDownIcon(strEditReq)
		.clickEdit()
		.enterReqDescription("TestEditDescription")
		.clickReqStatusDropDown()
		.clickReqStatusAttempted()
		.getLastModUser()
		.getLastModDateTime()
		.clickMainSave()
		.verifyReqStatus(strEditReq, strReqStatusVal);
		
	}

}
