package br.dutrajy.designpatterns.composite.antipattern;

import java.util.ArrayList;
import java.util.List;

public class AntiPatterMultiTask {
    private String description;
    private List<AntiPatternTask> tasks;

    public AntiPatterMultiTask(String description) {
        this.description = description;
        this.tasks = new ArrayList<>();
    }

    public void addTask(AntiPatternTask task) {
        tasks.add(task);
    }

    public List<AntiPatternTask> getTasks() {
        return tasks;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder(description + " " + (isDone() ? "[DONE]" : "[TODO]"));
        for (AntiPatternTask task : tasks) {
            sb.append("\n\t").append("- " + task.getDescription());
        }
        return sb.toString();
    }

    public boolean isDone() {
        for (AntiPatternTask task : tasks) {
            if (!task.isDone()) return false;
        }
        return true;
    }

    public void execute() {
        for (AntiPatternTask task : tasks) {
            task.execute();
        }
    }
}
