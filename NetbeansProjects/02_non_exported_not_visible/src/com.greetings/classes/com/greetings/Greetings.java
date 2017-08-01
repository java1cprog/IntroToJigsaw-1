package com.greetings;

import com.greetings.internal.MyHelper;

public class Greetings {

    public String greetUser(String user) {
        return new MyHelper().concat("Hello", user);
    }

}
