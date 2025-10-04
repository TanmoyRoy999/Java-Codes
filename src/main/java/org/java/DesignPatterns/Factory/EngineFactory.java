package org.java.DesignPatterns.Factory;

public class EngineFactory{

    public static Engine create(String engine){

        switch (engine.toLowerCase()){
            case "petrol": return new PetrolEngine();
            case "diesel": return new DieselEngine();
            default: return null;
        }
    }
}
