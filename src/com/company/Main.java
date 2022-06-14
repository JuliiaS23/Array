package com.company;

public class Main {

    public static void main(String[] args) {
        String source = "Hello World!";

        String[] words = source.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

            char[] letters = words[i].toCharArray();
            for (int j = 0; j < letters.length; j++) {
                System.out.println(letters[j]);
            }
        }
    }
}
