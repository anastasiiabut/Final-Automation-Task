Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check site's main functions
    Given User opens '<homePage>' page
    And User clicks country Button
    And User checks country field visibility
    And User checks currency field visibility
    And User updates preferences
    And User checks header visibility
    And User checks footer visibility
    And User checks search field visibility
    And User checks women shop top icon visibility
    And User checks men shop top icon visibility
    And User checks cart visibility
    And User checks wishlist visibility
    When User clicks 'Profile' button
    And User checks sign bar in visibility
    And User checks join bar visibility
    When User clicks sign in bar
    And User checks email field to sign in visibility
    And User checks password field to sign in visibility
    And User checks 'Sign In' button visibility
    When User clicks join
    And User checks email field to join visibility
    And User checks password field to join visibility
    And User checks 'Join Asos' button visibility
    Then User clicks 'Asos Home' Button

    Examples:
      | homePage              |
      | https://www.asos.com/ |

  Scenario Outline: Check incorrect enter values to Join Asos
    Given User opens '<homePage>' page
    And User clicks 'Profile' button
    When User clicks join bar
    And User clicks 'Join Asos' button
    And User checks email address to join error visibility
    And User checks first name to join error visibility
    And User checks last name to join error visibility
    And User checks password to join error visibility
    And User checks date of birth to join error visibility
    And User clicks on day field
    And User enters '<day>' in day field
    And User clicks on month field
    And User enters '<letter>' in month field
    And User clicks on year field
    And User enters '<number>' in year field
    Then User checks date of birth to join error reason massage visibility

    Examples:
      | homePage              | day| letter| number |
      | https://www.asos.com/ |  1 |   o   |    2   |

  Scenario Outline: Check incorrect enter values to Sign In Asos
    Given User opens '<homePage>' page
    And User clicks 'Profile' button
    And User clicks sign in bar
    When User clicks 'Sign In' button
    And User checks email address to sign in error visibility
    And User checks password to sign in error visibility
    When User enters '<email>' in email field to sign in
    And User clicks 'Sign In' button
    And User checks password to sign in error visibility
    When User enters '<password>' in password field to sign in
    And User clicks 'Sign In' button
    Then User checks email address to sign in error visibility

    Examples:
      | homePage              |             email            |        password      |
      | https://www.asos.com/ |  asos_testcustomer@gmail.com |   Asos_testcustomer1 |

  Scenario Outline: Check search results page's main functions
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User enters '<keyword>' in search field
    And User checks the amount of products in search page
    When User clicks on 'Gender Tab'
    And User chooses 'Women'
    And User clicks on 'SaleNewSeason Tab'
    And User chooses 'Sale'
    And User clicks on 'Discount Tab'
    And User chooses 'Up to 20'
    And User clicks on 'Discount Tab'
    Then User checks the amount of products in search page with filters

    Examples:
      | homePage              |  keyword     |
      | https://www.asos.com/ |  Trench Coat |

  Scenario Outline: Check add two products to wishlist
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User enters '<keyword>' in search field
    And User clicks wishlist on first product
    And User clicks wishlist on second product
    And User clicks on wishlist
    Then User checks that amount of products in wishlist are two

    Examples:
      | homePage              |  keyword     |
      | https://www.asos.com/ |  Trench Coat |

  Scenario Outline: Check delete two products to wishlist
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User enters '<keyword>' in search field
    And User clicks wishlist on first product
    And User clicks on wishlist
    When User clicks on delete from wishlist button first product
    Then User checks that wishlist is empty

    Examples:
      | homePage              |  keyword     |
      | https://www.asos.com/ |  Trench Coat |

  Scenario Outline: Check delivery and returns page contains main info
    Given User opens '<homePage>' page
    And User clicks delivery and returns button
    And User checks 'Delivery Tab' visibility
    And User checks 'Returns Tab' visibility
    And User checks standard delivery info bar visibility
    And User checks express delivery info bar visibility
    When User clicks on 'Returns Tab'
    Then User checks download returns pdf info visibility

    Examples:
      | homePage              |
      | https://www.asos.com/ |

  Scenario Outline: Check product page main functions
    Given User opens '<homePage>' page
    And User checks search field visibility
    And User enters '<keyword>' in search field
    When User clicks on first product
    And User checks video icon visibility
    And User checks price visibility
    And User checks size field visibility
    And User checks add to bag button visibility
    And User clicks on fit assistant size button
    Then User checks fit assistant size popup visibility

    Examples:
      | homePage              |  keyword     |
      | https://www.asos.com/ |  Trench Coat |

  Scenario Outline: Check fit size assistant find S size
    Given User opens '<homePage>' page
    And User checks search field visibility
    And User enters '<keyword>' in search field
    And User clicks on second product
    When User clicks on fit assistant size button
    And User checks fit assistant size popup visibility
    And User enters '<height>' on height field
    And User clicks on weight field
    And User enters '<weight>' on weight field
    And User clicks on continue button
    And User clicks on flatter tummy shape button
    And User clicks on continue button
    And User clicks on straighter hip shape button
    And User clicks on continue button
    And User clicks on 75 bust size button
    And User clicks on A cup size button
    And User clicks on continue button
    And User clicks on age field
    And User enters '<age>' on age field
    And User clicks on continue button
    And User clicks on tighter fit preference button
    And User clicks on continue button
    And User clicks on skip question button
    Then User checks fit size assistant find S size

    Examples:
      | homePage              |  keyword     | height | weight | age |
      | https://www.asos.com/ |  Trench Coat | 166    | 59     | 27  |


  Scenario Outline: Check add product to cart
    Given User opens '<homePage>' page
    And User checks search field visibility
    And User enters '<keyword>' in search field
    When User clicks on second product
    And User checks size field visibility
    And User clicks on s size
    And User checks add to bag button visibility
    And User clicks on add to bag button
    And User checks that amount of products in cart is '<amountOfItems>'
    Then User checks checkout button visibility

    Examples:
      | homePage              |  keyword     | amountOfItems |
      | https://www.asos.com/ |  Trench Coat | 1                |

  Scenario Outline: Check delete product from cart
    Given User opens '<homePage>' page
    And User checks search field visibility
    And User enters '<keyword>' in search field
    When User clicks on second product
    And User checks size field visibility
    And User clicks on s size
    And User checks add to bag button visibility
    And User clicks on add to bag button
    And User checks that amount of products in cart is '<amountOfItems>'
    And User clicks on delete from cart button
    And User clicks on cart button
    Then User checks that cart is empty

    Examples:
      | homePage              |  keyword     | amountOfItems |
      | https://www.asos.com/ |  Trench Coat | 1             |



























