package com.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testng.api.base.ProjectSpecificMethod;

public class TestCase1 extends ProjectSpecificMethod {
	@BeforeTest
	public void setValues() {
		testCaseName = "ACME UI path till enterCountryname";
		testDescription = "ACME ";
		nodes = "ACME ";
		authors = "Divya";
		category = "Functionality";
		dataSheetName = "TC001";
	}

	@Test(dataProvider = "fetchData")
	public void createLeaf(String email,String pass) {
		
	}
}
