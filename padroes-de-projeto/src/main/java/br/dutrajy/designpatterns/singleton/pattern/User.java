package br.dutrajy.designpatterns.singleton.pattern;

public class User {
    public void printDocument(String document) {
        Printer.getInstance().print(document);
    }
}
