package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes = {
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
        while (true) {
            System.out.println("\nChoose a number 1-10 to receive a quote");

            try {
                int number = scanner.nextInt();

                if (number >= 1 & number <= 10) {
                    System.out.println("Quote " + number + ": " + quotes[number - 1]);
                } else {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            } catch (Exception e) {
                System.out.println("Enter a range 1-10 ONLY!");
                scanner.nextLine();
                scanner.close();
            }

        }

    }
}
