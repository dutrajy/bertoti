package br.dutrajy.designpatterns.strategy.antipattern;

public class AntiPatternStandardOrder {
    protected double weight;

    public AntiPatternStandardOrder() {}

    public void setShippingWeight(double weight) {
        this.weight = weight;
    }

    public double calculateTotalShipping() {
        return this.weight * 1.0;
    }
}
