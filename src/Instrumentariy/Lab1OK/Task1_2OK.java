package Instrumentariy.Lab1OK;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  Z = ( M / P - L1 * P ) / M * L1 ; где  P =  M^2 + L1^2 - L2^2 ;
 *  Y = ( L2 * P^2 * M  ) / P ;
 */

public class Task1_2OK {
    public static void main (String[] args) throws Exception{
        System.out.println("Введите значения M, L1, L2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstM = reader.readLine();
        String firstL1 = reader.readLine();
        String firstL2 = reader.readLine();
        double M = Double.parseDouble(firstM);
        double L1 = Double.parseDouble(firstL1);
        double L2 = Double.parseDouble(firstL2);
        double P = Math.pow(M,2) + Math.pow(L1,2) - Math.pow(L2,2);
        double Z = (M / P - L1 * P) / M * L1;
        double Y = (L2 * Math.pow(P,2) * M) / P;
        double q = Math.pow(5, 2);
        System.out.println("P= " + P);
        System.out.println("Z= " + Z);
        System.out.println("Y= " + Y);
    }
}
