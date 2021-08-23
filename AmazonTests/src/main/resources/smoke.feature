Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Background:
    Given User opens 'https://www.amazon.com/' page

  Scenario Outline: Check the email error message in the sing in form
    When User checks Sign In button visibility
    And User clicks Sign In button
    And User checks Email or mobile phone number field visibility on sign in popup
    And User checks Continue button visibility on sign in popup
    And User clicks Continue button
    Then User checks that current error message is '<errorMessage>'

    Examples:
      | errorMessage                            |
      | Enter your email or mobile phone number |

  Scenario Outline: Check sing in form
    When User clicks Sign In button
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
      | userEmail      | userPassword | userName    |
      | test@gmail.com | 1111QQQq     | Hello, Olha |

  Scenario Outline: Check changing user's name
    When User clicks Sign In button
    And User checks Email or mobile phone number field visibility on sign in popup
    And User enters his Email in Email or mobile phone number field '<userEmail>'
    And User checks Continue button visibility on sign in popup
    And User clicks Continue button
    And User checks Password field visibility on sign in popup
    And User enters his Password '<userPassword>'
    And User checks Sign-In button visibility on sign in popup
    And User clicks Sign-In button on sign in popup
    And User clicks Account & Lists in header
    And User clicks Login & security
    And User checks name box visibility
    And User clicks Edit button for changing user's name
    And User checks title of page is '<changeNameTitle>'
    And User changes current name to '<newName>' new name
    And User checks Save changes button
    Then User checks that current name is '<currentName>'

    Examples:
      | userEmail      | userPassword | changeNameTitle  | newName  | currentName |
      | test@gmail.com | 1111QQQq     | Change your name | OlhaTest | OlhaTest    |

  Scenario Outline: Check adding product to Shopping List without sign in and after user has added with sign in
    When User checks search field visibility
    And User makes search by keyword '<keyword>'
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
    And User clicks Add to List button after user has singed in
    And User checks that list visibility
    Then checks that item was added to list

    Examples:
      | keyword | userEmail      | userPassword |
      | Battery | test@gmail.com | 1111QQQq     |

  Scenario Outline: Check add product to cart
    When User checks search field visibility
    And User makes search by keyword '<keyword>'
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
      | keyword | brand | minPrice | maxPrice | title         | quantity |
      | Headset | Razer | 149      | 150      | Shopping Cart | 1        |

  Scenario Outline: Check searching by category
    When User checks categories dropdown visibility
    And User clicks on list of categories
    And User clicks '<categoryName>' category
    And User makes search by keyword '<keyword>'
    And User clicks search button
    Then User checks that title first product has word '<keywordTitle>'

    Examples:
      | categoryName | keyword | keywordTitle |
      | Books        | Art     | Art          |

  Scenario Outline: Check Buy again option
    When User clicks Sign In button
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
      | userEmail      | userPassword | title       | message                                                                                                                 |
      | test@gmail.com | 1111QQQq     | Your Orders | There are no recommended items for you to buy again at this time. Check Your Orders for items you previously purchased. |

  Scenario Outline: Check searching goods from Amazon Top Sellers link
    When User clicks Shop now link in Amazon Top Sellers
    And User clicks Luggage left category
    And User clicks Luggage Sets left category
    And User opens first product from International Best Sellers page
    Then User checks that title first product has word '<keywordTitle>' from International Best Sellers page

    Examples:
      | keywordTitle |
      | Luggage      |

  Scenario Outline: Check similar items
    When User clicks Sign In button
    And User checks Email or mobile phone number field visibility on sign in popup
    And User enters his Email in Email or mobile phone number field '<userEmail>'
    And User checks Continue button visibility on sign in popup
    And User clicks Continue button
    And User checks Password field visibility on sign in popup
    And User enters his Password '<userPassword>'
    And User checks Sign-In button visibility on sign in popup
    And User clicks Sign-In button on sign in popup
    And User clicks Browsing History button
    And User clicks on More like this button of second item
    Then User checks that current page is '<currentTitleOfPage>'

    Examples:
      | userEmail      | userPassword | currentTitleOfPage |
      | test@gmail.com | 1111QQQq     | Similar items      |

  Scenario Outline: Check Product details after searching
    When User clicks Sign In button
    And User checks Email or mobile phone number field visibility on sign in popup
    And User enters his Email in Email or mobile phone number field '<userEmail>'
    And User checks Continue button visibility on sign in popup
    And User clicks Continue button
    And User checks Password field visibility on sign in popup
    And User enters his Password '<userPassword>'
    And User checks Sign-In button visibility on sign in popup
    And User clicks Sign-In button on sign in popup
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User opens first product after searching
    Then User checks Product details visibility

    Examples:
      | userEmail      | userPassword | keyword |
      | test@gmail.com | 1111QQQq     | sticker |