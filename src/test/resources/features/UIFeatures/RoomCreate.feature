@ui_create_room
Feature: Room Create
  Scenario: room create
    Given kullanici "medunna" gider
    When kullanici giris bilgilerini girer
    Then items&titles paneline tiklar
    Then room a tiklar
    And create a new room buttonuna tiklar
    And kullanici fieldslari doldurur
    And save buttonuna tiklar
    And sayfayi kapatir
