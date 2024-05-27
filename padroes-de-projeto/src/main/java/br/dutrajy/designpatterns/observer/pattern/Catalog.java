package br.dutrajy.designpatterns.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<CatalogObserver> observers = new ArrayList<>();

    public void addObserver(CatalogObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CatalogObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Product product) {
        for (CatalogObserver observer : observers) {
            observer.update(product);
        }
    }

    public void addProduct(Product product) {
        System.out.println("Adding product: " + product.getName());
        notifyObservers(product);
    }
}
