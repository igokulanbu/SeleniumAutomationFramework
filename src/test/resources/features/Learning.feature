Feature: LetCode

  @input
  Scenario Outline: Input practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
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

  @button
  Scenario Outline: Button practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
    When user click on <card> card
    Then user click on home button and navigate to same page
    And user get coordinates of button
    And user find color of the button
    And user find dimension of button
    And user verifies the button is disabled
    And user click and hold button
    Then user exit browser

    Examples: 
      | card   |
      | button |

  @select
  Scenario Outline: Select practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
    When user click on <card> card
    And user select <fruit> in dropdown
    And user select multiple superhero
    And user select last program language
    And user select india and print seleted option
    Then user exit browser

    Examples: 
      | card     | fruit |
      | dropdown | Apple |

  @alert
  Scenario Outline: Alert practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
    When user click on <card> card
    And user handles simple alert
    And user handles confirm alert
    And user handles prompt alert
    And user handles modern alert
    Then user exit browser

    Examples: 
      | card  |
      | alert |
