package com.greetings.user;

import com.greetings.Greetings;
import com.greetings.Helper;

public class User {
    public static void main(String[] args) {

        Greetings greetings = new Greetings();
        System.out.println(greetings.greetUser("User1"));

        Helper provider = greetings.getHelper();
        System.out.println(provider);

    }
}
