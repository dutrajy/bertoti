package br.dutrajy.designpatterns.composite.pattern;

public class SimpleTask implements Task {
    private String description;
    private boolean done;

    public SimpleTask(String description) {
        this.description = description;
        this.done = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void execute() {
        this.done = true;
    }
}
