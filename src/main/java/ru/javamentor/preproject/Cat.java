package ru.javamentor.preproject;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    
    @Override
    public String toString() {
        return "Meow-Meow";
    }
}
