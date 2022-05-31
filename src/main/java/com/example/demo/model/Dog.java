package com.example.demo.model;

public class Dog extends Animal implements IAnimal {

    @Override
    public String say() {
        return "Gav";
    }

    @Override
    public String getName() {
        return "Dog : " + super.getName();
    }
}
