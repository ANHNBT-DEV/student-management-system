/*
  Created by IntelliJ IDEA.
  Author: AnhNBT (anhnbt.it@gmail.com)
  Date: 01/11/2020 15:35
 */
package com.anhnbt.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static boolean email(String regex) {
        Pattern pattern = Pattern.compile("^[a-z0-9.]+@([a-z0-9]+\\.){1,2}[a-z0-9]{2,6}$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean name(String regex) {
        Pattern pattern = Pattern.compile("^[\\w\\s]{2,50}$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
