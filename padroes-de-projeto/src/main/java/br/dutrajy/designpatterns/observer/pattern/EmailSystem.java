package br.dutrajy.designpatterns.observer.pattern;

public class EmailSystem implements CatalogObserver {
    public void update(Product product) {
        System.out.println("Sending email for product: " + product.getName());
    }
}
