package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //odd numbers

        for (int i=1; i<=20; i++){
            if (i%2!=0)
                System.out.println(i);
        }

        //even numbers

        for (int i=1; i<=20; i++){
            if (i%2==0)
                System.out.println(i);
        }


    }
}







