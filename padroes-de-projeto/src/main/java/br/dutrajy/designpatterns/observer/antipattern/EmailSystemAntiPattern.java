package br.dutrajy.designpatterns.observer.antipattern;

public class EmailSystemAntiPattern{
    public static void sendEmail(ProductAntiPattern product) {
        System.out.println("Sending email for product: " + product.getName());
    }
}
