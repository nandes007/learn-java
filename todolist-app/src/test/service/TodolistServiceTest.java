package test.service;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;

public class TodolistServiceTest {
    public static void main(String[] args) {
        testRemoveTodolist();
    }

    public static void testShowTodolist() {
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        todolistRepository.data[0] = new Todolist("Learn Java Basic");
        todolistRepository.data[1] = new Todolist("Learn Java OOP");
        todolistRepository.data[2] = new Todolist("Learn Java Standard classes");
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.showTodolist();
    }

    public static void testAddTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addTodolist("Learn Java Basic");
        todolistService.addTodolist("Learn Java OOP");
        todolistService.addTodolist("Learn Java Standard Classes");

        todolistService.showTodolist();
    }

    public static void testRemoveTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addTodolist("Learn Java Basic");
        todolistService.addTodolist("Learn Java OOP");
        todolistService.addTodolist("Learn Java Standard Classes");

        todolistService.showTodolist();

        todolistService.removeTodolist(5);
        todolistService.removeTodolist(2);
        todolistService.showTodolist();
        todolistService.removeTodolist(2);
        todolistService.showTodolist();
        todolistService.removeTodolist(2);
        todolistService.showTodolist();
        todolistService.removeTodolist(1);
        todolistService.showTodolist();
    }
}
