package edu.sdccd.cisc191;


public class InterfaceExample implements Withdrawable{

    public static void InterfaceExample(){

        System.out.println(limit);

        InterfaceExample ex = new InterfaceExample();
        ex.withdrawUpTo();
    }

    @Override
    public void withdrawUpTo() {

        System.out.println("You withdrawn $500.");
    }
}
