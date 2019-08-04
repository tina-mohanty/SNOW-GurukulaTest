#ServiceNow Test Exercise

Automated ServiceNow Test application Gurukula through selenium with Java

/** @author - Tina Mohanty Date: 04/08/2019 **/

#Framework: 
I have followed Cucumber Framework with Page Object Model. This is based on BDD methodology. My test cases are written in Gherkin language. And Automation test code is written in Selenium with Java.
I have created Cucumber customized listerner to capture the screenshot whenever a test is completed. Screenshots are captured and glued with cucumber test report in target folder. All pages got one common parent TestBase where i defined the code to create a driver instance and opening browser and killing the browser etc.., synchronized common actions that can perform on a webpage like, click, etc..
I have created this as a Maven project and also using log4j for logging into file and console. automation.out is the log file in root location where logs are captured.

#Following is the Test environment requirement:
mvn -version Apache Maven 3.3.9 
Java version 1.8.0_221 
selenium version 3.141.59 
Eclipse cucumber plaugin is installed. 
Google Chrome Browser is used for test execution. Chrome version: 75.0.3770.142

#Tests Covered:
1.	Verify Login with valid credential
2.	Verify login Fail with invalid credential
3.	Verify click on Did you forget your password? link then it navigate to Reset Password page
4.	Verify click on Register a new account link, it navigate to Registration page
5.	Verify Registeration with valid input data and is successful
6.	Verify Create new branch

#Tests not covered:
Negative Test cases like checking boundary values of text field, special characters etc.. are not covered. 
Pagination related cases are also not covered.

#How to Run Tests: 

Everything is configured in maven pom.xml. I used, maven-compiler-plugin for compiling code and maven-surefire-plugin for running the tests.
I defined a sample testng.xml file which was configured in pom.xml which would run by surefire plugin.
So, We just need to run the following command to compile and run. Copy the project into your local machine say..... C:\ServiceNowWorkSpace\ServiceNowGurukula then open command prompt and switch to this path. C:\ServiceNowWorkSpace\ServiceNowGurukula>mvn clean C:\ServiceNowWorkSpace\ServiceNowGurukula>mvn install C:\ServiceNowWorkSpace\ServiceNowGurukula>mvn test
Cucumber report will generate in the following path "target/cucumber-reports/advanced-reports"

#Ways to find out failure reasons:
We are capturing the screenshots whenever a test executed. Which could help us in identifying the issue. 
We are logging the logs into a test file through log4j which could help us in identifying the code paths where it was failed. 
Cucumber and TestNG is generating a report once all the tests are finished execution; Which could help us in finding out code flow and point of failure through Stack Trace. 
If nothing from above worked. We always have a better way; Debugging the code from eclipse by keeping break points.

