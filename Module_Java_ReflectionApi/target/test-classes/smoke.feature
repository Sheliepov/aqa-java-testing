Feature: Smoke

  Scenario Outline: Check site search ability
    Given User opens '<homePage>' page
    When User enter '<text>' into search field
    And User click to 'Search' button
    Then Product list is displayed

    Examples:
      | homePage                | text |
      | https://www.amazon.com/ | ipad |

  Scenario Outline: Check search by category
    Given User opens '<homePage>' page
    When User click HamburgerMenu button
    And User click a product category
    And User selects a subcategory
    And User click check_box parameter
    And User check availability product

    Examples:
      | homePage                |
      | https://www.amazon.com/ |

  Scenario Outline: Check amount of elements on a page
    Given User opens '<homePage>' page
    When User click HamburgerMenu button
    And User click a product category
    And User selects a subcategory
    And User checks amount of elements

    Examples:
      | homePage                |
      | https://www.amazon.com/ |

  Scenario Outline: Check count of images page
    Given User opens '<homePage>' page
    When User click HamburgerMenu button
    And User click a product category
    And User selects a subcategory
    And User check count of images page

    Examples:
      | homePage                |
      | https://www.amazon.com/ |