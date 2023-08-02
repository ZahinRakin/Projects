package List;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> toDoList = new ArrayList<>();

        while (true) {
            System.out.println("To-Do List:\n" + toDoList);
            int choice;
            System.out.print("1. Add Task.\n2. Remove Task.\nchoice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            int choose;
            String task;

            switch (choice) {
                case 1:
                    System.out.print("1. Add First.\n2. Add Custom.\n3. Add Last.\nchoice: ");
                    choose = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    switch (choose) {
                        case 1:
                            System.out.print("Name the task: ");
                            task = scanner.nextLine();
                            toDoList.add(0, task);
                            break;
                        case 2:
                            System.out.print("Name the task: ");
                            task = scanner.nextLine();
                            int index;
                            System.out.print("Index: ");
                            index = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character
                            toDoList.add(index, task);
                            break;
                        case 3:
                            System.out.print("Name the task: ");
                            task = scanner.nextLine();
                            toDoList.add(task);
                            break;
                    }
                    break;

                case 2:
                    System.out.print("1. Remove First.\n2. Remove Custom.\n3. Remove Last.\nchoose: ");
                    choose = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    switch (choose) {
                        case 1:
                            if (!toDoList.isEmpty()) {
                                toDoList.remove(0);
                            }
                            break;
                        case 2:
                            int index;
                            System.out.print("Index: ");
                            index = scanner.nextInt();
                            if (index >= 0 && index < toDoList.size()) {
                                toDoList.remove(index);
                            } else {
                                System.out.println("Invalid index.");
                            }
                            break;
                        case 3:
                            if (!toDoList.isEmpty()) {
                                toDoList.remove(toDoList.size() - 1);
                            }
                            break;
                    }
                    break;
            }
        }
    }
}

