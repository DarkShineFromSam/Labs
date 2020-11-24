package Instrumentariy.Lab2OK;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * В данном массиве чисел C1,...,Cn поменять местами максимальный элемент с
 * последним отрицательным.
 */

public class Task1_3OK {
    public static void main (String [] args) throws Exception {
        System.out.print("Введите длину массива:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));;
        String num = reader.readLine();
        int arrayLength = Integer.parseInt(num);
        int [] array = new int [arrayLength];
        int maxIndex=0;
        int maxNum = -101;
        int lastNegIndex = 0;
        int buf = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*(200+1)-100);
            System.out.print(" "+array[i] + " ");
            if (maxNum <= array[i]){
                maxNum = array[i];
                maxIndex = i;
            }
            if(array[i] < 0){
                lastNegIndex = i;
            }
        }
        buf= array[maxIndex];
        array[maxIndex]=array[lastNegIndex];
        array[lastNegIndex]=buf;
        System.out.print("\n");
        for(int i : array){
            System.out.print(" "+i + " ");
        }
    }
}
