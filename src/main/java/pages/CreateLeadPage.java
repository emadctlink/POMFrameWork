package pages;

import wrapper.ProjectSpecificWrapper;

public class CreateLeadPage extends ProjectSpecificWrapper{

	public CreateLeadPage enterCompanyName(String cName) {
		enterById("createLeadForm_companyName", cName);
		return this;
	}
	public CreateLeadPage enterFirstName(String fName) {
		enterById("createLeadForm_firstName", fName);
		return this;
	}
	public CreateLeadPage enterLastName(String lName) {
		enterById("createLeadForm_lastName", lName);
		return this;
	}
	/*
	public CreateLeadPage selectSource(String src) {
		selectVisibileTextById("createLeadForm_dataSourceId", src);
		return this;
	}
	*/
	
	public CreateLeadPage enterTitle(String title) {
		enterById("createLeadForm_generalProfTitle", title);
		return this;
	}
	public CreateLeadPage enterDept(String dept) {
		enterById("createLeadForm_departmentName", dept);
		return this;
	}
	
	public CreateLeadPage enterRevenue(String annRev) {
		enterById("createLeadForm_annualRevenue", annRev);
		return this;
	} 
	
	public ViewLeadPage clickCreateLeadBtn() {
		clickByName("submitButton");
		return new ViewLeadPage();
	}
	
}
