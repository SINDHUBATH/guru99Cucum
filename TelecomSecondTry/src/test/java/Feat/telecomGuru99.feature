Feature: Validate Scenarios from Guru99 demo Site 

@telecom
Scenario Outline: Register New Customer & Print Customer ID 

	Given user is on HomePage 
	When user clicks on add customer link 
	Then user fills details in add customer page by entering "<firstname>" and "<secondname>" and "<email>" and "<address>" and "<phoneNum>" 
	Then user gets Customer Id 
	
	Examples: 
		|	firstname	| 	secondname 	| 			email 		| 	address 		| 	phoneNum 	|
		| 	Gary 		| 	Harris 		| 	gary@harris.com 	| 	123 Random St 	|	9898032311 	|	
		| 	Lucy 		| 	Federer		| 	lucy@ferr.com 		| 	123 Second St 	|	8812920311 	|
		| 	Angelina	| 	Kerber		| 	angel@kerb.com 		| 	456 Random St 	|	0909132311 	|	

@paymentgateway		
Scenario: Purchase Product via Payment Gateway

	Given user is on paymentGatewayHomePage
	Then user selects quantity and click on Buy Now Button
	Then user lands on payment gateway page and user clicks on generate Card Num link
	And user copies card details 
	Then user enters the details payment page and clicks on pay button
	Then user notes Order Id and track it down 