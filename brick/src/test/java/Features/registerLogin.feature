Feature:Register and Login

  @Positive @Register @TC_001 @TC_002 @TC_OO5 @TC_006 @TC_007 @TC_008
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
    And   User closes the browser
    Examples:
      |   page_loc    |   first_name    |   last_name   |   email   |   country_code    |   phone_num   |    addr   |   pass    |   conf_pass    |   button    |
      |   register    |   test first name | test last name  | test33@acc.com | Indonesia | 89123123123   | gotham city | testing | testing        |  register   |
      |   register    |   test first name | test last name  | test34@acc.com | Indonesia | 89123123123   |           | testing   | testing        |  register   |
      |   register    | | | test2@acc.com | Indonesia | 89123123123   |           | testing   | testing        |  register   |
      |   register    |   test first name | test last name  | test19@acc.com | Indonesia | 89123123123   | gotham city |      |      |  register   |
      |   register    |   test first name | test last name  | test19@acc.com | Indonesia | | gotham city | testing | testing        |  register   |
      |   register    |   test first name | test last name  | test19@acc.com | Indonesia | 89123123...   | gotham city | testing | testing        |  register   |
      |   register    | | | test19@acc.com | Indonesia | 89123123123   | gotham city | testing | testing        |  register   |
      |   register    || test last name  | test19@acc.com | Indonesia | 89123123123   | gotham city | testing | testing        |  register   |

  @Positive @Register @TC_003
  Scenario Outline:Change country code
    Given User is on "<page_loc>" page
    And User inputs first name "<first_name>" and last name "<last_name>"
    And User inputs email "<email>"
    And User selects country code "<country_code>"
    And User inputs phone number "<phone_num>"
    And User selects country code "<country_code2>"
    And User inputs address "<addr>"
    And User inputs password "<pass>"
    And User input confirm password "<conf_pass>"
    When  User clicks "<button>" button
    Then  User is registered
    And   User closes the browser
    Examples:
      |   page_loc    |   first_name    |   last_name   |   email   |   country_code    |   phone_num   | country_code2 |    addr   |   pass    |   conf_pass    |   button    |
      |   register    |   test first name | test last name  | test65@acc.com | Indonesia | 89123123123   | Singapore    | gotham city | testing | testing        |  register   |

  @Positive @Login @TC_004
  Scenario Outline:Login using registered account
    Given User is on "<page_loc>" page
    And User inputs email or username "<email>"
    And User inputs password "<pass>"
    When  User clicks "<button>" button
    Then  User is logged in
    And   User closes the browser
    Examples:
      |   page_loc    |   email         |   pass    |  button |
      |   login       | test@acc.com  | testing   |  login  |
