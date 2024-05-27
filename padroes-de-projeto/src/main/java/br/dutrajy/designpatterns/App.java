package br.dutrajy.designpatterns;

import br.dutrajy.designpatterns.composite.antipattern.TaskAntiPattern;
import br.dutrajy.designpatterns.composite.pattern.CompositeTask;
import br.dutrajy.designpatterns.composite.pattern.SimpleTask;
import br.dutrajy.designpatterns.composite.pattern.Task;
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

    public static void composite() {
        // Composite Pattern
        System.out.println("\n\n+------------------------------------------------------------------------------+");
        System.out.println("| Composite Pattern                                                             |");
        System.out.println("+------------------------------------------------------------------------------+");

        System.out.println("Anti pattern:");
        TaskAntiPattern mainTask = new TaskAntiPattern("Main Task", true);
        TaskAntiPattern subTask1 = new TaskAntiPattern("Subtask 1", false);
        TaskAntiPattern subTask2 = new TaskAntiPattern("Subtask 2", false);

        mainTask.addSubTask(subTask1);
        mainTask.addSubTask(subTask2);

        mainTask.execute();

        System.out.println("Main Task is done? " + mainTask.isDone());
        for (TaskAntiPattern subTask : mainTask.getSubtasks()) {
            System.out.println("Subtask " + subTask.getDescription() + " is done? " + subTask.isDone());
        }

        System.out.println("\nPattern:");
        CompositeTask compositeMainTask = new CompositeTask("Main Task");
        compositeMainTask.addSubTask(new SimpleTask("Subtask 1"));
        compositeMainTask.addSubTask(new SimpleTask("Subtask 2"));

        CompositeTask subTask = new CompositeTask("Sub Task");
        subTask.addSubTask(new SimpleTask("Subtask 3"));
        subTask.addSubTask(new SimpleTask("Subtask 4"));

        compositeMainTask.addSubTask(subTask);

        compositeMainTask.execute();

        System.out.println("Is Main Task done? " + compositeMainTask.isDone());
        System.out.println("Are Sub Tasks done?");
        for (Task task : subTask.getSubTasks()) {
            System.out.println(task.getDescription() + ": " + task.isDone());
        }
        System.out.println("\n+------------------------------------------------------------------------------+\n\n");
    }

    public static void main( String[] args ) {
        strategy();
        composite();
    }
}
