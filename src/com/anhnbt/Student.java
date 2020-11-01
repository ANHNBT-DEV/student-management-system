/**
 * Created by IntelliJ IDEA.
 * Author: AnhNBT (anhnbt.it@gmail.com)
 * Date: 31/10/2020 16:54
 */
package com.anhnbt;

public class Student extends Person {
    private static int nextId = 1;
    private int id;
    private String email;

    public Student() {
        this("", "", "");
    }

    public Student(String name, String address, String email) {
        super(name, address);
        this.id = nextId;
        this.email = email;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", " + super.toString() +
                '}';
    }
}
