package Instrumentariy.Lab1OK;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *        |   Z^2 ,     если      Z ≤ -3 ;
 *   Q =  |   Z^3 ,               Z > 3  ;
 *        |   Z-4 ,               Z = -3 .
 */

public class Task2_1OK {
    public static void main(String [] args) throws Exception {
        System.out.println("Введите число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberOne = reader.readLine();
        int num1 = Integer.parseInt(numberOne);
        if(num1 > 3) {
            System.out.println(Math.pow(num1,3));

        }else if(num1 < -3){
            System.out.println(Math.pow(num1,2));
        }
        else if (num1 > -3 && num1 < 3){
            System.out.println("Введено число в диапазоне от -3 до 3.");
        }

        switch(num1){

            case(-3):
                System.out.println(num1 -4);
                System.out.println(Math.pow(num1,2));
        }
    }
}
