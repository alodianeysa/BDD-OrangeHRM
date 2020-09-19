import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('OrangeHRM/txt_email'), 'Admin')

WebUI.setText(findTestObject('OrangeHRM/txt_pass'), 'admin123')

WebUI.click(findTestObject('OrangeHRM/btn_Login'))

WebUI.click(findTestObject('OrangeHRM/btn_admin'))

WebUI.click(findTestObject('OrangeHRM/btn_nasionalities'))

WebUI.click(findTestObject('OrangeHRM/btn_add'))

WebUI.setText(findTestObject('OrangeHRM/txt_nasionality'), 'Aab')

WebUI.click(findTestObject('OrangeHRM/btn_save'))

WebUI.check(findTestObject('OrangeHRM/btn_check'))

WebUI.click(findTestObject('OrangeHRM/btn_delete'))

WebUI.click(findTestObject('OrangeHRM/btn_deleteRecord'))

WebUI.click(findTestObject('OrangeHRM/btn_leave'))

WebUI.click(findTestObject('OrangeHRM/btn_search'))

WebUI.verifyElementPresent(findTestObject('OrangeHRM/verify_leaveList'), 0)

WebUI.closeBrowser()

