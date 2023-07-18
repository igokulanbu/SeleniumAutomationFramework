Feature: LetCode

  @input
  Scenario: Input practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
    When user click on "input" card
    Then user enters data in Enter your full Name filed
    And user Append a text and press keyboard tab
    And user reads the text in the field
    And user clears text in the field
    And user verify the input field is disabled
    And user verify the input filed is read only
    Then user exit browser


  @button
  Scenario: Button practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
    When user click on "button" card
    Then user click on home button and navigate to same page
    And user get coordinates of button
    And user find color of the button
    And user find dimension of button
    And user verifies the button is disabled
    And user click and hold button
    Then user exit browser

  @select
  Scenario: Select practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
    When user click on "dropdown" card
    And user select "Apple" in dropdown
    And user select multiple superhero
    And user select last program language
    And user select india and print seleted option
    Then user exit browser


  @alert
  Scenario: Alert practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
    When user click on "alert" card
    And user handles simple alert
    And user handles confirm alert
    And user handles prompt alert
    And user handles modern alert
    Then user exit browser


  @frame
  Scenario: Frame practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
    When user click on "frame" card
    And user enters name details
    And user enters email
    And user click watch titorial link
    Then user exit browser


  @radio
  Scenario: Frame practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
    When user click on "radio" card
    And user select any one ratio button
    And user confirms selected only one ratio button
    And user verifies both ratio button is not selected
    And user verified the selected ratio button
    And user verifies last ratio button in disabled
    And user verifies checkbox is selected
    And user accepts the terms and conditions
    Then user exit browser


  @windows
  Scenario: Frame practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
    When user click on "windows" card
    And user handles windows on clicking GoToHome button
    Then user exit browser


  @windows
  Scenario: Frame practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
    When user click on "windows" card
    And user handles windows on clicking OpenMultipleWindows button
    Then user exit browser

  @elements
  Scenario: Frame practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
    When user click on "elements" card
    And user perform actions for "sad" in element page
    And user perform actions for "S004" in element page
    Then user exit browser
    
  @drag
  Scenario: Frame practice scenarios
    Given user launch browser
    Then user navigate to letcode website
    And user navigate to practice workspace
    When user click on "drag" card
    And user perfrom drag action
    Then user exit browser
