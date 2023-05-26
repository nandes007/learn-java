package view;

import service.TodolistService;
import util.InputUtil;

public class TodolistView {
    private TodolistService todolistService;
    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }
    public void showTodolist() {
        while (true) {
            todolistService.showTodolist();

            System.out.println("MENU : ");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("x. Exit");

            var input = InputUtil.input("Choose Number");

            if (input.equals("1")) {
                addTodolist();
            } else if (input.equals("2")) {
                removeTodolist();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Choice doesn't exist");
            }
        }
    }

    public void addTodolist() {
        System.out.println("ADD TODOLIST");

        var todo = InputUtil.input("Todo (x to cancel)");

        if (todo.equals("x")) {
            // Cancel
        } else {
            todolistService.addTodolist(todo);
        }
    }

    public void removeTodolist() {
        System.out.println("DELETE TODOLIST");

        var number = InputUtil.input("Number to remove (x to cancel)");

        if (number.equals("x")) {
            // Cancel
        } else {
            todolistService.removeTodolist(Integer.valueOf(number));
        }
    }
}
