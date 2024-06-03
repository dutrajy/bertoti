package br.dutrajy.designpatterns.strategy.antipattern;

public class AntiPatternNextDayOrder extends AntiPatternStandardOrder {
    public double calculateTotalShipping() {
        return this.weight * 3.0;
    }
}
