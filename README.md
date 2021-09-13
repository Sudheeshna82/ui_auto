# ui_auto
This framework has been writtten using Serenity BDD libraries. Serenity is an open-source reporting library that enables developers to write easily-understandable and better-structured acceptance criteria for test automation projects. In addition to generating meaningful reports for each test, the tool also shows the list of features tested in each test case. With the details of the executed tests and the requirements that were tested, Serenity BDD Framework allows you to better understand how an application works and what it does.
The solution has one feature file where it describes the flow of a user searching for a car tax check using car's regestration number and compare the searched car summary details with the expected details.
Tests can be run directly from the feature file, Step definitions class, runner class or from terminal. Tests results can be found under target folder. When ever the tests are executed, new tests results will be generated under the target folder.
Browser to run the tests and the properties like headless mode can be added in serenity.config file.
Feature files can be found under resourses folder.
This framework is a Maven project where pom.xml file can be used to manage project configurations.
