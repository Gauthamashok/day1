Feature: Verifying adactin loginpage

  Scenario Outline: verify adactin hotel with login credentials
    Given user is on adactin page
    When user should enter "<username>" and "<password>"
    And user should click login buttton
    And user should search hotel"<location>","<select_hotel>","<roomtype>","<no_of_rooms>","<adult>","<child>"
    And user should click submit
    And user should select the hotel
    And user should book a hotel"<firstname>","<lastname>","<address>","<ccnum>","<cctype>","<cceexpmonth>","<cceexpyear>","<cvv>"
    And user should click book now button
    Then user shoukd get order the id

    Examples: 
    |username| password | location| select_hotel | roomtype | no_of_rooms | adult | child | firstname | lastname | address | ccnum | cctype | ccexpmonth | cceexpyear | cvv |
   
    |Gowtham1| 03071967 |  sydney |hotelcreek|standard|2 - Two|3-Three|2-Two|Gowtham|A|no.2 omr chennai|1236598745665896|VISA|April|654|
    
    
    
    