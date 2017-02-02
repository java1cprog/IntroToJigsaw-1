package com.greetings.user;

import com.greetings.Greetings;

public class User {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.greetUser("User1"));
    }

    public Greetings buildGreetings() {
        return new Greetings();
    }

}
