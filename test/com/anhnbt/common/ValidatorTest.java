package com.anhnbt.common;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
  Created by IntelliJ IDEA.
  Author: AnhNBT (anhnbt.it@gmail.com)
  Date: 01/11/2020 15:44
 */
class ValidatorTest {
    @Test
    @DisplayName("anhnbt@outlook.com.vn")
    void testCaseEmailOne() {
        String regex = "anhnbt@outlook.com.vn";
        boolean actual = Validator.email(regex);
        assertTrue(actual);
    }

    @Test
    @DisplayName("son.mai@codegym.vn")
    void testCaseEmailTwo() {
        String regex = "anhnbt.it@gmail.com";
        boolean actual = Validator.email(regex);
        assertTrue(actual);
    }

    @Test
    @DisplayName("anh.vu@codegym.vn")
    void testCaseEmailThree() {
        String regex = "anh.vu@codegym.vn";
        boolean actual = Validator.email(regex);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Nguyen Ba Tuan Anh")
    void testCaseNameOne() {
        String regex = "Nguyen Ba Tuan Anh";
        boolean actual = Validator.name(regex);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Lorem Ipsum")
    void testCaseNameTwo() {
        String regex = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        boolean actual = Validator.name(regex);
        assertFalse(actual);
    }
}