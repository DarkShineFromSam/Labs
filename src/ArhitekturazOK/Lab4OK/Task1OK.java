package ArhitekturazOK.Lab4OK;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * В массиве D1...Dn найти сумму элементов, расположенных на четных местах.
 */
public class Task1OK {
    public static void main(String [] args) throws Exception{
        System.out.print("Введите длину массива ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int arrayLength = Integer.parseInt(num);
        int [] array = new int[arrayLength];
        int sumEven = 0;
        for(int i = 0; i < arrayLength; i++){
            array[i] = (int)(Math.random()*(200+1)-100);
            if (i%2 ==0){
                sumEven += array[i];
            }
        }
        for(int i: array)
            System.out.print(i + " ");
        System.out.print("\nCумма элементов на четных позициях = " + sumEven);

    }
}
