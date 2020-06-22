package com.pages;

import com.testng.api.base.ProjectSpecificMethod;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import freemarker.ext.jsp.TaglibFactory.ClearMetaInfTldSource;

public class LoginPage extends ProjectSpecificMethod {
	
	@Given("Enter the userName as (.*)")
	public void enterUsername (String username) {
		clearAndType(locateElement("id", "email"), username);
	}

	@Given("Enter password as (.*)") 
	public void enterPassword(String data) {
		clearAndType(locateElement("id", "password"), data);
	}

	@Then("Click on login button")
	public void clickLogin() {
		click(locateElement("id", "buttonLogin"));
	}

}
