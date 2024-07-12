package com.abstraction.excercises;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " bird making sound");

    }

    @Override
    void move() {
        System.out.println(name + "bird was flying");

    }


}
