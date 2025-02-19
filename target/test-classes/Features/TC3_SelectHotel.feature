@Select
Feature: Verifying OMRBranch Hotel Select Hotel Module

  Scenario Outline: Select last hotel name and verify navigate to Book Hotel page
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Banupriya"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"

    Examples: 
      | userName                | password | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | banupriyasr90@gmail.com | Banu@123 | Tamil Nadu | Chennai | Standard | 2024-10-15 | 2024-10-17 | 2-Two      | 1-One        |            3 |

  Scenario Outline: Select second hotel name from last and verify navigate to Book Hotel page
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Banupriya"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the second from last hotel name and hotel price
    And User select the second from last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"

    Examples: 
      | userName                | password | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | banupriyasr90@gmail.com | Banu@123 | Tamil Nadu | Chennai | Standard | 2024-10-15 | 2024-10-17 | 2-Two      | 1-One        |            3 |

  
  Scenario Outline: Select the first Hotel name and dismiss the alert
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Banupriya"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and accept the alert
    Then User should verify after select success message "Book Hotel"

    Examples: 
      | userName                | password | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | banupriyasr90@gmail.com | Banu@123 | Tamil Nadu | Chennai | Standard | 2024-10-15 | 2024-10-17 | 2-Two      | 2-Two        |            3 |
