package com.gt;

public class WorkingWithClasses {
    public static void main(String[] args){
        Person greg = new Person("Greg", 21, "04-10-1980", true, "000-00-0000");



//        greg.name = "Greg";
//        greg.age = 21;
//        greg.birthday = "04-10-1980";
//        greg.hasTattoo = true;

//        System.out.println(greg.ssn);

//        Person braynel = new Person();
//        braynel.name = "Braynel";


    }
}

class Person {
    // Properties
    private String name;
    private int age;
    private String birthday;
    private boolean hasTattoo;
    private String ssn;

    // Constructor method
    public Person(String name, int age, String birthday, boolean hasTattoo, String ssn){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.hasTattoo = hasTattoo;
        this.ssn = ssn;
    }

    // Methods- Getters and Setters
    public String getName(){
        return this.name;
    }
}