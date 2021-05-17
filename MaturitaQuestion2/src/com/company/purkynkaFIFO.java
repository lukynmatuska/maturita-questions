package com.company;

import java.lang.reflect.Array;

public class purkynkaFIFO {
    private int[] pole;
    private int pozicePoslednihoPrvecku = -1;

    public purkynkaFIFO(int velikostPole) {
        this.pole = new int[velikostPole];
    }

    public void pridaniPrceku(int prcek){
        this.pole[++pozicePoslednihoPrvecku] = prcek;
    }

    public void odebrani(){
        this.pole[0] = 0;
        for (int i = 1; i < this.pole.length; i++) {
            this.pole[i-1] = this.pole[i];
        }
    }

    public String toString(){
        String result = "[";
        for (int i = 0; i < this.pole.length; i++) {
            result += this.pole[i] + ", ";
        }
        result += "]";
        return result;
    }
}
