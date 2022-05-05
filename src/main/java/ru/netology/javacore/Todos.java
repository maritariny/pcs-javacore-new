package ru.netology.javacore;

import java.util.*;

public class Todos {

    private List<String> todos;

    public Todos() {
        this.todos = new ArrayList<>();
    }

    public void addTask(String task) {
        todos.add(task);
    }

    public void removeTask(String task) {
        if (todos.contains(task)) {
            todos.remove(task);
        }
    }

    public String getAllTasks() {

        todos.sort(String::compareTo);

        StringBuilder sb = new StringBuilder();
        for (String todo : todos) {
            sb.append(todo);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}
