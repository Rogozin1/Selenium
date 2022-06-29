Feature: Добавление товара в корзину

  Background:
    Given User Authorized

    @hooks
      @close
  Scenario Outline:
    When click tshirts button in women submenu
    And select size '<size>'
    And select color '<color>'
    And select price
    And click tshirt cart by name

    Examples:
      | size |  | color  |
      | S    |  | orange |
      | M    |  | blue   |

