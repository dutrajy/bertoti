package br.dutrajy.designpatterns.facade.antipattern;

public class InventoryService {
    public void checkInventory(String item) {
        System.out.println("Checking inventory for item: " + item);
    }
}
