package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC002_CreateLead extends ProjectSpecificWrapper{

	@BeforeTest
	public void setData() {
		excelfile ="TC002_CreateLead";
	}

	@Test (dataProvider="getData")
	public void CreateLead(String uName, String pwd,String cName, String fName, String lName, String annRev,String title, String mkt) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterRevenue(annRev)
		.enterTitle(title)
		.enterDept(mkt)
		.clickCreateLeadBtn();
		
		
	}
	
	
	
}
