package ru.javamentor.preproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        
        for (int i = 0; i < 2; i++) {
            AnimalsCage animalsCage = context.getBean(AnimalsCage.class);
            animalsCage.getAnimalSay();
        }
    }
}
