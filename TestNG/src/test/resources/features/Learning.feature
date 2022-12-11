Feature: LetCode

  Scenario Outline: Input
    Given user launch browser
    Then user navigate to letcode website
    When user click on <card> card
    Then user enters data in Enter your full Name filed
    And user Append a text and press keyboard tab
    And user reads the text in the field
    And user clears text in the field
    And user verify the input field is disabled
    And user verify the input filed is read only
    Then user exit browser

    Examples: 
      | card  |
      | input |
