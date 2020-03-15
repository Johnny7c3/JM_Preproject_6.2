package ru.javamentor.preproject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    
    private Animal animal1;
    private Animal animal2;
    private Timer timer;
    
    public AnimalsCage(@Qualifier("cat") Animal animal1,
                       @Qualifier("dog") Animal animal2,
                       Timer timer) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.timer = timer;
    }
    
    public void getAnimalSay() {
        System.out.println(animal1.toString());
        System.out.println(timer.getTime());
        System.out.println("---------------");
        System.out.println(animal2.toString());
        System.out.println(timer.getTime());
        System.out.println();
    }
}
