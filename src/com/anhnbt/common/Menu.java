/**
 * Created by IntelliJ IDEA.
 * Author: AnhNBT (anhnbt.it@gmail.com)
 * Date: 31/10/2020 17:25
 */
package com.anhnbt.common;

import com.anhnbt.Student;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {}

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showHeader() {
        System.out.println("===== MENU V1.0 =====");
        System.out.println("1. Add Student");
        System.out.println("2. ...");
        System.out.print("Enter your choice [0-Exit]: ");
    }

    public Student addStudent(Student student) {
        System.out.println("===== THEM SINH VIEN =====");
        System.out.print("Nhap ten sinh vien: ");
        student.setName(scanner.nextLine());
        System.out.print("Nhap tuoi sinh vien: ");
        student.setAddress(scanner.nextLine());
        return student;
    }
}
