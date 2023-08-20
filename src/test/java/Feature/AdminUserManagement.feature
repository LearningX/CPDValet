Feature: Verify the admin user and roles


#Background:
 #Scenario: Login into the application with valid credentials
 #Given User Launch the site URL
  #	Then User Enter Username
  #	Then User Enter Password
  #	Then User click on signIn button
  
  
#@Regression
#Scenario: Verify user is able to create Admin User Management
 #		Given User Launch the site URL
  #	Then User Enter Username
  #	Then User Enter Password
  #	Then User click on signIn button
  #	Given User click on Admin User and Roles
  #	Then Click on Admin User Management
  #	Then Verify user is navigate to "AdminUserManagement.key" page
  #	Then User click on "New" button 
  #	Then Verify user is navigate to "CreateAdminUser.key" page
  #	
  #	@Regression
  #	Scenario: User is able to create Admin User Management using DataTable
  #	
  #	Given User Launch the site URL
  #	Then User Enter Username	
  #	Then User Enter Password
  #	Then User click on signIn button
  #	Then User click on Admin User and Roles
  #	Then Click on Admin User Management
   #	Then User click on "New" button 
 #		And User Enter Valid Admin Name and LastName 
 #			|Deepak|	Chauhan|
 #		And User Enter valid Admin emailID and AlternateEmailID
 #		|deepak.chauhan+1@in.nuagebiz.tech|		deepak.chauhan+11@in.nuagebiz.tech|
 #		
 		
 		@Regression
  	Scenario: User is able to create Admin User Management 
  		
  	Given User Launch the site URL
  	Then User Enter Username
  	Then User Enter Password
  	Then User click on signIn button
  	Then Enter Two MFA Code
  	Then User click on Admin User and Roles
  	Then Click on Admin User Management
   	Then User click on "New" button 
 		And User Enter Valid Admin givenName "Given_Name.key"
 		And User Enter Valid Admin lastName "Last_Name.key"
 		And User Enter Valid Admin email "Email_ID.key"
 		And User Enter Valid Admin alternateEmailID "Alternate_Email_ID.key"
 		Then click on Select Language Dropdown Box
 		And User Select Language "Select_Langauage.key" 
 		Then click on Country Code DropDown
 		Then Search the "CountryCode.key" and Select Country from list
 		 	
 