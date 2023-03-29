Feature:Us01_Room_Olusturma
  @Room_Olusturma
  Scenario:TC01_Room_Olusturma
    Given Kullanici anasayfaya gider
    When Kullanici kullanici simgesi butonuna tiklar
    Then Kullanici Sign in alanina tiklar
    Then Kullanici username girer
    Then Kullanici password girer
    Then Kullanici Sign in butonuna tiklar
    Then Kullanici giris yaptigini dogrular
    Then Kullanici Items&Titles alanina tiklar
    Then Kullanici acilan listede Room tiklar
    Then Kullanici Create a new Room alanina tiklar
    And Kullanici Room Number alanina gecerli deger girer
    And Kullanici Room Type TWIN olarak secer
    And Kullanici Price alanina gecerli deger girer
    And Kullanici Description alanina gecerli deger girer
    And Kullanici Save alanina tiklar
    Then Kullanici Rooms sayfasinda Created Date'a tiklayarak odalari olusturma tarihine gore siralar
    Then Kullanici odanin olustugunu dogrular
    And sayfayi kapatir
