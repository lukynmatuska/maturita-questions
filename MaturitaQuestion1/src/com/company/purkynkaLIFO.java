package com.company;

import java.util.ArrayList;

public class purkynkaLIFO <E>{
    private ArrayList<E> ar = new ArrayList<>();
    /* public LIFO() {

    } */

    public void prdaniPrvecku(E node) {
        this.ar.add(node);
    }

    public void odebraniPrvecku() {
        this.ar.remove(this.ar.toArray().length-1);
    }

    public String toString() {
        return this.ar.toString();
    }
}
