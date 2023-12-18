@US010
Feature: US010 BlueRentalCar sayfasında login testi

  Scenario: TC01 Verilen email ve password ile login olunur
    Given kullanici "blueRentalUrl" sayfasina gider
    When login butonuna tiklar
    And verilen email ve password ile login olur
      | email                         | password |
      | sam.walker@bluerentalcars.com | sami     |
      | john_doe@gmail.com            | johndoe  |
      | johnson@bluerentalcars.com    | johnson  |
    And sayfayi kapatir