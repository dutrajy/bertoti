package br.dutrajy.designpatterns.strategy.pattern;

public class NextDayShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 3.0;
    }
}
