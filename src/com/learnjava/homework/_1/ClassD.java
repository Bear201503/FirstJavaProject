package com.learnjava.homework._1;

public class ClassD {
    public void ClassD() {
    }

    public void methodd() {
        System.out.println("methodd");
    }
    private void methodd2() {
        System.out.println("methodd2");
    }

    public void methodd1() {
        System.out.println("methodd1");
    }

    public static void main(String[] args) {

        ClassC esha = new ClassC();
        esha.methodc();
        esha.methodc1();

        ClassC esha1 = new ClassC();
        esha1.methodc();
        esha1.methodc1();

        ClassD esha2 = new ClassD();
        esha2.methodd();
        esha2.methodd1();

        ClassD esha3 = new ClassD();
        esha3.methodd2();
        esha3.methodd2();

    }


}




