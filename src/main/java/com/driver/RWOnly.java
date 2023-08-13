package com.driver;

public class RWOnly {
    private static String name;
    public static  void set(String cal){
        name=cal;
    }
    public static String get(){
        return name;
    }
}
