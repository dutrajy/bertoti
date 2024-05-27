package br.dutrajy.designpatterns.observer.pattern;

public class PushNotificationSystem implements CatalogObserver {
    public void update(Product product) {
        System.out.println("Sending push notification for product: " + product.getName());
    }
}
