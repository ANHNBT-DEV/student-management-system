/*
  Created by IntelliJ IDEA.
  Author: AnhNBT (anhnbt.it@gmail.com)
  Date: 31/10/2020 17:49
 */
package com.anhnbt.manager;

import com.anhnbt.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager implements IManager<Student> {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    @Override
    public Student show() {
        return null;
    }

    @Override
    public boolean add(Student student) throws NullPointerException {
        students.add(student);
        return true;
    }

    @Override
    public Student remove(int index) {
        return null;
    }
}
