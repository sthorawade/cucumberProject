Feature: Amazon App Testing

  @amazon
  Scenario Outline: Add an item to cart in Amazon application
    Given User is on amazon application log in page
    When user enters username "<username>" and password "<password>"
    When user search for item "<item>"
    And user added the item to cart

    Examples: 
      | username | password    | item   |
      | saurabh  | saurabh@007 | mobile |
