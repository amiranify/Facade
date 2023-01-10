package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String x = "10"; // 2 десятичное
        String y = "101"; // 5 десятичное

        //демонстрация
        System.out.println(bins.sum(x, y));
        System.out.println(bins.mult(x, y));
        int q = Integer.parseInt(y, 2);
        int i = Integer.parseInt(x, 2);
        int resultMult = Integer.parseInt(x, 2) * Integer.parseInt(y, 2);
        System.out.println(i + " * "+ q + " = " + resultMult);

    }
}
