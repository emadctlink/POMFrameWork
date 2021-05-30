package pages;

import wrapper.ProjectSpecificWrapper;

public class FindLeadsPage extends ProjectSpecificWrapper {

	public FindLeadsPage enterFirstName(String fName) {
		enterByXpath("\"(//input[@ name='firstName'])[3]\"", fName);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsBtn() {
		clickByXpath("//button[text()='Find Leads']");
		return this;
		
	}
	
	public ViewLeadPage clickFstResLead() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		return new  ViewLeadPage();
	}
	
	
}
