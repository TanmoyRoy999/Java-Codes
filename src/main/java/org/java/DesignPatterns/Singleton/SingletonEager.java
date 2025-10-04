package org.java.DesignPatterns.Singleton;

// Singleton Eager Initialization
public class SingletonEager {

    private static SingletonEager singletonEager=new SingletonEager();

    /**
        Since we are already initialising singletonEager during instance declaration, default constructor won't
        create new objects everytime. So we can keep it and not make it private.
     **/
//    private SingletonEager(){}

    public static SingletonEager getSingletonEager() {
        return singletonEager;
    }
}
