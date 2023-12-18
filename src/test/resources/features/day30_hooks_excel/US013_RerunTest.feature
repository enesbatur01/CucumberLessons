@US013
Feature: US005 Google Testi
  Background:
    Given kullanici "googleUrl" sayfasina gider


  Scenario: TC01 Google sayfasinda arama kutusunda arac aratilir
    When google arama kutusunda "ford" aratir
    Then sayfa basliginin "fordo" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir

@honda
  Scenario: TC02 Google sayfasinda arama kutusunda arac aratilir
    When google arama kutusunda "toyota" aratir
    Then sayfa basliginin "toyota" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir


  Scenario: TC03 Google sayfasinda arama kutusunda arac aratilir
    When google arama kutusunda "hyundai" aratir
    Then sayfa basliginin "hyundai" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir