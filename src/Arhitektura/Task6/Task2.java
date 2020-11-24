package Arhitektura.Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Расположить слова данного предложения в порядке убывания длин.
 */

public class Task2 {
    public static void main (String [] args) throws Exception{
        String [] text = {"Расположить","слова","данного","предложения","в","порядке","убывания","длин."};
        System.out.println(Arrays.toString(text));
        String buf;
        for (int i = 0; i < text.length-1; i++) {
            for (int k = i+1; k < text.length; k++) {
                if (text[i].length() < text[k].length()) {
                    buf = text[k];
                    text[k] = text[i];
                    text[i] = buf;
                }
            }
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < text.length-1; i ++){
                if (text[i].length()<text[i+1].length()) {
                    isSorted = false;
                    buf = text[i];
                    text[i] = text[i+1];
                    text[i+1] = buf;
                }
            }
        }
       System.out.println(Arrays.toString(text));

        System.out.println(Arrays.toString(text));


        Arrays.sort(text,Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(text));

    }
}
