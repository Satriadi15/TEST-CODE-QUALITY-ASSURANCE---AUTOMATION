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

WebUI.openBrowser('https://staging.student.cakap.com/login/register/email')

WebUI.setText(findTestObject('Page_Cakap Student Register/input_Email_inputemail'), 'daftar12345@gmail.com')

WebUI.click(findTestObject('Page_Cakap Student Register/label_Male'))

WebUI.setText(findTestObject('Page_Cakap Student Register/input_First Name_inputfirst'), 'user')

WebUI.setText(findTestObject('Page_Cakap Student Register/input_Last Name_inputlast'), 'login')

WebUI.setText(findTestObject('Page_Cakap Student Register/input_Password_inputpassword'), 'user1234')

WebUI.setText(findTestObject('Page_Cakap Student Register/input_Confirm Password_inputconfirmpass'), 'user1234')

WebUI.click(findTestObject('Page_Cakap Student Register/button_SIGN UP'))

WebUI.click(findTestObject('Page_Cakap Student  Dashboard/label_English Course'))

WebUI.click(findTestObject('Page_Cakap Student  Dashboard/button_NEXT'))

WebUI.setText(findTestObject('Page_Cakap Student  Dashboard/input_Zimbabwe (263)_input-phone'), '81330405513')

WebUI.click(findTestObject('Page_Cakap Student  Dashboard/button_START LEARNING'))

WebUI.click(findTestObject('Page_Cakap Student  Congratulation/button_GO TO MY DASHBOARD'))

WebUI.click(findTestObject('Page_Cakap Student  Dashboard/button_OK'))

