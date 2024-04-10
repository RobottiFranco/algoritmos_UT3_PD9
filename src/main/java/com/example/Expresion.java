package com.example;

import java.util.Stack;

public final class Expresion {

    public boolean controlCorchetes(String cadena_de_corchetes) {
        Stack p = new Stack<>();

        if (cadena_de_corchetes == null) {
            return false;
        }

        for (int i = 0; i < cadena_de_corchetes.length(); i++) {
            char c = cadena_de_corchetes.charAt(i);
            if (c == '{') {
                p.push(c);
            } else {
                if (p.isEmpty()) {
                    return false;
                }
                p.pop();
            }
        }
        return p.isEmpty();
    }

    public static void main(String[] args) {
        Expresion ex = new Expresion();
        String[] archivo = ManejadorArchivosGenerico.leerArchivo("entradas.txt");

        for (String string : archivo) {
            System.out.println(ex.controlCorchetes(string));
        }
    }
}
