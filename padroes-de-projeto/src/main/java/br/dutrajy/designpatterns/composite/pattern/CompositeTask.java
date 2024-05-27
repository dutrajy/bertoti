package br.dutrajy.designpatterns.composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeTask implements Task {
    private String description;
    private List<Task> subTasks;

    public CompositeTask(String description) {
        this.description = description;
        this.subTasks = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        for (Task task : subTasks) {
            if (!task.isDone()) {
                return false;
            }
        }
        return true;
    }

    public List<Task> getSubTasks() {
        return this.subTasks;
    }

    public void addSubTask(Task task) {
        subTasks.add(task);
    }

    public void removeSubTask(Task task) {
        subTasks.remove(task);
    }

    public void execute() {
        for (Task task : subTasks) {
            task.execute();
        }
    }
}
