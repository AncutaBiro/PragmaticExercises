package org.fasttrackit.Functions;

import org.fasttrackit.utils.ScannerUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import static java.util.Arrays.sort;

public class AnagramChecker {


    public static void main(String[] args) {

        String firstWord;
        String secondWord;

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.println("Enter the first string: ");
        firstWord = ScannerUtils.nextLine();

        System.out.println("Enter the second string: ");
        secondWord = ScannerUtils.nextLine();

        if (isAnagram(firstWord, secondWord)) {
            System.out.println("\""+firstWord+ "\"" + " and " + "\""+secondWord+"\""+ " are anagrams.");
        }
        else System.out.println("The two strings are not anagrams.");
    }

    public static boolean isAnagram (String firstWord, String secondWord) {
        int length1 = firstWord.length();
        char [] arrayFirstWord = firstWord.toCharArray();

        int length2 = secondWord.length();
        char [] arraySecondWord = secondWord.toCharArray();

        if (length1 != length2){
            return false; }

            Arrays.sort (arrayFirstWord);
            Arrays.sort (arraySecondWord);

            for (int i=0; i < arrayFirstWord.length; i++) {
                if (!Arrays.equals(arrayFirstWord, arraySecondWord)) {
                    return false;
                }
            } return true;

        }
    }



