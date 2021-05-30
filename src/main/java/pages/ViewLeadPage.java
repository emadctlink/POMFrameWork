package pages;

import wrapper.ProjectSpecificWrapper;

public class ViewLeadPage extends ProjectSpecificWrapper{
	
	public ViewLeadPage verifyTitlOfPage(String Title) {
		verifyTitle(Title);
		return this; 
	}
	public OpenTapsCRMPage clickEdit() {
		clickByLinkText("Edit");
		return new OpenTapsCRMPage();	
	}
	public ViewLeadPage verifyName(String fName) {
		verifyTextByXpath("//input[@name='submitButton']", fName);
		return this;
	}
	public ViewLeadPage confirmChangeCName(String Cname) {
		verifyName(Cname);
		return this;
		
	}
	
}
