package org.java.DesignPatterns.Factory;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing...");
    }
}
