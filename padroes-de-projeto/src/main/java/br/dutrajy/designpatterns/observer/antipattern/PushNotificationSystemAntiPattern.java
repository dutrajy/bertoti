package br.dutrajy.designpatterns.observer.antipattern;

public class PushNotificationSystemAntiPattern {
    public static void sendPushNotification(ProductAntiPattern product) {
        System.out.println("Sending push notification for product: " + product.getName());
    }
}
