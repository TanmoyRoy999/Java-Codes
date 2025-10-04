package org.java.DesignPatterns.Factory;

public class Doggy implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Doggy is barking...");
    }
}
