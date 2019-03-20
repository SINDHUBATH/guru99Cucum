Feature: Validate Telecom Scenarios from Guru99 demo Site 


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
		
		