@US006
Feature: US006 Google Testi Scenario Outline
  Background:
    Given kullanici "googleUrl" sayfasina gider


  Scenario Outline: TC01 Google sayfasinda arama kutusunda arac aratilir
    When google arama kutusunda "<araclar>" aratir
    Then sayfa basliginin "<araclar>" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir
    Examples:
      | araclar |
      | ford |
      | hyundai |
      | honda |
      | limon |