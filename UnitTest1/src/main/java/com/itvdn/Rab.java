package com.itvdn;

import java.util.Scanner;

public class Rab {
    public int x, y;
   public double xR, yR, S,A,B;
   public String s;
    //конструктор
    public void Init(int setx,int sety,double setxR,double setyR) // конструктор с параметрами
    {
       x = setx;
       y = sety;
       xR = setxR;
       yR = setyR;
    }
    //конструктор без параметров
    public void Init1() // конструктор без параметров
    {
        x = 0;
        y = 0;
        xR = 0;
        yR = 0;
    }
    public void VVOD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты центра эллипса: ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Введите длины полуосей(xR,yR) эллипса: ");
        xR = sc.nextDouble();
        yR = sc.nextDouble();
    }
    public int Proverka()
    {
        if(xR>=0 && yR >=0)
        {
            if (xR == yR)
            {
                System.out.println("Данный эллипс является окружностью");
                return 0;
            }
            else
            {
                System.out.println("Данный эллипс НЕ является окружностью");
                return 1;
            }
        }
        else
        {
            System.out.println("Вы ввели отрицательное значение длины. Площадь эллипса будет расчитана с учетом МОДУЛЯ этой длины");
            return 2;
        }
    }
    public int Which_Bigger()
    {
        if (A>B)
        {
            System.out.println("Первый эллипс больше!");
            return 1;
        }
        else if (A == B)
        {
            System.out.println("Эти эллипсы равны!");
            return 2;
        }
        else
        {
            System.out.println("Второй эллипс больше!");
            return 3;
        }
    }
    public double Proverka2()
    {
        S = yR + xR + x - y;
        return S;
    }
    public void VIVOD()
    {
        s = "Площадь эллипса = " + S;
        System.out.println(s);
    }
}