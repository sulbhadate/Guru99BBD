@EndToEndTesting
Feature: Test the Facebook Application

  Scenario Outline: Test RegisterPage Functionation
    Given User on Register Page
    When User enter "<firstname>" and "<lastname>" and "<Email>" and "<ConfirmEmail>" and "<Password>" and "<Date>" and "<Month>" and "<Year>" and "<Radio>"

    Examples: 
      | firstname | lastname | Email           | ConfirmEmail    | Password | Date | Month | Year | Radio  |
      | Vibha     | Date     | vibha@gmail.com | vibha@gmail.com | vibha123 |   22 | May   | 1993 | Female |
      | Pranita   | Ithape   | panu@gmail.com  | panu@gmail.com  | panu123  |   23 | Jul   | 1992 | Female |
      | Komal     | Kale     | komal@gmail.com | komal@gmail.com | komal123 |   10 | Mar   | 1994 | Female |
