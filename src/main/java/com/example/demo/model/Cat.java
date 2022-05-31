package com.example.demo.model;

public class Cat extends Animal implements IAnimal {
    @Override
    public String say() {
        return "Mau";
    }
}
