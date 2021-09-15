package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader keys = new BufferedReader(new InputStreamReader(System.in));

        String name = keys.readLine();
        String sNum = keys.readLine();
        int num_1 = Integer.parseInt(sNum);
        sNum = keys.readLine();
        int num_2 = Integer.parseInt(sNum);

        System.out.println(name + " получает " + num_1 + " через " + num_2 + " лет.");
    }
}
