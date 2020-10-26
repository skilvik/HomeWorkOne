package ru.geekbrains.java23102020.javaone;

public class FirstApp {
    public static void main(String[] args) {
        boolean lie = true;
        byte h = 1;
        short j = 5;
        int a, b, c, d = 12;
        long k = 12154;
        double e = (8.0/7.0);
        float f = 8.5F;
        char g = 64534;
        third(1, 2, 3, 4);
        fourth(10, 5);
        fifth(48);
        sixth(-58);
        seventh("Alla");
        eighth(10536);

    }
    static int third(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    static boolean fourth(int a, int b) {
        if (a+b>=20 && a+b<=10) {
            return true;
        }
        else return false;
    }
    static void fifth(int a) {
        if (a>=0) {
            System.out.println(a + " положительное");
        }
        else System.out.println(a + " отрицательное");
    }
    static boolean sixth(int a) {
        if (a<0) return true;
        else return false;
    }
    static void seventh(String s) {
        System.out.println("Привет, "+s+"!");
    }
    static void eighth(int y) {
        if (y%400!=0 || y%4!=0 && y%100==0) {
            System.out.println("Год "+y+" невисокосный!");
        }
        else System.out.println("Год "+y+" високосный!");
    }
}
