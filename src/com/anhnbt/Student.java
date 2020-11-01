/**
 * Created by IntelliJ IDEA.
 * Author: AnhNBT (anhnbt.it@gmail.com)
 * Date: 31/10/2020 16:54
 */
package com.anhnbt;

public class Student extends Person {
    private static int nextId = 1;
    private int id;

    public Student() {
        this("", "");
    }

    public Student(String name, String address) {
        super(name, address);
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", " + super.toString() +
                '}';
    }
}
