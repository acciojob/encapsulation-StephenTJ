package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly obj=new RWOnly();
        // Cannot access private members
        // System.out.println(obj.name);
        obj.setter("Jose");
        System.out.println(obj.getter());
    }

  
}