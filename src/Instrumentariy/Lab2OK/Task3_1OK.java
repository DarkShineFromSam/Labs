package Instrumentariy.Lab2OK;

import java.util.*;

/**
 * Расположить слова данного предложения в порядке убывания длин.
 */

public class Task3_1OK {
    public static void main (String [] args) throws Exception{
        List<String> array = new ArrayList<>(Arrays.asList("Расположить","слова","данного","предложения","в","порядке","убывания","длин." ));
        System.out.println(array);
        array.sort(Comparator.comparingInt(String::length));
        System.out.println(array);
        Collections.reverse(array);
        System.out.println(array);
    }
}
