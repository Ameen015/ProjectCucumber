Feature: Verifying the Adactin Hotel APP

Scenario Outline: verifying the loging details with valid credentials
Given User in on the Adactin Hotel App page

When User enters the "<userName>","<password>" and click Login button
And After Login User search the hotel, with "<Check In Date>","<Check Out Date>" and click search button
And User Should select the Hotel
And User enter "<First Name>","<Last Name>","<Billing Address>""<Credit card No>""<CVV Number>" and Book the hotel
Then User get the orderno print

Examples: 
	|userName		|password    |Check In Date|Check Out Date|First Name|Last Name|Billing Address  |Credit card No  |CVV Number|
	|aameenullah|Ameen-mummy1|01/03/2020   |02/03/2020    |Ameenullah|S        |128,European Lane|5698742315487965|545       |