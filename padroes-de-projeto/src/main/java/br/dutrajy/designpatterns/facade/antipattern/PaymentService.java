package br.dutrajy.designpatterns.facade.antipattern;

public class PaymentService {
    public void processPayment(String account, double amount) {
        System.out.println("Processing payment for account: " + account + ", amount: " + amount);
    }
}
