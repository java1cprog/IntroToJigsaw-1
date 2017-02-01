package com.greetings.user;

import com.greetings.Greetings;
import com.greetings.internal.*;

public class User {
    public static void main(String[] args) {

        Greetings greetings = new Greetings();
        System.out.println(greetings.greetUser("User1"));

        MyHelper provider = new MyHelper();
        System.out.println(provider);

    }
}
