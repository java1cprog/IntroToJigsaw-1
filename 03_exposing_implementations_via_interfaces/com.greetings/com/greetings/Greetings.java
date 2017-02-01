package com.greetings;

import com.greetings.internal.MyHelper;

public class Greetings {

    public String greetUser(String user) {
        return getHelper().concat("Hello", user);
    }

    public MyHelper getHelper() {
        return new MyHelper();
    }

}
