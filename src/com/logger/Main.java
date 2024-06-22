package com.logger;


public class Main {


    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        Logger l3 = Logger.getInstance();
        l1.log("Log1");
        l2.log("Log2");
        l3.log("Log3");
        l3.log("Log3again");
        l2.log("Log2again");
    }

}
