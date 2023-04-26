package com.itvdn;

public class Main {
    public static void main(String[] args) {
        int x=0, y=0;
        double xR=0, yR=0, S=0;
        String s="";
        Rab rab = new Rab();
        rab.Init1(); // обащение к конструктору
        rab.VVOD();// ввод
        rab.Proverka();// проверка
        System.out.println("Результат:");
        rab.Proverka2();// проверка 2
        rab.VIVOD();

        //работа с несколькими вводами
        Rab[] rabs = new Rab[2];
        for (int i = 0; i < 2;i++)
        {
            rabs[i] = new Rab();
            rabs[i].Init(x, y, xR, yR); // обращение к конструктору
            rabs[i].VVOD();// ввод
            rabs[i].Proverka();// проверка
            System.out.println("Результат:");
            rabs[i].Proverka2();// проверка
            rabs[i].VIVOD();
        }
    }
}

