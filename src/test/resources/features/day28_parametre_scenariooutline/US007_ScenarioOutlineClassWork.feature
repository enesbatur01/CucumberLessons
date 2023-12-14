#USER STORY : US_manager_login_test
#Scenario:kullanici tum manager login bilgileriyle giriş yapabilmeli

#TEST DATA
#url : https://www.bluerentalcars.com/
#Managers:
#| ayhancan@bluerentalcars.com   | ayhan    |
#| beyhancan@bluerentalcars.com  | beyhan   |
#| sam.walker@bluerentalcars.com | sami     |
#| john_doe@gmail.com            | johndoe  |
#| johnson@bluerentalcars.com    | johnson  |
@US007
Feature: US007 BlueRentalCar Login islemi

  Scenario Outline: TC01 Kullanici manager login bilgileriyle giriş yapabilmeli
    Given kullanici "blueRentalUrl" sayfasina gider
    When login butonuna tiklar
    Then "<email>" ve "<password>" bilgileri ile manager olarak login olur
    And giriş yapildigini dogrular
    And sayfayi kapatir
    Examples:
      | email                         | password |
      | ayhancan@bluerentalcars.com   | ayhan    |
      | beyhancan@bluerentalcars.com  | beyhan   |
      | sam.walker@bluerentalcars.com | sami     |
      | john_doe@gmail.com            | johndoe  |
      | johnson@bluerentalcars.com    | johnson  |