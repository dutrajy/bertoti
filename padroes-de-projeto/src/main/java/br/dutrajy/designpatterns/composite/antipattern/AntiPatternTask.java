package br.dutrajy.designpatterns.composite.antipattern;

public class AntiPatternTask {
    private String description;
    private boolean done;

    public AntiPatternTask(String description) {
        this.description = description;
        this.done = false;
    }

    public String getDescription() {
        return description + " " + (done ? "[DONE]" : "[TODO]");
    }

    public boolean isDone() {
        return this.done;
    }

    public void execute() {
        this.done = true;
    }
}
