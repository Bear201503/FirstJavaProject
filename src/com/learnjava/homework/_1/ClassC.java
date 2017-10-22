package com.learnjava.homework._1;

public class ClassC {
    public void ClassC() {
    }

    public void methodc() {
        System.out.println("methodc");
    }
    private void methodc2() {
        System.out.println("methodc2");
    }
    public void methodc1() {
        System.out.println("methodc1");
    }
    public void methodc3() {
        System.out.println("methodc3");
    }

    public static void main(String[] args) {
        ClassD esha = new ClassD();
        esha.methodd();
        esha.methodd1();

        ClassD esha1 = new ClassD();
        esha1.methodd1();
        esha1.methodd();

        ClassC esha2 = new ClassC();
        esha2.methodc();
        esha2.methodc1();

        ClassC esha3 = new ClassC();
        esha3.methodc2();
        esha3.methodc2();


    }



}


