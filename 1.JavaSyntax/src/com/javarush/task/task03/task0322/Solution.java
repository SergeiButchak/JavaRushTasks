package com.javarush.task.task03.task0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Большая и чистая
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader keys = new BufferedReader(new InputStreamReader(System.in));

        String name1 = keys.readLine();
        String name2 = keys.readLine();
        String name3 = keys.readLine();

        System.out.println(name1 + " + " + name2 + " + " + name3 +" = Чистая любовь, да-да!");
    }
}