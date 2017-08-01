package com.greetings.internal;

import com.greetings.Helper;

public class MyHelper implements Helper {

    @Override
    public String concat(String op1, String op2) {
        return op1 + " " + op2;
    }

    public String concat(String op1, String op2, String op3) {
        return op1 + " " + op2 + " " + op3;
    }

}
