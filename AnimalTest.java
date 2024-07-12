package com.abstraction.excercises;

public class AnimalTest {
    public static void main(String[] args) {

// creating instances of dog and bird

        Animal dog = new Dog("bull", 15);
        Animal bird = new Bird("crow", 12);

//calling the make sound and move methods
        dog.makeSound();
        dog.move();

        bird.makeSound();
        bird.move();

    }
}