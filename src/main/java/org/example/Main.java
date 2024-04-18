package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int add(int i, int j){
        return i + j;
    }

    public static int mul(int i, int j){
        return i * j * i;
    }

    public static float div(int i, int j){
        if (j == 0) {
            return 0;
        }
        return i / j;
    }
}