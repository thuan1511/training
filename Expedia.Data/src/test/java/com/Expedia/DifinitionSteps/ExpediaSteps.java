package com.Expedia.DifinitionSteps;

import java.io.IOException;

import com.Expedia.bases.TestBase;
import com.Expedia.pages.ExpediaIndex;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExpediaSteps extends TestBase{


	public ExpediaSteps() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	protected ExpediaIndex index = new ExpediaIndex();
	
	
	

	@Given("^Open init browser$")
	public void open_init_browser() throws Throwable {
		TestBase.initBrowser();
	    
	}
	
	@When("^Click on Flights$")
	public void click_on_Flights() throws Throwable {
		String Element = prop.getProperty("Flights");
	    index.clickToElement(Element);
	}

	@Then("^Enter information$")
	public void enter_information() throws Throwable {
	    index.clickToElement(prop.getProperty("FlyingFrom"));
		
	    String text = "Ho Chi Minh";
	    index.sendKeyToElement(prop.getProperty("FlyingFrom"), text);
	    index.waitForControlInvisible(prop.getProperty("FlyingFromDropdown"));
	    index.selectItemInDropdownSpecial(prop.getProperty("FlyingFromDropdown"), prop.getProperty("FlyingItems"), "Ho Chi Minh City");
	}

	@Then("^Click on Search$")
	public void click_on_Search() throws Throwable {
	    
	}

	@Then("^Check validate information$")
	public void check_validate_information() throws Throwable {
	    
	}

	@Then("^Close init browser$")
	public void close_init_browser() throws Throwable {
	    
	}

}
