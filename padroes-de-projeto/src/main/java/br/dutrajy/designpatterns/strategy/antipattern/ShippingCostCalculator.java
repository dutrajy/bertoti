package br.dutrajy.designpatterns.strategy.antipattern;

public class ShippingCostCalculator {
    public double calculate(double weight, String shippingType) {
        if (shippingType.equals("express")) {
            return weight * 2.0;
        } else if (shippingType.equals("nextday")) {
            return weight * 3.0;
        } else if (shippingType.equals("standard")) {
            return weight * 1.0;
        } else {
            throw new IllegalArgumentException("Invalid shipping strategy");
        }
    }
}
