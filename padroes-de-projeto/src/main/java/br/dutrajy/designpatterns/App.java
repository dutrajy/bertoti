package br.dutrajy.designpatterns;

import br.dutrajy.designpatterns.strategy.antipattern.ShippingCostCalculator;
import br.dutrajy.designpatterns.strategy.pattern.ExpressShipping;
import br.dutrajy.designpatterns.strategy.pattern.NextDayShipping;
import br.dutrajy.designpatterns.strategy.pattern.Order;
import br.dutrajy.designpatterns.strategy.pattern.StandardShipping;

public class App {
    private static void strategy() {
        // Strategy Pattern
        System.out.println("\n\n+------------------------------------------------------------------------------+");
        System.out.println("| Strategy Pattern                                                             |");
        System.out.println("+------------------------------------------------------------------------------+");

        double packageWeight = 5.0;
        System.out.println("Peso do pacote: " + packageWeight + " kg\n");

        System.out.println("\nAnti Pattern:");
        ShippingCostCalculator calculator = new ShippingCostCalculator();

        System.out.println("Custo de frete normal: " + calculator.calculate(packageWeight, "standard"));
        System.out.println("Custo de frete expresso: " + calculator.calculate(packageWeight, "express"));
        System.out.println("Custo de frete para o dia seguinte: " + calculator.calculate(packageWeight, "nextday"));

        System.out.println("\nPattern:");
        Order order = new Order(new StandardShipping());

        System.out.println("Custo de frete normal: " + order.calculateTotalShipping(packageWeight));

        order.setShippingStrategy(new ExpressShipping());
        System.out.println("Custo de frete expresso: " + order.calculateTotalShipping(packageWeight));

        order.setShippingStrategy(new NextDayShipping());
        System.out.println("Custo de frete para o dia seguinte: " + order.calculateTotalShipping(packageWeight));
        System.out.println("\n+------------------------------------------------------------------------------+\n\n");
    }

    public static void main( String[] args ) {
        strategy();
    }
}
