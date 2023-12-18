@US009
Feature: US009 Google Testi

  Scenario: TC01 Google Sayfasinda arama yapilir
    Given kullanici "googleUrl" sayfasina gider
    When kullanici verilen bilgiler ile arama yapar
      | volvo |
      | audi  |
      | honda |
    And sayfayi kapatir

  Scenario: TC01 Google Sayfasinda arama yapilir
    Given kullanici "googleUrl" sayfasina gider
    When kullanici verilen bilgiler ile arama yapar ikinci yol
      | volvo |
      | audi  |
      | honda |
    And sayfayi kapatir