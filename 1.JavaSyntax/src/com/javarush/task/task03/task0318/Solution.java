package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader keys = new BufferedReader(new InputStreamReader(System.in));

        String name = keys.readLine();
        String sAge = keys.readLine();

        int iAge = Integer.parseInt(sAge);

        System.out.println(name + " захватит мир " + iAge + " лет. Му-ха-ха!");
    }
}
