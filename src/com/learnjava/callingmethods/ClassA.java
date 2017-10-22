package com.learnjava.callingmethods;

public class ClassA {

    public void methodA(){
        System.out.println("methodA");

    }
     public void method1(){
         System.out.println("method1");
     }
     public void method2(){
         System.out.println("method2");
     }
    private static void main(String [] args){

        ClassB esha = new ClassB();
        esha.methodB();

        esha.methodB1();

        ClassB esha1 = new ClassB();
        esha1.methodB1();
        esha1.methodB();

        ClassA esha2 = new ClassA();
        esha2.method2();
        esha2.method1();
        esha2.methodA();

        
    }


}
