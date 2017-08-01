package com.greetings.seconduser;
import com.greetings.user.*;
import com.greetings.Greetings;


public class SecondUser {
    public static void main(String[] args) {

        Greetings greetings = new User().buildGreetings();
        System.out.println(greetings.greetUser("Second User"));
    }
}
