package com.drapDrop.stepsDifinitions;

import java.io.IOException;


import com.drapDrop.bases.TestBase;
import com.drapDrop.pages.index;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class drapAndDropSteps extends TestBase {
	
	
	public drapAndDropSteps() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^visit the site$")
	public void visit_the_site(){
		TestBase.initBrowser();
	}

	@When("^get title of page$")
	public static void get_title_of_page(){
		index.getTitlePage();
		
	    
	}

	@Then("^click into link$")
	public void click_into_link() {
		
		index.ClickDropLink();
	    
	}

	@Then("^drap and drop element$")
	public void drap_and_drop_element(){
	    index.drapanddrop();
	}

	@Then("^exit page$")
	public void exit_page(){
	    index.CloseDriver();
	}

}
