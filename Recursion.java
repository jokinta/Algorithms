package com.company;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(Factoriel(5));
    }
    public static int Factoriel(int num){
        if(num==0)
            return 1;
        else
            return num * Factoriel(num-1);
    }
}
