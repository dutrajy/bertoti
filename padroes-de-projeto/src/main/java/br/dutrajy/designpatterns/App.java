package br.dutrajy.designpatterns;

import br.dutrajy.designpatterns.composite.antipattern.AntiPatterMultiTask;
import br.dutrajy.designpatterns.composite.antipattern.AntiPatternTask;
import br.dutrajy.designpatterns.composite.antipattern.AntiPatternTaskList;
import br.dutrajy.designpatterns.composite.pattern.CompositeTask;
import br.dutrajy.designpatterns.composite.pattern.SimpleTask;
import br.dutrajy.designpatterns.composite.pattern.Task;
import br.dutrajy.designpatterns.facade.antipattern.InventoryService;
import br.dutrajy.designpatterns.facade.antipattern.PaymentService;
import br.dutrajy.designpatterns.facade.antipattern.ShippingService;
import br.dutrajy.designpatterns.facade.pattern.Ecommerce;
import br.dutrajy.designpatterns.observer.antipattern.CatalogAntiPattern;
import br.dutrajy.designpatterns.observer.antipattern.ProductAntiPattern;
import br.dutrajy.designpatterns.observer.pattern.Catalog;
import br.dutrajy.designpatterns.observer.pattern.EmailSystem;
import br.dutrajy.designpatterns.observer.pattern.LogSystem;
import br.dutrajy.designpatterns.observer.pattern.Product;
import br.dutrajy.designpatterns.observer.pattern.PushNotificationSystem;
import br.dutrajy.designpatterns.singleton.pattern.User;
import br.dutrajy.designpatterns.strategy.antipattern.AntiPatternExpressOrder;
import br.dutrajy.designpatterns.strategy.antipattern.AntiPatternNextDayOrder;
import br.dutrajy.designpatterns.strategy.antipattern.AntiPatternStandardOrder;
import br.dutrajy.designpatterns.strategy.pattern.ExpressShipping;
import br.dutrajy.designpatterns.strategy.pattern.NextDayShipping;
import br.dutrajy.designpatterns.strategy.pattern.Order;
import br.dutrajy.designpatterns.strategy.pattern.StandardShipping;

public class App {
    private static void strategy() {
        // Strategy Pattern
        System.out.println("+------------------------------------------------------------------------------+");
        System.out.println("| Strategy Pattern                                                             |");
        System.out.println("+------------------------------------------------------------------------------+");

        double packageWeight = 5.0;
        System.out.println("Peso do pacote: " + packageWeight + " kg\n");

        System.out.println("Anti Pattern:");

        AntiPatternStandardOrder antiPatternStandardOrder = new AntiPatternStandardOrder();
        antiPatternStandardOrder.setShippingWeight(packageWeight);
        AntiPatternStandardOrder antiPatternExpressOrder = new AntiPatternExpressOrder();
        antiPatternExpressOrder.setShippingWeight(packageWeight);
        AntiPatternNextDayOrder antiPatternNextDayOrder = new AntiPatternNextDayOrder();
        antiPatternNextDayOrder.setShippingWeight(packageWeight);

        System.out.println("Custo de frete normal: " + antiPatternStandardOrder.calculateTotalShipping());
        System.out.println("Custo de frete expresso: " + antiPatternExpressOrder.calculateTotalShipping());
        System.out.println("Custo de frete para o dia seguinte: " + antiPatternNextDayOrder.calculateTotalShipping());

        System.out.println("\nPattern:");
        Order order = new Order(new StandardShipping());

        System.out.println("Custo de frete normal: " + order.calculateTotalShipping(packageWeight));

        order.setShippingStrategy(new ExpressShipping());
        System.out.println("Custo de frete expresso: " + order.calculateTotalShipping(packageWeight));

        order.setShippingStrategy(new NextDayShipping());
        System.out.println("Custo de frete para o dia seguinte: " + order.calculateTotalShipping(packageWeight));
        System.out.println("+------------------------------------------------------------------------------+\n");
    }

    public static void composite() {
        // Composite Pattern
        System.out.println("+------------------------------------------------------------------------------+");
        System.out.println("| Composite Pattern                                                            |");
        System.out.println("+------------------------------------------------------------------------------+");

        System.out.println("Anti pattern:");
        AntiPatternTask task1 = new AntiPatternTask("Tarefa 1");
        AntiPatternTask task2 = new AntiPatternTask("Tarefa 2");
        AntiPatternTask task3 = new AntiPatternTask("Tarefa 3");
        AntiPatternTask task4 = new AntiPatternTask("Tarefa 4");

        AntiPatterMultiTask multiTask1 = new AntiPatterMultiTask("Multitarefa 1");
        multiTask1.addTask(task3);
        multiTask1.addTask(task4);

        AntiPatternTaskList taskList = new AntiPatternTaskList();
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addMultiTask(multiTask1);

        taskList.execute();

        System.out.println(taskList.getDescription());

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
        System.out.println("+------------------------------------------------------------------------------+\n");
    }

    public static void facade() {
        // Facade Pattern
        System.out.println("+------------------------------------------------------------------------------+");
        System.out.println("| Facade Pattern                                                               |");
        System.out.println("+------------------------------------------------------------------------------+");

        String item = "Laptop";
        String account = "user123";
        double amount = 1200.00;
        String address = "123 Main St";

        System.out.println("Anti pattern:");
        InventoryService inventoryService = new InventoryService();
        PaymentService paymentService = new PaymentService();
        ShippingService shippingService = new ShippingService();
        inventoryService.checkInventory(item);
        paymentService.processPayment(account, amount);
        shippingService.shipItem(item, address);

        System.out.println("\nPattern:");
        Ecommerce ecommerce = new Ecommerce();
        ecommerce.placeOrder(item, account, amount, address);

        System.out.println("+------------------------------------------------------------------------------+\n");
    }

    private static void singleton() {
        // Singleton Pattern
        System.out.println("+------------------------------------------------------------------------------+");
        System.out.println("| Singleton Pattern                                                            |");
        System.out.println("+------------------------------------------------------------------------------+");

        System.out.println("\nPattern:");
        User user1 = new User();
        User user2 = new User();
        user1.printDocument("Document1");
        user2.printDocument("Document2");

        System.out.println("+------------------------------------------------------------------------------+\n");
    }

    public static void observer() {
        // Observer Pattern
        System.out.println("+------------------------------------------------------------------------------+");
        System.out.println("| Observer Pattern                                                             |");
        System.out.println("+------------------------------------------------------------------------------+");

        System.out.println("Anti pattern:");
        CatalogAntiPattern catalogAntiPattern = new CatalogAntiPattern();
        catalogAntiPattern.addProduct(new ProductAntiPattern("Laptop"));

        System.out.println("\nPattern:");
        Catalog catalog = new Catalog();
        EmailSystem emailSystem = new EmailSystem();
        PushNotificationSystem pushNotificationSystem = new PushNotificationSystem();
        LogSystem logSystem = new LogSystem();
        catalog.addObserver(emailSystem);
        catalog.addObserver(pushNotificationSystem);
        catalog.addObserver(logSystem);
        catalog.addProduct(new Product("Laptop"));

        System.out.println("+------------------------------------------------------------------------------+\n");
    }

    public static void main( String[] args ) {
        System.out.println("");
        strategy();
        composite();
        facade();
        singleton();
        observer();
    }
}
