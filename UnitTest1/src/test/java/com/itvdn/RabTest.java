package com.itvdn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RabTest {

    @Test
    void proverka() {

        Rab rab = new Rab();
        rab.Init(1,2,3,4);
        int actual = rab.Proverka();
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void proverka2() {
        Rab rab = new Rab();
        rab.Init(1,2,3,3);
        int actual = rab.Proverka();
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void proverka3() {
        Rab rab = new Rab();
        rab.Init(1,2,3,-1);
        int actual = rab.Proverka();
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void proverka4() {
        Rab rab = new Rab();
        rab.Init1();
        assertEquals(0,rab.x);
        assertEquals(0,rab.y);
        assertEquals(0,rab.xR);
        assertEquals(0,rab.yR);
    }

    @Test
    void proverka5() {
        Rab rab = new Rab();
        rab.Init(1,2,3,3);
        rab.Proverka2();
        assertEquals(5,rab.S);
    }

    @Test
    void proverka6() {
        Rab rab = new Rab();
        rab.VIVOD();
        assertEquals("Площадь эллипса = 0.0",rab.s);
    }

    @Test
    void proverka7() {
        Rab rab = new Rab();
        rab.Init(1,2,3,4);
        assertEquals(1,rab.x);
        assertEquals(2,rab.y);
        assertEquals(3,rab.xR);
        assertEquals(4,rab.yR);
    }

    @Test
    void proverka8() {
        Rab rab = new Rab();
        rab.A=10;
        rab.B=1;
        assertEquals(1,rab.Which_Bigger());
    }

    @Test
    void proverka9() {
        Rab rab = new Rab();
        rab.A=10;
        rab.B=10;
        assertEquals(2,rab.Which_Bigger());
    }

    @Test
    void proverka10() {
        Rab rab = new Rab();
        rab.A=1;
        rab.B=10;
        assertEquals(3,rab.Which_Bigger());
    }
}