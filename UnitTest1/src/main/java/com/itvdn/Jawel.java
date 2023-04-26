package com.itvdn;

import java.util.Scanner;
public class Jawel {
    private int weight;
    private    int cost;
    public void Init(int weight1, int cost1)
    {
        weight = weight1;
        cost = cost1;
    }
    void Read()
    {
        Scanner imp=new Scanner(System.in);
        System.out.printf("Введите вес изделия:");
        weight =imp.nextInt();
        System.out.printf("Введите цену изделия:");
        cost =imp.nextInt();

    }
    void Display()
    {
        System.out.printf("Вес изделия = %d\nЦена изделия за грамм = %d \n", weight, cost);
    }
    int jawel_cost()
    {
        return  weight * cost;
    }
}
