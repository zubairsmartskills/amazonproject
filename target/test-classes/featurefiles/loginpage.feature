@facebook
Feature: To user verify the login function

@smoke
Scenario: To user verify login function with valid user and valid password
Given To user launch edge browser and pass valid url
When To user enter valid username and valid password
			#2d list without  header
			|ram|111|ram@123|
			|sai|222|sai@123|
			|java|333|java@123|
			
Then To user click login button
 
@sanity
Scenario: To user verify login function with valid user and valid password
Given To user launch edge browser and enter  url
When To user enter valid username and password
Then To user click login button








#Background:
#Given To user launch edge browser and pass valid url




#Scenario: To user verify login function with invalid username and invalid password
#When To user enter invalid username and invalid password
#And To user click login  button
#Then To user quit browser




