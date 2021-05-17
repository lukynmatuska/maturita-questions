package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        purkynkaLIFO mojeSuperLIFO = new purkynkaLIFO();
        System.out.println(mojeSuperLIFO);
        mojeSuperLIFO.prdaniPrvecku(10);
        mojeSuperLIFO.prdaniPrvecku(11);
        mojeSuperLIFO.prdaniPrvecku(1);
        System.out.println(mojeSuperLIFO);
        mojeSuperLIFO.odebraniPrvecku();
        System.out.println(mojeSuperLIFO);mojeSuperLIFO.odebraniPrvecku();
        System.out.println(mojeSuperLIFO);mojeSuperLIFO.odebraniPrvecku();
        System.out.println(mojeSuperLIFO);
    }
}
