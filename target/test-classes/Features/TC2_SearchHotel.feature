Feature: Verifying Search Hotel Module

 
  Scenario Outline: Search hotels with all fields
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Banupriya"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName                | password | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | banupriyasr90@gmail.com | Banu@123 | Tamil Nadu | Chennai | Standard | 2024-10-10 | 2024-10-12 | 2-Two      | 1-One        |            3 |

  Scenario Outline: Search hotels with only mandatory fields
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Banupriya"
    When User search hotel "<state>","<city>","<checkIn>","<check-out>","<No of Room>" and "<No of Adults>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName                | password | state      | city    | checkIn    | check-out  | No of Room | No of Adults |
      | banupriyasr90@gmail.com | Banu@123 | Tamil Nadu | Chennai | 2024-10-10 | 2024-10-12 | 2-Two      | 1-One        |
 
  Scenario Outline: Search hotels without entering any fields and verifying the error messages
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Banupriya"
    And User click Search button
    Then User should verify after search hotel error message "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | userName                | password |
      | banupriyasr90@gmail.com | Banu@123 |

  Scenario Outline: Search hotels with all fields and verify the hotel price sorting from low to high
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Banupriya"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User click sort from low to high
    Then User should verify after sorting that price are listed from low to high

    Examples: 
      | userName                | password | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | banupriyasr90@gmail.com | Banu@123 | Tamil Nadu | Chennai | Standard | 2024-10-11 | 2024-10-12 | 2-Two      | 1-One        |            3 |
@Search
  Scenario Outline: Search hotels with all fields and verify the hotel name in Descending order
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Banupriya"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User click sort from Descending order
    Then User should verify after sorting that name in Descending order

    Examples: 
      | userName                | password | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | banupriyasr90@gmail.com | Banu@123 | Tamil Nadu | Chennai | Standard | 2024-10-11 | 2024-10-12 | 2-Two      | 1-One        |            3 |

  Scenario Outline: Search hotel with all fields and verify the Suite room type are listed
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Banupriya"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User click Suite room type
    Then User should verify after sorting that Suite room type is listed

    Examples: 
      | userName                | password | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | banupriyasr90@gmail.com | Banu@123 | Tamil Nadu | Chennai | Standard/Deluxe/Suite/| 2024-10-10 | 2024-10-12 | 2-Two      | 1-One        |            3 |

  Scenario Outline: Search hotels with all fields and select all room type verify the header
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Banupriya"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    And User should verify the header contains "<roomType>"

    Examples: 
      | userName                | password | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | banupriyasr90@gmail.com | Banu@123 | Tamil Nadu | Chennai | Standard | 2024-10-10 | 2024-10-12 | 2-Two      | 1-One        |            3 |
