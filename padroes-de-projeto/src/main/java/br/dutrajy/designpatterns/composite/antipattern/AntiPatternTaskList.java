package br.dutrajy.designpatterns.composite.antipattern;

import java.util.ArrayList;
import java.util.List;

public class AntiPatternTaskList {
    private List<AntiPatternTask> tasks;
    private List<AntiPatterMultiTask> multiTasks;

    public AntiPatternTaskList() {
        this.tasks = new ArrayList<>();
        this.multiTasks = new ArrayList<>();
    }

    public void addTask(AntiPatternTask task) {
        tasks.add(task);
    }

    public void addMultiTask(AntiPatterMultiTask multiTask) {
        multiTasks.add(multiTask);
    }

    public List<AntiPatternTask> getTasks() {
        return tasks;
    }

    public List<AntiPatterMultiTask> getMultiTasks() {
        return multiTasks;
    }

    public boolean isDone() {
        for (AntiPatternTask task : tasks) {
            if (!task.isDone()) {
                return false;
            }
        }
        for (AntiPatterMultiTask multiTask : multiTasks) {
            if (!multiTask.isDone()) {
                return false;
            }
        }
        return true;
    }

    public void execute() {
        for (AntiPatternTask task : tasks) {
            task.execute();
        }
        for (AntiPatterMultiTask multiTask : multiTasks) {
            multiTask.execute();
        }
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Tarefas: ").append(isDone() ? "[DONE]" : "[TODO]").append("\n");
        for (AntiPatternTask task : tasks) {
            sb.append(task.getDescription()).append("\n");
        }
        for (AntiPatterMultiTask multiTask : multiTasks) {
            sb.append(multiTask.getDescription()).append("\n");
        }
        return sb.toString();
    }
}
