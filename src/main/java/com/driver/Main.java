package com.driver;

public class Main {
    public static void main(String[] args) {
//        RWOnly rw=new RWOnly();
//        rw.name="Rajiv";
//        System.out.println(name);
//        java: name has private access in com.driver.RWOnly
        String s="rajiv";
        RWOnly.set(s);
        System.out.println(RWOnly.get());
    }
}