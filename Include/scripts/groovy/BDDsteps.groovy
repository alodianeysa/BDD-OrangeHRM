import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class BDD1 {
	@Given ("I am on the login page")
	def navigateToUrl(){
		println("\n User navigate to Url")
		WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')
	}
	
	@When ("I input valid (.*) and (.*)")
	def inputCredential (String username, String password){
		println("\n User input Credential")
		WebUI.setText(findTestObject('OrangeHRM/txt_email'), 'Admin')
		WebUI.setText(findTestObject('OrangeHRM/txt_pass'), 'admin123')
	}
	
	@And ("I click login button")
	def clickLoginButton(){
		println("\n Click Login Button")
		WebUI.click(findTestObject('OrangeHRM/btn_Login'))
	}
	
	
	@Then ("I click Admin button")
	def clickAdminButton(){
		println("\n Click Admin Button")
		WebUI.click(findTestObject('OrangeHRM/btn_admin'))
	}
	
	@When ("I click Nationalities button")
	def clickNationalitiesButton(){
		println("\n Click Nationalitis Button")
		WebUI.click(findTestObject('OrangeHRM/btn_nasionalities'))
	}
	
	@And ("I click Add button")
	def clickAddButton(){
		println("\n Click Add Button")
		WebUI.click(findTestObject('OrangeHRM/btn_add'))
	}
	
	@And ("I write text nationalities Aab")
	def writeNationalities(){
		println("\n Write Nationalities Aab")
		WebUI.setText(findTestObject('OrangeHRM/txt_nasionality'), 'Aab')
	}
	
	@Then ("I click save button")
	def clickSaveButton(){
		println("\n Click Save Button")
		WebUI.click(findTestObject('OrangeHRM/btn_save'))
	}
	
	@When ("I check the column Aab")
	def checkTheColumn(){
		println("\n Check The Column")
		WebUI.click(findTestObject('OrangeHRM/btn_check'))
	}
	
	@Then ("I click delete button")
	def clickDeleteButton(){
		println("\n Click Delete Button")
		WebUI.click(findTestObject('OrangeHRM/btn_delete'))
	}
	
	@And ("I click OK for delete record")
	def clickOKbutton(){
		println("\n Click OK Button")
		WebUI.click(findTestObject('OrangeHRM/btn_deleteRecord'))
	}
	
	@When ("I click Leave button")
	def clickLeaveButton(){
		println("\n Click Leave Button")
		WebUI.click(findTestObject('OrangeHRM/btn_leave'))
	}
	
	@And ("I click Search button")
	def clickSearchButton(){
		println("\n Click Search Button")
		WebUI.click(findTestObject('OrangeHRM/btn_search'))
	}
	
	@And ("I will stay at the Leave page")
	def stayInTheLeavePage(){
		println("\n Stay in The Leave Page")
		WebUI.verifyElementPresent(findTestObject('OrangeHRM/verify_leaveList'), 0)
	}
	@Then ("I should be navigated to home page")
	def successLogin(){
		println("\n User success Login")
		WebUI.closeBrowser()
	}
	



}