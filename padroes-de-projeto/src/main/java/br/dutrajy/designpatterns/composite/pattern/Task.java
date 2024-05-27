package br.dutrajy.designpatterns.composite.pattern;

public interface Task {
    String getDescription();
    boolean isDone();
    void execute();
}
