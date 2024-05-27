package br.dutrajy.designpatterns.strategy.pattern;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 2.0;
    }
}
