package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        purkynkaFIFO superfifo = new purkynkaFIFO(10);
        System.out.println(superfifo);
        superfifo.pridaniPrceku(112);
        superfifo.pridaniPrceku(150);
        superfifo.pridaniPrceku(158);
        System.out.println(superfifo);
        superfifo.odebrani();
        System.out.println(superfifo);
    }
}
