@US004
Feature: US004 Amazon Testi
  Background:
    Given kullanici "amazonUrl" sayfasina gider

  Scenario: TC01 Arama kutusunda nokia aratılır
    And arama kutusunda "nokia" aratir
    And sayfayi kapatir

  Scenario: TC02 Arama kutusunda java aratılır
    And arama kutusunda "java" aratir
    And sayfayi kapatir

  Scenario: TC03 Arama kutusunda selenium aratılır
    And arama kutusunda "selenium" aratir
    And sayfayi kapatir

    # Feature file i daha dynamic hale getirebilmek için gitmek istediğimiz url yada aratmak istediğimiz bir ifadeyi
    # ""(Çift tirnak) içinde belirtebiliriz. Cunku tirnak içinde yazdığımız değer stepDefinition classındaki method için
    # artık bir parametreye dönüşür, böylece tekrar tekrar method oluşturmak zorunda kalmadan istediğimiz url e gidebilir
    # veya istediğimiz kelimeyi aratabiliriz.