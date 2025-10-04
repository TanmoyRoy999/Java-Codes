package org.java.DesignPatterns.Factory;

public class AnimalFactory {

    public static Animal create(String animal){

        switch (animal.toLowerCase()){
            case "dog": return new Doggy();
            case "cat": return new Cat();
            default: return null;
        }

    }

}
