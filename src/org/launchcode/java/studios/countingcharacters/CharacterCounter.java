package org.launchcode.java.studios.countingcharacters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        try (Scanner nameScanner = new Scanner(Paths.get(String.valueOf(input)))) {
            String line;
            HashMap<Character, Integer> charCounts = new HashMap<>();


        } catch (Exception e) {
            System.out.println("File not found! + \n" + e.getMessage());
        }

        System.out.print("Print a line:");
        String userString = input.nextLine();
    }

}
