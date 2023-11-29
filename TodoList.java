package com.mycompany.todolist;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Todo List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskCompleted();
                    break;
                case 4:
                    System.out.println("Exiting Todo List. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter the task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    private static void viewTasks() {
        System.out.println("Tasks: ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    private static void markTaskCompleted() {
        System.out.print("Enter the task number you want to mark as completed: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            System.out.println("Marking task as completed: " + tasks.get(taskNumber - 1));
            tasks.remove(taskNumber - 1);
        } else {
            System.out.println("Invalid task number. Please enter a valid task number.");
        }
    }
}

