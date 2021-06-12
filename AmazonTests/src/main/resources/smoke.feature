Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check the email error message in the sing in form
    Given User opens '<homePage>' page
    And User checks Sign In button visibility
    When User clicks Sign In button
    And User checks Email or mobile phone number field visibility on sign in popup
    And User checks Continue button visibility on sign in popup
    And User clicks Continue button
    Then User checks that current error message is '<errorMessage>'

    Examples:
      | homePage                | errorMessage                            |
      | https://www.amazon.com/ | Enter your email or mobile phone number |

  Scenario Outline: Check sing in form
    Given User opens '<homePage>' page
    And User clicks Sign In button
    And User checks Email or mobile phone number field visibility on sign in popup
    And User enters his Email in Email or mobile phone number field '<userEmail>'
    And User checks Continue button visibility on sign in popup
    And User clicks Continue button
    And User checks Password field visibility on sign in popup
    And User enters his Password '<userPassword>'
    And User checks Sign-In button visibility on sign in popup
    And User clicks Sign-In button on sign in popup
    Then User checks user was logged in to site as '<userName>'

    Examples:
      | homePage                | userEmail           | userPassword | userName    |
      | https://www.amazon.com/ | easyhunt1@gmail.com | 1111Qqqq     | Hello, Olha |

  Scenario Outline: Check add product to List without sign in
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User opens first product
    And User clicks Add to List button
    And User checks Email or mobile phone number field visibility on sign in popup
    And User enters his Email in Email or mobile phone number field '<userEmail>'
    And User checks Continue button visibility on sign in popup
    And User clicks Continue button
    And User checks Password field visibility on sign in popup
    And User enters his Password '<userPassword>'
    And User checks Sign-In button visibility on sign in popup
    And User clicks Sign-In button on sign in popup

    Examples:
      | homePage                | keyword | userEmail           | userPassword |
      | https://www.amazon.com/ | Battery | easyhunt1@gmail.com | 1111Qqqq     |

  Scenario Outline: Check add product to cart
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User selects '<brand>' brand in the right filter
    And User sets '<minPrice>' min price in the right filter
    And User sets '<maxPrice>' max price in the right filter
    And User clicks go button
    And User opens first product after searching
    And User checks Add to Cart button visibility on product page
    And User clicks Add to Cart button on product page
    And User checks Cart button visibility
    And User clicks Cart button
    And User checks that page opens with '<title>' title
    Then User checks that quantity is '<quantity>'

    Examples:
      | homePage                | keyword | brand | minPrice | maxPrice | title         | quantity |
      | https://www.amazon.com/ | Headset | Razer | 149      | 150      | Shopping Cart | 1        |

  Scenario Outline: Check searching by category
    Given User opens '<homePage>' page
    And User checks categories dropdown visibility
    And User clicks on list of categories
    And User clicks '<categoryName>' category
    When User makes search by keyword '<keyword>'
    And User clicks search button
    Then User checks that title first product has word '<keywordTitle>'

    Examples:
      | homePage                | categoryName | keyword | keywordTitle |
      | https://www.amazon.com/ | Books        | Art     | Art          |

  Scenario Outline: Check Buy again option
    Given User opens '<homePage>' page
    And User clicks Sign In button
    And User checks Email or mobile phone number field visibility on sign in popup
    And User enters his Email in Email or mobile phone number field '<userEmail>'
    And User checks Continue button visibility on sign in popup
    And User clicks Continue button
    And User checks Password field visibility on sign in popup
    And User enters his Password '<userPassword>'
    And User checks Sign-In button visibility on sign in popup
    And User clicks Sign-In button on sign in popup
    And User clicks Buy Again button
    And User checks '<title>' title visibility
    Then User checks that page shows '<message>'

    Examples:
      | homePage                | userEmail           | userPassword | title       | message                                                                                                                 |
      | https://www.amazon.com/ | easyhunt1@gmail.com | 1111Qqqq     | Your Orders | There are no recommended items for you to buy again at this time. Check Your Orders for items you previously purchased. |

