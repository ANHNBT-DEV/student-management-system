/*
  Created by IntelliJ IDEA.
  Author: AnhNBT (anhnbt.it@gmail.com)
  Date: 31/10/2020 17:49
 */
package com.anhnbt.manager;

import com.anhnbt.Student;
import com.anhnbt.common.Validator;

import java.util.ArrayList;
import java.util.List;

public class StudentManager implements IManager<Student> {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    @Override
    public Student show(int index) {
        return students.get(index);
    }

    @Override
    public boolean create(Student student) throws NullPointerException {
        if (Validator.email(student.getEmail())) {
            return false;
        }
        if (Validator.name(student.getAddress())) {
            return false;
        }
        return students.add(student);
    }

    @Override
    public Student remove(int index) {
        return students.remove(index);
    }
}
