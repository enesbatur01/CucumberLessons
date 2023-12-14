#TASK:
  # 3 Tane Scenario oluşturunuz
  # Amazon sayfasında iphone, samsung ve nokia arayın.
  @US003
  Feature: US003 Amazon testi
    Background:
      Given kullanici amazon sayfasina gider

    @iphone
    Scenario: TC01 arama kutusunda iphone aratılır
      When arama kutusunda iphone aratir
      And sayfayi kapatir

    @samsung
    Scenario: TC02 arama kutusunda samsung aratılır
      When arama kutusunda samsung aratir
      And sayfayi kapatir
    @nokia
    Scenario: TC03 arama kutusunda nokia aratılır
      When arama kutusunda nokia aratir
      And sayfayi kapatir

      #Feature file da BASLANGİC icin ortak adimlar var ise Background keyword kullanarak tanımlarız
      #BeforeMethod mantığı ile çalışır