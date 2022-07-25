package com.cc.java;

public class Parent extends GrandParent{

    // Methode sayHello()
    public void sayHello() {
        System.out.println("Hello from Parent!");
    }

    // überladene Methode
    public void sayHello(String str) {
        System.out.println("Hello from " + str);
    }




}
