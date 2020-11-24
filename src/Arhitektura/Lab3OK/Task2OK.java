package Arhitektura.Lab3OK;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *L = ( X2 + K + B )^2 - B^3;
 *K изменяется от 1 до 10 с шагом 1
 *B,X2-произвольно
 */

public class Task2OK {
    public static void main (String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringb = reader.readLine();
        String stringx2 = reader.readLine();
        double b = Double.parseDouble(stringb);
        double x2 = Double.parseDouble(stringx2);
        double k = 1;
        double l;
        while (k <= 10){
            l = Math.pow((x2 + k + b),2) - Math.pow(b,3);
            System.out.println(l);
            k++;
        }
    }
}
