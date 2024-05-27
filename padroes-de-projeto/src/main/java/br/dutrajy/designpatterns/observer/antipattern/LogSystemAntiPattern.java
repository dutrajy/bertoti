package br.dutrajy.designpatterns.observer.antipattern;

public class LogSystemAntiPattern  {
    public static void log(ProductAntiPattern product) {
        System.out.println("Logging product: " + product.getName());
    }
}
