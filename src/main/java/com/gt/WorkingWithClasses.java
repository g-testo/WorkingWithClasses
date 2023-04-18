package com.gt;

public class WorkingWithClasses {
    public static void main(String[] args){
        Person greg = new Person();
        greg.name = "Greg";
        greg.age = 21;
        greg.birthday = "04-10-1980";
        greg.hasTattoo = true;

        System.out.println(greg.name);

//        Person braynel = new Person();
//        braynel.name = "Braynel";


    }
}

class Person {
    // Properties
    String name;
    int age;
    String birthday;
    boolean hasTattoo;

    // Constructor

    // Methods
}