package org.java.POJOs;

public class Van {

    private int regNo;
    private boolean isEngineOn;

    public Van(int regNo) {
        this.regNo = regNo;
        this.isEngineOn = false;
    }

    // Sound System is static nested class, and can be instantiated without any object of Van
    public static class SoundSystem{
        private String company;

        public SoundSystem(String company) {
            this.company = company;
        }

        public void printSoundInfo(){
            System.out.println("Sound system is of company "+company);
//            System.out.println("Van regNo: "+regNo); //static inner classes can't access regNo, bcoz it's a non-static instance field of Van
        }
    }

    // Engine is member inner class since, it needs to be instantiated through an object, and is a member of the containing class
    public class Engine{
        private int engineNo;

        public Engine(int engineNo) {
            this.engineNo = engineNo;
        }

        public void start(){
            if (!isEngineOn){
                isEngineOn=true;
                System.out.println("Engine started");
            } else System.out.println("Engine already running!");
        }

        public void stop(){
            if (isEngineOn){
                isEngineOn=false;
                System.out.println("Engine stopped");
            } else System.out.println("Engine already off!");
        }

        public void incrementVanRegNo(){
            System.out.println("Incremented Van regNo: "+(++regNo));
            // Member inner class can change external variable value unlike anonymous inner class
        }
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public boolean getIsEngineOn() {
        return isEngineOn;
    }

    public void setIsEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }
}
