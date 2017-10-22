package com.learnjava.callingmethods;

public class ClassB {

    public void methodB(){
        System.out.println("methodB");

    }

    public void methodB1(){
        System.out.println("methodB1");
    }

    public static void main(String[] args){

        ClassA esha = new ClassA();
        esha.methodA();
        esha.method1();
        //esha.method2();

        ClassA esha1 = new ClassA();
        esha1.methodA();

        //esha1.method1();
        //esha1.method2();





    }


}


