package com.abstraction.excercises;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " dog was making sound");
    }

    @Override
    void move() {
        System.out.println(name + " dog was moving");

    }
}