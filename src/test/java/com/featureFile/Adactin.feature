Feature: Hotel Booking in Adactin Application

Scenario Outline: Login Page
Given user Launch The Application
When user Enter The Valid "<Username>" in the Username Field
And user Enter The Valid "<Password>" in the Password Field
Then user Click the Login Button And It Navigates To SearchHotel Page
Examples:
         |Username|Password|
         |Vinothini|123456|
         |Kaithkumar|123456|
         
         
         

Scenario: Search Hotel
When user Select The "London" From The Dropdown
And user Select The Hotels From The Dropdown
And user Select The Roomtype From The Dropdown
And user Select The Number Of Rooms From The Dropdown
And user Enter The Checkin Date In The Checkin Date Field
And user Enter The Checkout Date In The Checkout Date Field
And user Select The Adults Per Room From The Dropdown
And user Select The Children Per Room From The Dropdown
Then user Click the Search Button And It Navigates To Select Hotel Page


Scenario: Select Hotel
When user Select The Radio Button For The Hotel Creek
Then user Click On The Continue Button And It Navigates To Book Hotel Page


Scenario: Book Hotel Page
When user Enter The First Name In The Firstname Field
And user Enter The Lasst Name In The Lastname Field
And user Enter The Billing Address In the Billing Address Field
And user Enter The Credit Card Number In The Credit Card Field
And user Select The Credit Card Type From The Dropdown
And user Select The Expiry Month From The Dropdown
And user Select The Expiry Year From The Dropdown
And user Enter The CVV Number In The CVV Number Field
Then user Click The Book Now Button And It Navigates To Conformation Page


Scenario: Confirmation Page
Then user Click The My Itenary Button And It Navigates To Itenary Page


 