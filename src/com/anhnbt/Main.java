package com.anhnbt;

import com.anhnbt.common.Menu;

import java.util.Scanner;

public class Main {
    public static final int exitProgram = 0;
    public static final int addStudent = 1;
    public static final int editStudent = 2;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            /*
             * Initialize
             */
            Menu menu = new Menu(scanner);
            int choice;

            do {
                /*
                 * Show Menu Header
                 */
                menu.showHeader();

                choice = scanner.nextInt();
                switch (choice) {
                    case exitProgram:
                        System.out.println("Exit...");
                        break;
                    case addStudent:
                        System.out.println("AddStudent!");
                        break;
                    case editStudent:
                        System.out.println("Your choice One");
                        break;
                    default:
                        System.out.println("No choice!");
                }
            } while (choice != 0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
