package br.dutrajy.designpatterns.strategy.pattern;

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 1.0;
    }
}
