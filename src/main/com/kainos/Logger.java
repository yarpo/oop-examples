package com.kainos;

public class Logger {
    public static void log(String txt) {
        System.out.println(txt);
        try {
            Thread.sleep(10L);
        } catch (Exception e) {
            System.out.println("ERROR with thread");
        }

    }
}
