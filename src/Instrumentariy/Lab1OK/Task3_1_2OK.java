package Instrumentariy.Lab1OK;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * P = ( tn(Z1 * Z2) + M * sin(M) ) /  Z1^2 ;
 * z2 изменяется от 0,1 до 10 с шагом 0,5
 * M изменяется  от 1 до 5 с шагом 1; z1-произвольно;
 */

public class Task3_1_2OK {
    public static void main (String [] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите значение Z1.");
        String numz1 = reader.readLine();
        double z1 = Double.parseDouble(numz1);
        double p;
        double z2 = 0.1;
        double m = 1;
        for (; z2 <= 10; z2 += 0.5 ){
            p = ( Math.tan(z1 * z2) + m + Math.sin(m) ) / Math.pow(z1,2);
            m++;
            if (m > 5){
                m=1;
            }
            System.out.println(p);
        }
    }
}
