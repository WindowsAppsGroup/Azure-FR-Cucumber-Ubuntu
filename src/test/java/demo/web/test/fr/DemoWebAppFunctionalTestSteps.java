package demo.web.test.fr;

import demo.web.test.fr.component.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cucumber.api.java.*;
import cucumber.api.java.en.*;
public class DemoWebAppFunctionalTestSteps {
	private String APPURL=System.getProperty("appurl")==null?"https://webapp.astadia-taas.com":System.getProperty("appurl");
	AppTestManager appTestManager=null;
	
	@Before
    public void setUp(){
		appTestManager = new AppTestManager();
		appTestManager.initBrowser();
    }

    @After
    public void cleanUp(){
    	if (appTestManager!=null) {
			appTestManager.closeTest();
		}
    }
    
	
	//############################## steps starts here ###############################

	@Given("^I am using app url to navigate to the Test page$")
	public void i_am_using_app_url_to_navigate_to_the_Test_page() throws Throwable {
		if (System.getProperty("appurl") == null){
			System.out.println("ENVIRONMENT VARIABLE appurl IS NOT AVAILABLE");
		}
		System.out.println("Currently using app url:" + APPURL);
		appTestManager.navigateToTargetPage(APPURL);
	}
 
 	 @And("^I have entered \"([^\"]*)\" into the first text box$")
     public void i_have_entered_something_into_the_first_text_box(String strArg1) throws Throwable {
 		 appTestManager.enterFirstTextBox(strArg1);
     }

     @And("^Then I have entered \"([^\"]*)\" into the second text box$")
     public void then_i_have_entered_something_into_the_second_text_box(String strArg1) throws Throwable {
    	 appTestManager.enterSecondTextBox(strArg1);
     }  
     
 	 @When("^I press concatenate button$")
     public void i_press_concatenate_button() throws Throwable {
 		 appTestManager.clickConcatenateButton();
     }

 	  @Then("^the result should be \"([^\"]*)\" on the third text box$")
     public void the_result_should_be_something_on_the_third_text_box(String strArg1) throws Throwable {
 		 appTestManager.validateThirdTextBox(strArg1);
 		 String strout = appTestManager.getOutput();
 		 String strin =strArg1;
 		 Assert.assertEquals(strin, strout,"Result Not matching expected value, Method: the_result_should_be_something_on_the_third_text_box");
     }

 	//############################## steps ends here ###############################
}
