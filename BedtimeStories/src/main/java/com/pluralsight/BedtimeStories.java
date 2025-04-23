package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a story to read!");
        System.out.println("1. goldilocks.txt");
        System.out.println("2. hansel_and_gretel.txt");
        System.out.println("3. mary_had_a_little_lamb.txt");
        System.out.println("Enter the full file name to view ");

        String story = input.nextLine();

        try {
            FileInputStream fis = new FileInputStream(story);
            Scanner scanner = new Scanner(fis);

            int storyLine = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(storyLine + ": " + line);
                storyLine++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Try again we do not carry that file");
        }

    }
}

