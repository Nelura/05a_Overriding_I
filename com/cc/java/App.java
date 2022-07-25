package com.cc.java;

public class App {
    

    public static void main(String[] args) {
       
        /*
         *  Instanziierung
         *  Objektbildung
         * 
         *  child = Referenzvariable
         *  to refer to --> verweisen auf ...
         *  Child = Referenztyp (Typ <-> Klasse)
         *  Child() = Aufruf des Konstruktors
         *  --> hier Default-Konstruktor aus der 
         *  --> Klasse Object
         * 
         */

        Child child = new Child();
        
        // Call()
        child.sayHello();
        child.sayHello("overloaded Method!");

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

