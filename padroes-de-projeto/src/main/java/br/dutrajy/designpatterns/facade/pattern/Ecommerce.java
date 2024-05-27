package br.dutrajy.designpatterns.facade.pattern;

import br.dutrajy.designpatterns.facade.antipattern.InventoryService;
import br.dutrajy.designpatterns.facade.antipattern.PaymentService;
import br.dutrajy.designpatterns.facade.antipattern.ShippingService;

public class Ecommerce {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public Ecommerce() {
        inventoryService = new InventoryService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
    }

    public void placeOrder(String item, String account, double amount, String address) {
        inventoryService.checkInventory(item);
        paymentService.processPayment(account, amount);
        shippingService.shipItem(item, address);
    }
}
