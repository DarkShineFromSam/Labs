package Arhitektura.Lab2OK;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *Определить, попадает ли данное число в какой-либо из двух заданных числовых интервалов.
 */

public class Task2OK {
    public static void main(String[] args) throws Exception{
        int a = 50;
        int b = 88;
        System.out.print("Введите число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int num = Integer.parseInt(number);

        if (num >= 50 && num <= 88){
            System.out.println("Число " + num + " входит в диапазон от " + a + " до " + b + ".");
        }

        else{
            System.out.println("Число " + num + " не входит в диапазон от " + a + " до " + b + ".");
        }
    }
}
