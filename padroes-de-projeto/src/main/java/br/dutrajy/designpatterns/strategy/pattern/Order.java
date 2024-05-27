package br.dutrajy.designpatterns.strategy.pattern;

public class Order {
    private ShippingStrategy shippingStrategy;

    public Order(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateTotalShipping(double weight) {
        return shippingStrategy.calculateShippingCost(weight);
    }
}
