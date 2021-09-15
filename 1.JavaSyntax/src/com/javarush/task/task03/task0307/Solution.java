package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg_1 = new Zerg();
        Zerg zerg_2 = new Zerg();
        Zerg zerg_3 = new Zerg();
        Zerg zerg_4 = new Zerg();
        Zerg zerg_5 = new Zerg();
        Protoss protoss_1 = new Protoss();
        Protoss protoss_2 = new Protoss();
        Protoss protoss_3 = new Protoss();
        Terran terran_1 = new Terran();
        Terran terran_2 = new Terran();
        Terran terran_3 = new Terran();
        Terran terran_4 = new Terran();
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
