/**
 * Filename: Hangman
 * 
 * Description: Hangman game, lets a user enter a secret word, then lets another user guess letters until the word is guessed
 * 
 * Author: Gregory Sveinbjornson
 */

import java.util.Arrays;
import java.util.Scanner;


public class Hangman {
    public static void main(String[] args) {
    
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Please enter a secret word: ");
        String secretWord = scan1.next().toUpperCase();
        
        int len = secretWord.length();

        int wrongGuess = 0;
      
        System.out.print("Please guess a letter: ");
        String let = scan1.next().toUpperCase();
        char letter = let.charAt(0);

        char[] checkLetters = secretWord.toCharArray();

        char displayWord[];
        displayWord = new char[len];
        for (int index = 0; index < len; index++) {
            displayWord[index] = '*';   
        }
         
        char checkGuess[];
        checkGuess = new char[len];

        for (int i =0; i < len; i++)
        {
            checkGuess[i] = displayWord[i];

            if (letter == checkLetters[i]) {
                displayWord[i] = letter;
                System.out.print(displayWord[i]);
            }else {
                System.out.print(displayWord[i]);
            }
        }
            
        if (Arrays.equals(checkGuess, displayWord)) {
            wrongGuess++;
        }

        Scanner scan2 = new Scanner(System.in);
        while (wrongGuess < 5) {
            
            System.out.print("\nEnter 1 to guess the whole word or 2 to enter another letter: ");
            int guessType = scan2.nextInt();

            if (guessType == 2) {

                System.out.print("Please guess a letter: ");
                let = scan1.next().toUpperCase();
                letter = let.charAt(0);

                for (int j =0; j < len; j++){

                    checkGuess[j] = displayWord[j];

                    if (letter == checkLetters[j]) {
                        displayWord[j] = letter;
                        System.out.print(displayWord[j]);
                    }else {
                        System.out.print(displayWord[j]);
                    }
                }
                if (Arrays.equals(checkGuess, displayWord)) {
                    wrongGuess++;
                }

                if (wrongGuess == 5) {
                    System.out.println("You Lose.");
                    System.exit(0);
                }

            }
            if (guessType == 1) {
            
                System.out.print("Please guess the word: ");
                String wordGuess = scan1.next().toUpperCase();

                if (wordGuess.equals(secretWord)) {
                    System.out.println("Correct! You Win!");
                    System.exit(0);
                }else{
                    System.out.println("Incorrect. You Lose.");
                    System.exit(0);
                }
                
                wrongGuess = 5;
                if (wrongGuess == 5) {
                    System.out.println("You Lose.");
                    System.exit(0);
                }
            }
            
        }
        scan1.close();
        scan2.close();
    }
}

