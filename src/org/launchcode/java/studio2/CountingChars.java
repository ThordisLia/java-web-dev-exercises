package org.launchcode.java.studio2;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class CountingChars {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
//        String quote = input.nextLine();
        StringBuilder quote = new StringBuilder();
        File hello = new File("/Users/iuliiakrisheminska/Documents/hello.txt");
        Scanner input = new Scanner(hello);

        while(input.hasNextLine()) {
            //going through the file looking for the next line, if yes then appends the string
            quote.append(input.nextLine());
        }

        char[] charactersInQuote = quote.toString().toLowerCase().toCharArray();

        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (char c : charactersInQuote) {
            if(Character.isAlphabetic(c)){
                if (characterCount.containsKey(c)) {
                 characterCount.put(c, characterCount.get(c) + 1);
                } else {
                characterCount.put(c, 1);
            }
        }

            }
        for (Map.Entry<Character, Integer> display : characterCount.entrySet()) {
            //I will get map entry (key value pair) that will be a char and int, and here's where I get it from
            System.out.println(display.getKey() + ": " + display.getValue());
        }
    }

}
