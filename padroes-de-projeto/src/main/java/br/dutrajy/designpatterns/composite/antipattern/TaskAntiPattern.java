package br.dutrajy.designpatterns.composite.antipattern;

import java.util.ArrayList;
import java.util.List;

public class TaskAntiPattern {
    private String description;
    private boolean done;
    private boolean hasSubTasks;
    private List<TaskAntiPattern> subTasks;

    public TaskAntiPattern(String description, boolean hasSubTasks) {
        this.description = description;
        this.hasSubTasks = hasSubTasks;

        this.done = false;

        if (this.hasSubTasks) {
            this.subTasks = new ArrayList<>();
        }
    }

    public String getDescription() {
        return description;
    }

    public boolean hasSubTasks() {
        return hasSubTasks;
    }

    public boolean isDone() {
        if (hasSubTasks) {
            for (TaskAntiPattern task : subTasks) {
                if (!task.isDone()) {
                    return false;
                }
            }
            this.done = true;
        }
        return this.done;
    }

    public List<TaskAntiPattern> getSubtasks() {
        return subTasks;
    }

    public void addSubTask(TaskAntiPattern task) {
        subTasks.add(task);
    }

    public void execute() {
        if (hasSubTasks) {
            for (TaskAntiPattern task : subTasks) {
                task.execute();
            }
        }
        this.done = true;
    }
}
