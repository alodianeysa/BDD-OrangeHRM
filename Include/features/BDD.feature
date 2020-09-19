Feature: Login Feature

  #Scenario: Test Login with valid Credentials
  #Given I am on the login page
  #When I input valid username and password
  #And I click login button
  #Then I should be navigated to home page
  Scenario Outline: Test Login with valid Credentials
    Given I am on the login page
    When I input valid <username> and <password>
    And I click login button
    Then I click Admin button
    When I click Nationalities button
    And I click Add button
    And I write text nationalities Aab
    Then I click save button
    When I check the column Aab
    Then I click delete button
    And I click OK for delete record
    When I click Leave button
    And I click Search button
    And I will stay at the Leave page
    Then I should be navigated to home page

    Examples: 
      | username | password |
      | Admin    | admin123 |
