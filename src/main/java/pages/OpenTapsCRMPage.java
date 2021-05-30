package pages;

import wrapper.ProjectSpecificWrapper;

public class OpenTapsCRMPage extends ProjectSpecificWrapper {

	public OpenTapsCRMPage changeCompanyName(String CName) {
		enterById("updateLeadForm_companyName", CName);
		return this;
	}
	
	public ViewLeadPage clickUpdate() {
		clickByClassName("smallSubmit");
		return new ViewLeadPage();
	}

}
