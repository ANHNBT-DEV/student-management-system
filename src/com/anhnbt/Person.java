/**
 * Created by IntelliJ IDEA.
 * Author: AnhNBT (anhnbt.it@gmail.com)
 * Date: 01/11/2020 11:20
 */
package com.anhnbt;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
       this.name = name;
       this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
