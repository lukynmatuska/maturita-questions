package com.company;

public class SuperTrida {

    public float mocnina(int zaklad, int mocnitel) {
        float res = zaklad;
        for (int i = 1; i < mocnitel; i++) {
            res *= zaklad;
        }
        return res;
    }
}
