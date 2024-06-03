package br.dutrajy.designpatterns.strategy.antipattern;

public class AntiPatternExpressOrder extends AntiPatternStandardOrder {
    public double calculateTotalShipping() {
        return this.weight * 2.0;
    }
}
