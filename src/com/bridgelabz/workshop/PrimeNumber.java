package com.bridgelabz.workshop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) ;
        if (num % 2 == 0) {
            System.out.println("The given number is Prime Number");
        } else {
            System.out.println("The given number is not Prime Number");
        }
    }
}
