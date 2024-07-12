package com.abstraction.excercises;

public abstract class Animal {
    // instance variables


    String name;
    int age;

    //create a non argument constructor and initialize name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // creating here abstract methods

    abstract void makeSound();

    abstract void move();
}
