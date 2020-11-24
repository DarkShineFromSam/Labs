package Arhitektura.Lab4OK;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *Найти номер первого нулевого элемента массива X1,...,Xn и сумму элементов,
 *предшествующих ему.
 */

public class Task2OK {
    public static void main(String [] args) throws Exception{
        System.out.print("Введите длину массива ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int arrayLength = Integer.parseInt(num);
        int [] array = new int[arrayLength];
        int count = 0;
        int zero=0;
        for(int i = 0; i < arrayLength; i++){
            array[i] = (int)(Math.random()*arrayLength);
        }
        for (int k = 0; array[k] != 0; k++){
            count += array[k];
            zero=k+1;
        }
        for(int i: array)
            System.out.print(i + " ");

        System.out.println("\n0 элемент: "+ zero);
        System.out.println("сумма элементов до 0: "+count);
    }
}
