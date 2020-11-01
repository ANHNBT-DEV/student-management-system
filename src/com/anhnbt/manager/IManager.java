package com.anhnbt.manager;

import com.anhnbt.Student;

/**
 * Created by IntelliJ IDEA.
 * Author: AnhNBT (anhnbt.it@gmail.com)
 * Date: 31/10/2020 17:50
 */
public interface IManager<T> {
    abstract T show(int index);
    abstract boolean create(T obj);
    abstract Student remove(int index);
}
