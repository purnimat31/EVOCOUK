# EVOCOUK
EVOCOUK_Purnima_Technical Assessment

Objective:The objective of this project is to demonstrate automation framework for the URL https://evoco-test-app-frontend.herokuapp.com/barebones/ using Selenium TestNG framework. The script is coded in JAVA and have implemented MAVEN dependencies.

Project Folder Navigation:

src/test/java - contains the coded scripts of the automation framework
JRE system library - contains the latest version of JAVA SE
Referenced Dependencies - Contains Selenium JAR file
TestNG - Contains the TestNG JAR files
drivers - Contains Chrome 96 version driver
Screenshots - Will contain screenshots taken during the last run of automation pack for each Test Case
test-output - will provide two TestNG reports of the last run of automation packt
pom.xml - have the required dependencies
testng.xml - This is the Test Suite created by TestNG and also has data parameterised for each TestNG test case

How to Run:

Right click on testng.xml
Click on 'Run As'
Click on TestNG Suite

**Automation Framework Details:**

This website is now automated using Selenium tool with TestNG framework
TestNG framework is implemented in src/test/java/Framework_TestCase/Test_EVOCOUK_GOVUK_PageObject.java
TestNG framework in Point 2 is has three Test cases, first Test case to validate the title of the URL is as expected, second Test case to complete an end to end data submission with the Test Data provided by TestNG with firstname as Purnima and Last Name as Thiruvengadam, third Test case is again end to end data submission but with First Name as Nicole and Last Name as Kidman. Test Case 2 and 3 has been used to demonstrate data parameterisation
All the 3 test cases are put together as a Test Suite in testng.xml. This is the file which the user should click to initiate the run. Refer to steps in 'How to Run' section
Page Object Model is implemented by identifiying/defining objects of each page in three different JAVA packages/class. The end to end donation flow involves three different pages and each of these pages are considered in Page Object Model. Page Factory function feature is uses to initialise elements in before each page is involved in the Test case.
Page Object Model pages are defined in src/test/java/Framework_PageObject
Current pack will run only on Chrome (latest version) browseer. However this can be enhanced to run on chosen/multiple browsers. src/test/java/Framework_EnvSetUp has been configured to be invovled by the Test_CRUKDonation_PageObject script to decide the browser and invoke the URL
src/test/java/Test_Utilities contains the utility which is called to capturescreenshot as and when needed in the Test flow. Screenshots of only the latest run will be saved in Screenshots folder
test-ouput folder will have two files providing the summary and detail report of latest run. emailable-report.html will provide the summary and index.html will provide detailed report. These are default reports provided by TestNG. Further customised reports can be created using ReportNG tool
Please note only the latest run output reports/screenshots will be available after each run. User has to back up previous runs reports/screenshots if needed
