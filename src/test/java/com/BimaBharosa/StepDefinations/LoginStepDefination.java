package com.BimaBharosa.StepDefinations;


import com.BimaBharosa.base.Main;
import com.BimaBharosa.utilities.ReadProperty;
import io.cucumber.java.en.*;
import com.BimaBharosa.objectRepository.LoginPage;
import org.junit.Assert;

import javax.swing.*;


public class LoginStepDefination extends Main {

    ReadProperty readPro = new ReadProperty();

    public String username = readPro.getUsername();
    public String password = readPro.getPassword();

    LoginPage lp;


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        lp = new LoginPage(driver);
        lp.displayLoginBtn();
    }

    @Then("I should see a  Login button")
    public void i_should_see_a_login_button() {
        lp = new LoginPage(driver);
        Assert.assertTrue(lp.displayLoginBtn());
    }

    @Then("I should see a  Clear button")
    public void i_should_see_a_clear_button() {
        lp = new LoginPage(driver);
        Assert.assertTrue(lp.displayClearBtn());
    }

    @Then("I should see a CAPTCHA")
    public void i_should_see_a_captcha() {
        lp = new LoginPage(driver);
        Assert.assertTrue(lp.displayCaptcha());
    }

    @Then("The CAPTCHA should be different")
    public void the_captcha_should_be_different() throws InterruptedException {
        lp = new LoginPage(driver);
        Thread.sleep(1000);
        String initialCaptchaSrc = lp.attributCaptch();
        Thread.sleep(1000);
        System.out.println("Initial Captcha Src :-   "+  initialCaptchaSrc);
        lp.clkRefreshCaptcha();
        Thread.sleep(1000);
        String newCaptchaSrc = lp.attributCaptch();
        Thread.sleep(1000);
        System.out.println("New Captcha Src :-   "+  newCaptchaSrc);
        Assert.assertNotEquals(newCaptchaSrc, initialCaptchaSrc);
    }

    @When("Enter Valid Username")
    public void enter_valid_username() {
        lp = new LoginPage(driver);
        lp.clrUsername();
        lp.enterUsername(username);
    }

    @When("Enter Valid Password")
    public void enter_valid_password() {
        lp = new LoginPage(driver);
        lp.clrPassword();
        lp.enterPassword(password);
    }

    @When("Click on Clear Button")
    public void click_on_clear_button() {
        lp = new LoginPage(driver);
        lp.clkClrbtn();
    }

    @Then("Username and Password Fields Should be Clear")
    public void username_and_password_fields_should_be_clear() {
        lp = new LoginPage(driver);
        Assert.assertTrue(lp.atrributUsername());
    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        lp = new LoginPage(driver);
        lp.clkLoginbtn();
    }

    @Then("User should see an error messages {string} and {string}")
    public void user_should_see_an_error_messages_and(String errEmptyUsername, String errEmptyPassword) throws InterruptedException {
        lp = new LoginPage(driver);
        String actualErrUsername = lp.getTextErrUsername();
        Thread.sleep(1000);
        String actualErrPassword = lp.getTextErrPassword();
        Thread.sleep(1000);
        Assert.assertEquals(errEmptyUsername, actualErrUsername);
        Assert.assertEquals(errEmptyPassword, actualErrPassword);
    }

    @Then("User should see an Username error message {string}")
    public void user_should_see_an_username_error_message(String errEmptyUsername) {
        lp = new LoginPage(driver);
        String actualErrUsername = lp.getTextErrUsername();
        Assert.assertEquals(errEmptyUsername, actualErrUsername);
    }

    @When("Clear the Password field")
    public void clear_the_password_field() {
        lp = new LoginPage(driver);
        lp.clrPassword();
    }

    @Then("User should see an Password error message {string}")
    public void user_should_see_an_password_error_message(String errEmptyPassword) {
        lp = new LoginPage(driver);
        String actualErrPassword = lp.getTextErrPassword();
        Assert.assertEquals(errEmptyPassword, actualErrPassword);
    }

    @When("Enter Invalid Username {string}")
    public void enter_invalid_username(String invalidUsername) {
        lp = new LoginPage(driver);
        lp.clrPassword();
        lp.enterPassword(password);
        lp.clrUsername();
        lp.enterUsername(invalidUsername);
    }

    @Then("User should see an Invalid Username error message {string}")
    public void user_should_see_an_invalid_username_error_message(String invalidErrUsername) {
        lp = new LoginPage(driver);
        String actualErrCredential = lp.getTextErrInvalidCredential();
        Assert.assertEquals(invalidErrUsername, actualErrCredential);
        lp.clkOK();
    }

    @When("Enter Invalid Password {string}")
    public void enter_invalid_password(String invalidPassword) {
        lp = new LoginPage(driver);
        lp.clrUsername();
        lp.enterUsername(username);
        lp.clrPassword();
        lp.enterPassword(invalidPassword);
        String str1 = JOptionPane.showInputDialog("Enter Captcha");
        lp.clrCaptcha();
        lp.enterCaptcha(str1);
    }

    @Then("User should see an Invalid Password error message {string}")
    public void user_should_see_an_invalid_password_error_message(String invalidErrPassword) {
        lp = new LoginPage(driver);
        String actualErrCredential = lp.getTextErrInvalidCredential();
        Assert.assertEquals(invalidErrPassword, actualErrCredential);
        lp.clkOK();
    }

    @Then("User should see an Invalid Username and Invalid Password error message {string}")
    public void user_should_see_an_invalid_username_and_invalid_password_error_message(String invaldiErrUsrPass) {
        lp = new LoginPage(driver);
        String actualErrCredential = lp.getTextErrInvalidCredential();
        Assert.assertEquals(invaldiErrUsrPass, actualErrCredential);
        lp.clkOK();
    }

    @When("Enter LowerCase Username {string}")
    public void enter_lower_case_username(String lowerCaseUsername) {
        lp = new LoginPage(driver);
        lp.clrUsername();
        lp.enterUsername(lowerCaseUsername);
    }

    @When("Enter UpperCase Password {string}")
    public void enter_upper_case_password(String upperCasePassword) {
        lp = new LoginPage(driver);
        lp.clrPassword();
        lp.enterPassword(upperCasePassword);
    }

    @When("Enter Valid Captcha")
    public void enter_valid_captcha() {
        String str1 = JOptionPane.showInputDialog("Enter Captcha");
        lp.clrCaptcha();
        lp.enterCaptcha(str1);
    }

    @Then("User should see an Case Sensitive Username and Password error message {string}")
    public void user_should_see_an_case_sensitive_username_and_password_error_message(String caeErrUsernamePassword) {
        lp = new LoginPage(driver);
        String actualErrCredential = lp.getTextErrInvalidCredential();
        Assert.assertEquals(caeErrUsernamePassword, actualErrCredential);
        lp.clkOK();
    }

    @Then("User should able login into next page")
    public void user_should_able_login_into_next_page() {
        lp = new LoginPage(driver);
        String expectedViewEdit = "View / Edit Complaints";
        String actualViewEdit = lp.getTextViewEdit();
        Assert.assertEquals(expectedViewEdit, actualViewEdit);
    }
}
