
Feature: Air Ticket Purchase

@AirTicket
Scenario: Purchase Ticket
		Given User open Google browser
   	Then User open Biman Bangladesh url
    And User select One way trip
    And User select Departing airport
    And User select Arriving airport
    And User provide Derarting date
    And User click on search flights
    Then User select a fare
    And User click on continue to passengers
    Then User provide Passenger Informations
    And User provide Passenger Contact Information
    And User click on Continue to Seat Selection
    Then User click on Continue to Extras
    And User click on Continue to Ancillaries
    Then User click on Continue to Payment
    Then User select Bkash as Payment method
    And User give Billing Data
    And User click on Terms and Conditions
    And User click on Pay With Bkash
    
    