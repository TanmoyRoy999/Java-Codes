package org.java.DesignPatterns;

import org.java.DesignPatterns.Factory.*;

public class DesignPatterns {

    public static void designPatterns() {

        // Singleton Design pattern
//        SingletonEager singletonEager1 = SingletonEager.getSingletonEager();
//        SingletonEager singletonEager2 = SingletonEager.getSingletonEager();

//        SingletonEager singletonEager1 = new SingletonEager();
//        SingletonEager singletonEager2 = new SingletonEager();
//
//        System.out.println("singletonEager1 == singletonEager2 : " + (singletonEager1 == singletonEager2));

//        SingletonLazy singletonLazy1 = SingletonLazy.getSingletonLazy();
//        SingletonLazy singletonLazy2 = SingletonLazy.getSingletonLazy();
//
//        System.out.println("singletonLazy1 == singletonLazy2 : " + (singletonLazy1 == singletonLazy2));

        // Factory Design pattern
//        AnimalFactory animalFactory=new DoggyFactory();
//        Animal doggy= AnimalFactory.create("dog");
//        doggy.makeSound();
//        AnimalFactory.create("dog").makeSound();

//        animalFactory=new CatFactory();
//        Animal cat=AnimalFactory.create("CAT");
//        cat.makeSound();
//        AnimalFactory.create("cat").makeSound();


        Engine petrolEngine = EngineFactory.create("PETROL");
        Car.startCar(petrolEngine);

        Engine dieselEngine = EngineFactory.create("DIESEL");
        Car.startCar(dieselEngine);


    }

}
