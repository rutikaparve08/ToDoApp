import java.util.ArrayList;
import java.util.Scanner;

class ToDoApp {

    static ArrayList<String> tasks = new ArrayList<>();
    static ArrayList<Boolean> status = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== TO DO LIST MENU =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter task name: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    status.add(false);
                    System.out.println("Task Added Successfully!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            String state = status.get(i) ? "Completed" : "Pending";
                            System.out.println((i + 1) + ". " + tasks.get(i) + " - " + state);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task number: ");
                    int num = sc.nextInt();
                    if (num > 0 && num <= tasks.size()) {
                        status.set(num - 1, true);
                        System.out.println("Task Completed!");
                    } else {
                        System.out.println("Invalid Number");
                    }
                    break;
// Minor update by amolk-hub
                case 4:// Updated version
                    System.out.print("Enter task number: ");
                    int del = sc.nextInt();
                    if (del > 0 && del <= tasks.size()) {
                        tasks.remove(del - 1);
                        status.remove(del - 1);
                        System.out.println("Task Deleted!");
                    } else {
                        System.out.println("Invalid Number");
                    }
                    break;

                case 5: // Updated version
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Wrong Choice");
            }
// Version 2 update
        } while (choice != 5);// Updated menu formatting by amolk-hubInitialing a Local Repository


        sc.close();
    }
}
