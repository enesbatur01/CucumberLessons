@US012
Feature: US012 BlueRentalCar sayfasında excel dosyasi ile login islemi

  Scenario: TC01 Excel deki email ve password bilgileri ile login olunur
    Given kullanici "blueRentalUrl" sayfasina gider
    When login butonuna tiklar
    And exceldeki "admin_info" sayfasindaki kullanici bilgileri ile login olur
    And sayfayi kapatir
