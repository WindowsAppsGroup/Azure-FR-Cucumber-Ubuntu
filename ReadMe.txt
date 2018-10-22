The Maven UI Functional/Regression Test Project is a simple behavior-driven testing example that provides a working integration of Cucumber, the TestNG framework, Selenium Webdriver, Maven and Git.  Everything is integrated for you so you can concentrate on developing automate acceptance tests without experiencing the hassle of local installation, configuration; or maintaining a test automation platform on your laptop.   

Using the Test Project
The Test Project exercises a public page at "https://webapp.astadia-taas.com" using Cucumber.  
Cucumber reduces the effort to keep requirement specifications, tests and documentation in sync and it's
compatible with all the major software platforms.  This project uses a Java implementation for it's executable specification.

If you want to learn more about cucumber refer to https://cucumber.io/ or https://github.com/cucumber

If you want to view usage instructions with pictures then jump to the following link:
https://cloudgps.astadia.com/apphub-azure-mp-tee-user-guide

If you want to jump right in and run tests and view reports follow along below:

Option 1: From the Eclipse IDE: 
Note: [user] is the user created at the time of Virtual Machine Creation
Click on Eclipse Neon icon and select the demo project “/home/[user]/workspace-demo/” (default)  

In the package explorer of the Eclipse IDE:
-	Expand the project “Azure-FR-Cucumber-Ubuntu, right click on pom.xml and follow the steps below:
-	Click “3 Maven clean” 
-	On “Build success” Click “6 Maven test”
-	Double-click on the “index.html” file located in "target/cucumber-report/html/demo-webapp-functional-test-reports" to view Cucumber report.


Option 2 : From the Command Line :
From the Desktop, select top menu item "Applications" >> "System Tools" >> MATE Terminal

In the MATE Terminal Window, type the command:
cd /home/[user]/workspace-demo/Azure-FR-Cucumber-Ubuntu/
Ensure the current directory is “Azure-FR-Cucumber-Ubuntu” by using following command:
ls
 
Run one of the following commands:
   mvn clean test
OR
   mvn clean test -Dcucumber.options="--tags @FUNCTIONAL --tags @REGRESSION"  
  (This will run all the tests that tagged with @FUNCTIONAL and @REGRESSION)
  
Using one of the browsers provided with the TEE, access the test report at:   
file:///home/[user]/workspace-demo/FR-Cucumber/target/cucumber-report/html/demo-webapp-functional-test-reports/index.html

Cloning the Latest 
The latest version of this demo test project can be cloned from github at:
https://github.com/WindowsAppsGroup/Azure-FR-Cucumber-Ubuntu
