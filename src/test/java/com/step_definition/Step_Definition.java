package com.step_definition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base_class.Base_Class;
import com.pom_class.POM_Class;


import io.cucumber.java.en.*;


public class Step_Definition extends Base_Class {
	POM_Class cal = new POM_Class(driver);
	
	public static List <String> bftext= new ArrayList<String>();
	public static List <String> aftext= new ArrayList<String>();
	@Given("User is on home page")
	public void user_is_on_home_page() {
	   Assert.assertTrue(getTitle().contains("The Internet"));
	}
	@When("User clicks on dynamic content")
	public void user_clicks_on_dynamic_content() {
		Assert.assertTrue(cal.content.isEnabled());
	    click(cal.content);
	}

	@When("User clicks on click here button")
	public void user_clicks_on_click_here_button() {
	    List<WebElement> beforeText = cal.beforeText;
		for(WebElement x:beforeText) {
	    	String text = x.getText();
	    	bftext.add(text);
	    }
		Assert.assertTrue(cal.button.isEnabled());
		click(cal.button);
		
		}

	@Then("User verify the changes after clicks on click here button")
	public void user_verify_the_changes_after_clicks_on_click_here_button() throws InterruptedException {
		List<WebElement> after = cal.aftert;
		for(WebElement x:after) {
	    	String text = x.getText();
	    	aftext.add(text);
	    	
	    }
		Assert.assertTrue(!bftext.equals(after));
		
		}
	
	@Given("User is on application home page")
	public void user_is_on_application_home_page() {
	  for(int i = 0; i<2; i++) {
		  back();
	  }
	  
	  Assert.assertTrue(getTitle().contains("The Internet") );
	}

	@When("User clicks on dynamic controls")
	public void user_clicks_on_dynamic_controls() {
	    
	}

	@Then("User validate checkbox is enable")
	public void user_validate_checkbox_is_enable() {
	  
	}

	@When("User clicks on the check box")
	public void user_clicks_on_the_check_box() {
	    
	}

	@Then("User validate check box been clicked")
	public void user_validate_check_box_been_clicked() {
	   
	}

	@When("User clicks on remove button")
	public void user_clicks_on_remove_button() {
	   
	}

	@Then("User validate it,s gone is displayed")
	public void user_validate_it_s_gone_is_displayed() {
	   
	}

	@When("User clicks on Add button")
	public void user_clicks_on_add_button() {
	   
	}

	@Then("User validate it,s back is displayed after click the Add button")
	public void user_validate_it_s_back_is_displayed_after_click_the_add_button() {
	   
	}



	    }
		
		
		
		




