import java.util.ArrayList;
import java.util.Scanner;

public class CliTodoList {
    // List to store to-do items
    private static ArrayList<String> todoList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = getChoice();

            switch (choice) {
                case 1 -> createTodo();
                case 2 -> viewTodos();
                case 3 -> editTodo();
                case 4 -> markTodo();
                case 5 -> deleteTodo();
                case 6 -> {
                    System.out.println("Exiting the application. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n--- CLI To-Do List ---");
        System.out.println("1. Create a To-Do");
        System.out.println("2. View To-Do List");
        System.out.println("3. Edit a To-Do");
        System.out.println("4. Mark a To-Do as Done");
        System.out.println("5. Delete a To-Do");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }

    private static void createTodo() {
        System.out.print("Enter the task: ");
        scanner.nextLine(); // Clear the newline
        String task = scanner.nextLine();
        todoList.add("[ ] " + task); // Default status is unmarked
        System.out.println("Task added successfully.");
    }

    private static void viewTodos() {
        if (todoList.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            System.out.println("\nYour To-Do List:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }

    private static void editTodo() {
        viewTodos();
        if (todoList.isEmpty()) return;

        System.out.print("Enter the task number to edit: ");
        int taskNumber = getChoice();

        if (taskNumber > 0 && taskNumber <= todoList.size()) {
            System.out.print("Enter the updated task: ");
            scanner.nextLine(); // Clear the newline
            String updatedTask = scanner.nextLine();
            String status = todoList.get(taskNumber - 1).substring(0, 4); // Preserve status
            todoList.set(taskNumber - 1, status + updatedTask);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void markTodo() {
        viewTodos();
        if (todoList.isEmpty()) return;

        System.out.print("Enter the task number to mark as done: ");
        int taskNumber = getChoice();

        if (taskNumber > 0 && taskNumber <= todoList.size()) {
            String task = todoList.get(taskNumber - 1);
            if (task.startsWith("[X]")) {
                System.out.println("Task is already marked as done.");
            } else {
                todoList.set(taskNumber - 1, "[X]" + task.substring(3));
                System.out.println("Task marked as done.");
            }
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void deleteTodo() {
        viewTodos();
        if (todoList.isEmpty()) return;

        System.out.print("Enter the task number to delete: ");
        int taskNumber = getChoice();

        if (taskNumber > 0 && taskNumber <= todoList.size()) {
            todoList.remove(taskNumber - 1);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
