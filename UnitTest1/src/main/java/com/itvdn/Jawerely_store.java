package com.itvdn;

import java.util.Scanner;
public class Jawerely_store {
    private    String name;
    private    Jawel a = new Jawel();
    private    Jawel b = new Jawel();
    private    Jawel c = new Jawel();
    private    int x;
    private    int y;
    private    int z;
    private    int accessory ;

    public void Init(String  n, int v1, int t1, int v2, int t2, int v3, int t3, int d, int e, int f, int accessory1)
    {
        name= n;
        a.Init(v1, t1);
        b.Init(v2, t2);
        c.Init(v3, t3);
        x = d;
        y = e;
        z = f;
        accessory = accessory1;
    }
    void Read()
    {
        Scanner I=new Scanner(System.in);
        System.out.printf("Введите количество изделий №1: ");
        x=I.nextInt();
        System.out.printf("Введите количество изделий №2: ");
        y=I.nextInt();
        System.out.printf("Введите количество изделий №3: ");
        z=I.nextInt();
        System.out.printf("Введите общую стоимость аксессуаров: ");
        accessory=I.nextInt();
    }
    void Display()
    {
        System.out.printf("Название магазина %s \n", name);
        System.out.printf("\nИнформация о 1 изделии:\nКоличество = %d ", x);
        a.Display();
        System.out.printf("\nИнформация о 2 изделии:\nКоличество = %d ", y);
        b.Display();
        System.out.printf("\nИнформация о 3 изделии:\nКоличество = %d ", z);
        c.Display();
        System.out.printf("Стоимость аксессуаров = %d  \n", accessory);
    }
    int summary_cost()
    {
        return a.jawel_cost()*x+ b.jawel_cost()*y+ c.jawel_cost()*z+ accessory;
    }
    Jawel most_expensive()
    {
        int z = a.jawel_cost();
        int x = b.jawel_cost();
        int w = c.jawel_cost();
        if (z > x && z > w)
        {
            return a;
        }
        if (x > w && x > z)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
}