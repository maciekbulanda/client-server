package com.company;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Server();
        t1.start();
    }
}
