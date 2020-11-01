package com.anhnbt.manager;

/**
 * Created by IntelliJ IDEA.
 * Author: AnhNBT (anhnbt.it@gmail.com)
 * Date: 31/10/2020 17:50
 */
public interface IManager<T> {
    abstract T show();
    abstract boolean add(T obj);
    abstract T remove(int index);
}
