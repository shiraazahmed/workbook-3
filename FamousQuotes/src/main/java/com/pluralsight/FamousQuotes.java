package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] Quotes = {
                "The only way to do great work is to love what you do",
                "Whatever you do, do it well,",
                "Life is what happens when you're busy making other plans",
                "The way to get started is to quit talking and begin doing",
                "Kuch kuch hota hai",
                "I have a dream",
                "The truth will set you free.",
                "Agar yeh tujhe pyaar karti hai toh yeh palat ki dekhegi!",
                "Live, laugh, smile",
                "The only thing we have to fear is fear itself", };



        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number 1-10");
        int number = scanner.nextInt();

        if (number >=1 & number <=10) {
            System.out.println("Quote " + number + ":" + Quotes[number - 1]);
        } else {
            System.out.println("Enter a number 1-10 to display a quote");
        }

        System.out.println("Awesome choice!");
        System.out.println("Run again to explore more quotes!");
        scanner.close();

    }
}
