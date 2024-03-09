package org.java.OtherConcepts;

public class StaticKeyword {

    public static void staticKeyword() {
        Dog dog = new Dog();
        System.out.println(dog.breed);  // not recommended to access static var through reference var
        System.out.println(Dog.breed);  // recommended
//        System.out.println(dog.getBreed());
//        System.out.println(Dog.getBreed());
        dog.printBreed();
        dog.staticPrintBreed();  // not recommended to access static methods through reference vars
        Dog.staticPrintBreed();  // recommended
    }
}

class Dog {
    static String breed = "Indie";
    String name;

    public void printBreed(){
        System.out.println("Breed is: "+breed);
        staticPrintBreed(); // no error, static methods/vars can be accessed from non static context, but not vice versa
    }
    public static void staticPrintBreed(){
        System.out.println("Static Breed is: "+breed);
//        printBreed(); // error bcoz can't access non static methods or variables from static methods/context
    }

//    public static String getBreed() {
//        return breed;
//    }

//    public static void setBreed(String breed) {
//        Dog.breed = breed;
//    }
}
