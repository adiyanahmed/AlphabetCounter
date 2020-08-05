/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2;

import java.util.Scanner;

/**
 *
 * @author Adiyan
 */
public class PC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //adiyan ahmed
        Scanner keyboard = new Scanner(System.in);
        System.out.println("pls enter sentence boi");
        String sentence = keyboard.nextLine();
        sentence = sentence.toUpperCase();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] numOfAlphabet = new int[26];
        int length = (sentence.length()) - 1;       
        String end = "";

        for (int alphabetCount = 0; alphabetCount <= 25; alphabetCount++) {

            for (int sentenceCount = 0; sentenceCount <= length; sentenceCount++) {
                
                if (alphabet.charAt(alphabetCount) == sentence.charAt(sentenceCount)) {
                    numOfAlphabet[alphabetCount]++;
                }
                
            }

            if (numOfAlphabet[alphabetCount] >= 1) {
                String str = (String.valueOf(alphabet.charAt(alphabetCount)));

                String letterCount = str + "-" + (numOfAlphabet[alphabetCount]);

                end = end + letterCount + ":";
            }

        }
        System.out.println(end);
    }
}
