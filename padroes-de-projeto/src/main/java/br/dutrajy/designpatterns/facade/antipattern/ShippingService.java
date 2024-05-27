package br.dutrajy.designpatterns.facade.antipattern;

public class ShippingService {
    public void shipItem(String item, String address) {
        System.out.println("Shipping item: " + item + " to address: " + address);
    }
}
