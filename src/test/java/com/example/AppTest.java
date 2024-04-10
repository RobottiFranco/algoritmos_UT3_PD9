package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void ExpresionTest_isTrue() {
        Expresion ex = new Expresion();
        boolean result = ex.controlCorchetes("{{{}}}");
        assertEquals(result, true);
    }

    @Test
    void ExpresionTest_isFalse() {
        Expresion ex = new Expresion();
        boolean result = ex.controlCorchetes("{{}}}");
        assertEquals(result, false);
    }

    @Test
    void ExpresionTest_isFalse_unit_case_close() {
        Expresion ex = new Expresion();
        boolean result = ex.controlCorchetes("}");
        assertEquals(result, false);
    }

    @Test
    void ExpresionTest_isFalse_unit_case_open() {
        Expresion ex = new Expresion();
        boolean result = ex.controlCorchetes("{");
        assertEquals(result, false);
    }

    @Test
    void ExpresionTest_isEmpty() {
        Expresion ex = new Expresion();
        boolean result = ex.controlCorchetes("");
        assertEquals(result, true);
    }

}
