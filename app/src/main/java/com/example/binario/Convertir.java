package com.example.binario;

public class Convertir {


    public static long convertir(String binario) {

        long decimal = 0;
        int posicion = 0;

        for (int x = binario.length() - 1; x >= 0; x--) {

            short digito = 1;
            if (binario.charAt(x) == '0') {
                digito = 0;
            }
            double multiplicador = Math.pow(2, posicion);
            decimal += digito * multiplicador;
            posicion++;
        }
        return decimal;
    }
}
