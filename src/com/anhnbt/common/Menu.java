/**
 * Created by IntelliJ IDEA.
 * Author: AnhNBT (anhnbt.it@gmail.com)
 * Date: 31/10/2020 17:25
 */
package com.anhnbt.common;

import com.anhnbt.Student;
import com.anhnbt.manager.StudentManager;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private StudentManager studentManager;

    public Menu() {}

    public Menu(Scanner scanner, StudentManager studentManager) {
        this.scanner = scanner;
        this.studentManager = studentManager;
    }

    public void showHeader() {
        System.out.println("===== MENU V1.0 =====");
        System.out.println("1. Add Student");
        System.out.println("2. ...");
        System.out.print("Enter your choice [0-Quit]: ");
    }

    public boolean addStudent() {
        System.out.println("===== THEM SINH VIEN =====");

        System.out.print("Nhap ten sinh vien: ");
        String name = scanner.nextLine();

        System.out.print("Nhap dia chi: ");
        String address = scanner.nextLine();

        System.out.print("Nhap email: ");
        String email = scanner.nextLine();

        return studentManager.create(new Student(name, address, email));
    }

    public void quit() {
        System.out.println("Quit...");
    }
}
