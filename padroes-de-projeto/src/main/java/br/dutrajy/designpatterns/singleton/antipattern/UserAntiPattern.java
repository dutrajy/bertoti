package br.dutrajy.designpatterns.singleton.antipattern;

public class UserAntiPattern {
    private PrinterAntiPattern printer;

    public UserAntiPattern() {
        printer = new PrinterAntiPattern();
    }

    public void printDocument(String document) {
        printer.print(document);
    }
}
