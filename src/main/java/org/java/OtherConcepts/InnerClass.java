package org.java.OtherConcepts;

import org.java.POJOs.Print;
import org.java.POJOs.Van;

public class InnerClass {
    int j;
    int k=j++;

    public void innerClass(){

        // Member inner class
        Van van =new Van(3425);
        Van.Engine vanEngine=van.new Engine(456);
        vanEngine.start();
        vanEngine.stop();

        // Static nested class
        Van.SoundSystem vanSoundSys=new Van.SoundSystem("Sony");
        vanSoundSys.printSoundInfo();

        // Anonymous inner class
        int i=1;
//        i++;
        /** If we do i++ here, then we can't use i in the below inner class (even for printing without changing it), since it's not effectively final anymore.
         * We can only use final or effectively final local external variables within inner class or lambda, and only display them there
         **/
        Print print=new Print() {
            int random=99;
            @Override
            public void print() {
                van.setRegNo(98); // no error
//                i++; // compiler error, you can't change value of local external variable within inner class or lambda.
                random++;
                System.out.println("Hi, I am info method of anonymous inner class!");
                System.out.println("Random: "+random+", i: "+i);
                /** here you can use i since it's effectively final. But if you uncomment the i++ line above,
                 * then it's no more effectively final, and compiler error will occcur in this line
                 **/
            }

            @Override
            public void info() {
                System.out.println("Hi, I am info method of anonymous inner class!");
            }
        };
        // You van implement more than 1 interface methods in anonymous inner class
        print.print();
        print.info();
        System.out.println("van regNo: "+van.getRegNo());

        // Local inner class
        class LocalInnerClass{
            int localVar;
            void info(){
                System.out.println("Hi, I am info method of local inner class!");
//                System.out.println("Incremented i value: "+(++i)); // Can't use non final local external vars within inner class
                System.out.println("Incremented j value: "+(++j)); // But we can use or change instance external vars within any inner class
            }
        }
        LocalInnerClass lic=new LocalInnerClass();
        lic.info();

        /** IMPORTANT NOTE:
         * We can't use local external variables (like i) within an inner class, unless they are final or effectively final
         * But we can use or modify values of instance external variables (like j) within an inner class.
         */

    }

}
