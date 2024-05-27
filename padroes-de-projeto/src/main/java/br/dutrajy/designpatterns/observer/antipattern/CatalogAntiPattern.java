package br.dutrajy.designpatterns.observer.antipattern;

public class CatalogAntiPattern  {
    public void addProduct(ProductAntiPattern product) {
        System.out.println("Adding product: " + product.getName());
        EmailSystemAntiPattern.sendEmail(product);
        PushNotificationSystemAntiPattern.sendPushNotification(product);
        LogSystemAntiPattern.log(product);
    }
}
