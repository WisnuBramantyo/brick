Feature:Register and Login

  @Positive @Register
  Scenario Outline:Register using manipulated data
    Given User is on "<page_loc>" page
    And User inputs first name "<first_name>" and last name "<last_name>"
    And User inputs email "<email>"
    And User selects country code "<country_code>"
    And User inputs phone number "<phone_num>"
    And User inputs address "<addr>"
    And User inputs password "<pass>"
    And User input confirm password "<conf_pass>"
    When  User clicks "<button>" button
    Then  User is registered
    Examples:
      |   page_loc    |   first_name    |   last_name   |   email   |   country_code    |   phone_num   |    addr   |   pass    |   conf_pass    |   button    |
      |   register    |   test first name | test last name  | test1@acc.com | Indonesia | 89123123123   | gotham city | testing | testing        |  register   |

  Scenario:test pararel 1
    Given user open browser "https://brick-qa-assignment.herokuapp.com/"
    When user waiting for 6 seconds
    Then user stop browser

