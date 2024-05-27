package br.dutrajy.designpatterns.observer.pattern;

public class LogSystem implements CatalogObserver {
    public void update(Product product) {
        System.out.println("Logging product: " + product.getName());
    }
}
