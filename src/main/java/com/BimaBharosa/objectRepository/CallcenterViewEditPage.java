package com.BimaBharosa.objectRepository;

import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CallcenterViewEditPage {

    static WebDriver driver = null;

    @FindBy(xpath = "(//*[text()='Does Not Pertain'])[1]")
    @CacheLookup
    private WebElement doesNotPertainDropDown;

    @FindBy(xpath = "(//*[text()='Does Not Pertain'])[3]")
    @CacheLookup
    private WebElement doesNotPertainPage;

    @FindBy(xpath = "//select[@name='DoesNotPertainDataTables_length']")
    @CacheLookup
    private WebElement dropDownTableEntity;

    @FindBy(xpath = "//*[contains(text(),'Showing 1 to 10')]")
    @CacheLookup
    private WebElement oneTo10TableEntity;

    @FindBy(xpath = "//*[contains(text(),'Showing 1 to 50')]")
    @CacheLookup
    private WebElement oneTo50TableEntity;

    @FindBy(xpath = "//*[contains(text(),'Showing 11 to 20')]")
    @CacheLookup
    private WebElement elevenTo20TableEntity;

    @FindBy(xpath = "//*[@id='DoesNotPertainDataTables_next']")
    @CacheLookup
    private WebElement next;

    @FindBy(xpath = "//*[@id='DoesNotPertainDataTables_previous']")
    @CacheLookup
    private WebElement previous;

    @FindBy(xpath = "//table[@id='DoesNotPertainDataTables']/tbody/tr[1]/td[1]/a[1]/i[1]")
    @CacheLookup
    private WebElement editBtn;

    @FindBy(xpath = "(//*[text()='Update Insurer'])[2]")
    @CacheLookup
    private WebElement updateInsurer;

    @FindBy(xpath = "//*[@id='btnUpdate']")
    @CacheLookup
    private WebElement updateBtn;

    @FindBy(xpath = "//*[@id='btncancel']")
    @CacheLookup
    private WebElement backBtn;

    @FindBy(xpath = "//span[text()='Complaint Number:']/following-sibling::strong")
    @CacheLookup
    private WebElement complaintNumIDToken;

    @FindBy(xpath = "//input[@id='txtentity']")
    @CacheLookup
    private WebElement selectedInsCompany;

    @FindBy(xpath = "//*[@id='ddlinsurancecomp_chosen']")
    @CacheLookup
    private WebElement nameInsurancCompany;

    @FindBy(xpath = "//button[@id='btnConfirmSuccess']")
    @CacheLookup
    private WebElement yesButton;

    @FindBy(xpath = "//h4[@id='successMessage']")
    @CacheLookup
    private WebElement successfullyPopUp;

    @FindBy(xpath = "//button[@id='btnsuccessModal']")
    @CacheLookup
    private WebElement okBtn;

    @FindBy(xpath = "//*[text()=' Entity Name']/following::td[7]")
    @CacheLookup
    private WebElement modifyInsCompanyName;

    @FindBy(xpath = "//*[@id='navbardrop']")
    @CacheLookup
    private WebElement complaintDropDown;


    @FindBy(xpath = "//*[@id='sidebarCollapse']")
    @CacheLookup
    private WebElement menuButton;

    @FindBy(xpath = "(//*[contains(text(),'View / Edit Complaints')])[1]")
    @CacheLookup
    private WebElement viewEditDropDown;

    @FindBy(xpath = "//button[@id='btnsearch']")
    @CacheLookup
    private WebElement searchButton;

    @FindBy(xpath = "//button[@id='btnclear']")
    @CacheLookup
    private WebElement clearButton;

    @FindBy(xpath = "//button[@id='btnExport']")
    @CacheLookup
    private WebElement exportToExcelButton;

    @FindBy(xpath = "//button[@id='btnfirst']")
    @CacheLookup
    private WebElement firstButton;

    @FindBy(xpath = "//button[@id='btnnext']")
    @CacheLookup
    private WebElement nextButton;

    @FindBy(xpath = "//button[@id='btnlast']")
    @CacheLookup
    private WebElement lastButton;

    @FindBy(xpath = "//button[@id='btnprev']")
    @CacheLookup
    private WebElement previousButton;

    @FindBy(xpath = "//*[@id='IrdaTokenMumber']")
    @CacheLookup
    private WebElement complaintNumber;

    @FindBy(xpath = "//*[@id='EntityReferenceNumber']")
    @CacheLookup
    private WebElement entityReferenceNumber;

    @FindBy(xpath = "//*[@id='policyNumber']")
    @CacheLookup
    private WebElement policyNumber;

    @FindBy(xpath = "//*[@id='complainantName']")
    @CacheLookup
    private WebElement complainantName;

    @FindBy(xpath = "//*[@id='searchByMobileNumber']")
    @CacheLookup
    private WebElement mobileNumberViewEditPage;

    @FindBy(xpath = "//*[@id='warningMessage']")
    @CacheLookup
    private WebElement errEmptySearch;

    @FindBy(xpath = "//*[@id='btnwarningModal']")
    @CacheLookup
    private WebElement ok;

    @FindBy(xpath = "//*[@id='VieweditDataTables_info']")
    @CacheLookup
    private WebElement showingEntity;

    @FindBy(xpath = "//*[text()='06-24-000615']")
    @CacheLookup
    private WebElement validComplaintNumber;

    @FindBy(xpath = "//*[text()='HDFCG005915']")
    @CacheLookup
    private WebElement validEntityReferenceNumber;

    @FindBy(xpath = "//*[text()='121231']")
    @CacheLookup
    private WebElement validPolicyNumber;

    @FindBy(xpath = "//*[text()='MR SANDEEP KASHYAP']")
    @CacheLookup
    private WebElement validComplainantName;

    @FindBy(xpath = "//*[@id='VieweditDataTables_info']")
    @CacheLookup
    private WebElement showingEntityForMobNum;

    @FindBy(xpath = "//table[@id='VieweditDataTables']/tbody/tr[1]/td[2]/a[1]/i[1]")
    @CacheLookup
    private WebElement editIcon;

    @FindBy(xpath = "//*[text()='Update Complaints']")
    @CacheLookup
    private WebElement updateComplaints;

    @FindBy(xpath = "//*[@id='btncancel']")
    @CacheLookup
    private WebElement cancelbtn;

    @FindBy(xpath = "//*[text()='View Complaints']")
    @CacheLookup
    private WebElement viewEdit;


    //Added by abhishek
    @FindBy(id = "txtPolicyProposalCertifiateClaimNumber")
    @CacheLookup
    private WebElement policyNumber_disable;

    @FindBy(id = "txtcompldetails")
    @CacheLookup
    private WebElement complaint_details_disable;

    @FindBy(xpath = "//div[@id='ddlComplaintDescType_chosen']//span")
    @CacheLookup
    private WebElement complaint_desc_type_disable;

    @FindBy(id = "txtremarkbyescalation")
    @CacheLookup
    private WebElement exclationfield;

    @FindBy(id = "btnescalate")
    @CacheLookup
    private WebElement exclationButton;

    @FindBy(xpath = "//table[@id='VieweditDataTables']/tbody/tr[1]/td[11]")
    @CacheLookup
    private WebElement complaint_status;

    @FindBy(xpath = "//small[@id='txtremarkbyescalation-error']")
    @CacheLookup
    private WebElement errExclation;

    @FindBy(xpath = "//button[@id='Logout']")
    @CacheLookup
    private WebElement logoutBtn;

    @FindBy(xpath = "//button[@id='btnConfirmSuccess']")
    @CacheLookup
    private WebElement logOffSuccess;

    @FindBy(id = "btnConfirmCancel")
    @CacheLookup
    private static WebElement logOffCancel;


    public CallcenterViewEditPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clkMenuButton() {
        menuButton.click();
    }

    public boolean isDisplayMenuButton(){
        return menuButton.isDisplayed();
    }

    public void clkComplaintDropDown() {
        complaintDropDown.click();

    }

    public void clkViewEditDropDown() {
        viewEditDropDown.click();
    }

    public void clkEditIcon() {
        editIcon.click();
    }

    public void clkCancelBtn() {
        cancelbtn.click();
    }

    public boolean displayCancelBtn() {
        cancelbtn.isDisplayed();
        return cancelbtn.isDisplayed();
    }

    public boolean displayViewEdit() {
        viewEdit.isDisplayed();
        return viewEdit.isDisplayed();
    }

    public boolean displayUpdateComplaints() {
        updateComplaints.isDisplayed();
        return updateComplaints.isDisplayed();
    }

    public boolean displaySearchButton() {
        searchButton.isDisplayed();
        return searchButton.isDisplayed();

    }

    public boolean displayClearButton() {
        clearButton.isDisplayed();
        return clearButton.isDisplayed();
    }

    public boolean displayExportToExcel() {
        exportToExcelButton.isDisplayed();
        return exportToExcelButton.isDisplayed();
    }

    public boolean displayFirstButton() {
        firstButton.isDisplayed();
        return firstButton.isDisplayed();

    }

    public boolean displayNextButton() {
        nextButton.isDisplayed();
        return nextButton.isDisplayed();
    }

    public boolean displayLastButton() {
        lastButton.isDisplayed();
        return lastButton.isDisplayed();
    }

    public boolean displayPreviousButton() {
        previousButton.isDisplayed();
        return previousButton.isDisplayed();
    }

    public void clkNextButton() {
        nextButton.click();
    }

    public void clrComplaintNumber() {
        complaintNumber.clear();
    }

    public void clrEntityReferenceNumber() {
        entityReferenceNumber.clear();
    }

    public void clrPolicyNumber() {
        policyNumber.clear();
    }

    public void clrComplainantName() {
        complainantName.clear();
    }

    public void clrMobileNum() {
        mobileNumberViewEditPage.clear();
    }

    public void enterComplaintNumber(String complaintNum) {
        complaintNumber.sendKeys(complaintNum);
    }

    public void enterEntityReferenceNumber(String entityReferenceNum) {
        entityReferenceNumber.sendKeys(entityReferenceNum);

    }

    public void enterPolicyNumber(String policyNum) {
        policyNumber.sendKeys(policyNum);

    }

    public void enterComplainantName(String complaintNa) {
        complainantName.sendKeys(complaintNa);

    }

    public void enterMobileNumberViewEditPage(String mob) {
        mobileNumberViewEditPage.sendKeys(mob);

    }

    public void clkClearBtn() {
        clearButton.click();
    }

    public void clkSearchBtn() {
        searchButton.click();
    }

    public String getTextErrEmptySearch() {
        errEmptySearch.getText();
        return errEmptySearch.getText();
    }

    public void clkOk() {
        ok.click();
    }


    public void logOutSuccess() throws InterruptedException {
        try {
            logoutBtn.click();
            Thread.sleep(1000);
            logOffSuccess.click();
        } catch (NoSuchElementException n) {

        } catch (StaleElementReferenceException s) {
            menuButton.click();
            logoutBtn.click();
            Thread.sleep(1000);
            logOffSuccess.click();
        }

    }

    public String getTextShowingEntityZero() {
        showingEntity.getText();
        return showingEntity.getText();
    }

    public String getTextValidComplaintNumber() {
        validComplaintNumber.getText();
        return validComplaintNumber.getText();

    }

    public String getTextValidEntityReferenceNumber() {
        validEntityReferenceNumber.getText();
        return validEntityReferenceNumber.getText();
    }

    public String getTextValidPolicyNumber() {
        validPolicyNumber.getText();
        return validPolicyNumber.getText();
    }

    public String getTextValidComplainantName() {
        validComplainantName.getText();
        return validComplainantName.getText();
    }

    public String getTextValidMobileNumOfTable() {
        showingEntityForMobNum.getText();
        return showingEntityForMobNum.getText();
    }

    public boolean getAttributePolicyNumber() {
        String comNum = policyNumber.getAttribute("value");
        if (comNum.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void scrollToDownWord() throws InterruptedException {

        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);

    }

    public void scrollToUpWord() throws InterruptedException {

        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-400)");
        Thread.sleep(2000);


    }


    //Methods added by abhishek
    public String getPolicyNumber() {
        try {
            if (policyNumber_disable.isDisplayed()) {
                return policyNumber_disable.getAttribute("value");
            }
        } catch (NoSuchElementException e) {

        }
        return null;
    }

    public String getComplaintDetails() {
        try {
            if (complaint_details_disable.isDisplayed()) {
                return complaint_details_disable.getAttribute("value");
            }
        } catch (NoSuchElementException e) {

        }
        return null;
    }


    public String getComplaintDescType() {
        try {
            if (complaint_desc_type_disable.isDisplayed()) {
                return complaint_desc_type_disable.getText();
            }
        } catch (NoSuchElementException e) {

        }
        return null;
    }

    public void enterExclation(String exclation) {
        exclationfield.sendKeys(exclation);
    }

    public void clkExclationBtn() {
        exclationButton.click();
    }

    public String getTextErrExclation() {
        return errExclation.getText();

    }

    public String verifyComplaintStatus(){
        if(complaint_status.isDisplayed()){
            return complaint_status.getText();
        }
        return null;
    }

    public void clrExclationField(){

        exclationfield.clear();
    }

    public void clkDoesNotPertain() {
        doesNotPertainDropDown.click();
    }

    public boolean displayDoesNotPertain() {
        doesNotPertainPage.isDisplayed();
        return doesNotPertainPage.isDisplayed();
    }

    public void selectDefaultTableEntity() {
        Select dropDownEntity = new Select(dropDownTableEntity);
        dropDownEntity.selectByValue("10");

    }

    public void selectSpecificTableEntity() {
        Select dropDownEntity = new Select(dropDownTableEntity);
        dropDownEntity.selectByValue("50");
    }

    public boolean displayOneTo10TableEntity() {
        oneTo10TableEntity.isDisplayed();
        return oneTo10TableEntity.isDisplayed();

    }

    public boolean displayoneTo50TableEntity() {
        oneTo50TableEntity.isDisplayed();
        return oneTo50TableEntity.isDisplayed();
    }

    public boolean displayElevenTo20TableEntity() {
        elevenTo20TableEntity.isDisplayed();
        return elevenTo20TableEntity.isDisplayed();
    }

    public boolean displayUpdateInsurer() {
        updateInsurer.isDisplayed();
        return updateInsurer.isDisplayed();
    }

    public void clkNext() {
        next.click();
    }

    public void clkPrevious() {
        previous.click();
    }

    public void clkEditBtn() {
        editBtn.click();
    }

    public boolean updateButtonClickable() {
        try {
            // Wait until the button is visible and clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(updateBtn));
            return button != null && button.isDisplayed() && button.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean backButtonClickable() {
        try {
            // Wait until the button is visible and clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(backBtn));
            return button != null && button.isDisplayed() && button.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    public String getTextComplaintNumIDToken() {
        complaintNumIDToken.getText();
        return complaintNumIDToken.getText();
    }

    public String getAttributeSelectedInsCompany() {
        String attribute = selectedInsCompany.getAttribute("value");
        return attribute;
    }

    public void clkNameInsurancCompany() {
        nameInsurancCompany.click();
    }

    public void clkUpdateBtn(){
        updateBtn.click();
    }

    public void clkYesButton(){
        yesButton.click();
    }

    public String getTextSuccessfullyPopUp(){
        successfullyPopUp.getText();
        return successfullyPopUp.getText();
    }

    public void clkOkBtn(){
        okBtn.click();
    }
    public String getTextModifyInsCompanyName(){
        modifyInsCompanyName.getText();
        return modifyInsCompanyName.getText();
    }
}
