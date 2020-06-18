package org.fasttrackit.DataStructures;

import org.fasttrackit.utils.ScannerUtils;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {

        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"};
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] spChar = {"(", "?", "=", ".", "*", "[", "~", "!", "@", "#", "$", "%", "^", "&", "*", ")", "_", "]", "*"};

        System.out.print("What's the minimum length? ");
        int passLength = ScannerUtils.nextInt();

        String[] password = new String[passLength];

        System.out.print("How many special characters? ");
        int spCharNo = ScannerUtils.nextInt();

        System.out.print("How many numbers? ");
        int numbersNo = ScannerUtils.nextInt();

        int lettersNo = passLength - spCharNo - numbersNo;

        if (numbersNo > passLength || spCharNo > passLength) {
            System.err.println("Wrong input!");
            throw new IllegalArgumentException("Wrong input!");
        }

        int lastIndex = 0;

        for (int i=0; i < lettersNo; i++) {
            int randomLetter = new Random().nextInt(letters.length);
            password[i] = letters[randomLetter];
            lastIndex = i+1;
        }

        for (int i= lastIndex; i < lettersNo + spCharNo; i++) {
            int randomSpChar= new Random().nextInt(spChar.length);
            password[i] = spChar[randomSpChar];
            lastIndex = i+1;
        }

        for (int i= lastIndex; i < numbersNo + lettersNo + spCharNo; i++) {
            int randomNumber= new Random().nextInt(numbers.length);
            password[i] = numbers[randomNumber];
        }

//        for (int i = 0; i < password.length; i++) {
//
//            int randomLetter = new Random().nextInt(letters.length);
//            password[i] = letters[randomLetter];
//            i++;
//
//            if (i < password.length) {
//                int randomSpChar = new Random().nextInt(spChar.length);
//                password[i] = spChar[randomSpChar];
//                i++; }
//
//            if (i < password.length) {
//                int randomNumber = new Random().nextInt(numbers.length);
//                password[i] = numbers[randomNumber];
//            }
//        }

        for (String s : password) {
            System.out.print(s);
        }
    }


//
//
//            int randomLetter = new Random().nextInt(letters.length);
//            password[randomPassIndex] = letters[randomLetter];
//            i++;

//            int randomSpChar = new Random().nextInt(spChar.length);
//            password[randomPassIndex] = spChar[randomSpChar];
//            int randomNumber = new Random().nextInt(numbers.length);
//            password[randomPassIndex] = numbers[randomNumber];

//            System.out.print(password[i]);
//}

}


