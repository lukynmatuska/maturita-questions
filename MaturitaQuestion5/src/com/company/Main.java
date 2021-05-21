package com.company;

public class Main {

    public static double mocnina(int zaklad, int mocnitel) {
        float res = zaklad;
        for (int i = 1; i < mocnitel; i++) {
            res *= zaklad;
        }
        return res;
    }

    public static void main(String[] args) {
	    SuperTrida st = new SuperTrida();
        System.out.println("Instancni metoda:");
        System.out.println(st.mocnina(2, 2));
        System.out.println(st.mocnina(5, 2));
        System.out.println(st.mocnina(3, 3));
        System.out.println("Staticka neinstancni metoda:");
        System.out.println(mocnina(3, 3));
        System.out.println(mocnina(2, 2));
        System.out.println(mocnina(5, 2));
    }
}
