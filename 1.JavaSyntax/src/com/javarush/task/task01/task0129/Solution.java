package com.javarush.task.task01.task0129;

/* 
Считаем длину окружности
*/

public class Solution {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double PI = 3.14;
        double l = 2 * PI * radius;
        System.out.println(l);
    }
}