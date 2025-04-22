package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Choose a story out of the options given");
        System.out.println("goldilocks.txt");
        System.out.println("hansel_and_gretel.txt");
        System.out.println("mary_had_a_little_lamb.txt");

        String storyName = inputScanner.nextLine();

        if (storyName.equals("goldilocks.txt") || storyName.equals("hansel_and_gretel.txt") || storyName.equals("mary_had_a_little_lamb.txt")) {
            try {
                File storyFile = new File(storyName);
                Scanner fileScanner = new Scanner(storyFile);

                int lineNumber = 1;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(lineNumber + ": " + line);
                    lineNumber++;
                }

                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Sorry, the story file could not be found.");
            }
        } else {
            System.out.println("Invalid file name. Please choose a valid story.");
        }

        inputScanner.close();
    }
}
