package com.BimaBharosa.StepDefinations;

import com.BimaBharosa.objectRepository.CallcenterViewEditPage;
import com.BimaBharosa.objectRepository.LoginPage;
import com.BimaBharosa.base.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ViewEditStepDefination extends Main {


    public LoginPage lp;
    public CallcenterViewEditPage ve;

    @Then("Click Complaints DropDown")
    public void click_complaints_drop_down() {
        ve = new CallcenterViewEditPage(driver);
        ve.clkMenuButton();
        ve.clkComplaintDropDown();
    }

    @Given("I am on the Call Center page")
    public void i_am_on_the_call_center_page() {
        ve = new CallcenterViewEditPage(driver);
        ve.isDisplayMenuButton();
    }

    @When("Click on View Edit Dropdown Option")
    public void click_on_view_edit_dropdown_option() {
        ve = new CallcenterViewEditPage(driver);
        ve.clkViewEditDropDown();
    }

    @Then("Verify the Search and Clear Button")
    public void verify_the_search_and_clear_button() {
        ve = new CallcenterViewEditPage(driver);
        Assert.assertTrue(ve.displaySearchButton());
        Assert.assertTrue(ve.displayClearButton());
    }

    @When("Click on DoesNotPertain DropDown Option")
    public void click_on_does_not_pertain_drop_down_option() {
        ve = new CallcenterViewEditPage(driver);
        ve.clkDoesNotPertain();
    }

    @When("Click on Edit Icon")
    public void click_on_edit_icon() {
        ve = new CallcenterViewEditPage(driver);
        ve.clkEditBtn();
    }

    @When("Select the Insurance Company")
    public void select_the_insurance_company() throws InterruptedException {
        ve = new CallcenterViewEditPage(driver);
        lp = new LoginPage(driver);
        String comNumIDToken = ve.getTextComplaintNumIDToken();
        String befroeMdifyInsCom = ve.getAttributeSelectedInsCompany();
        ve.scrollToDownWord();
        ve.clkNameInsurancCompany();
        lp.UseDownArrowKey();
        Thread.sleep(1000);
        lp.UseDownArrowKey();
        lp.UseEnterKey();
    }

    @Then("Verify the Update Button")
    public void verify_the_update_button() {
        ve = new CallcenterViewEditPage(driver);
        //Assert.assertTrue(ve.updateButtonClickable());
        Assert.assertTrue(ve.displaySearchButton());
    }


}



