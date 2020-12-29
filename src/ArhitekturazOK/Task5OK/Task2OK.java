package ArhitekturazOK.Task5OK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * В матрице Z[m,n] определить число положительных элементов и их сумму по столбцам.
 */

public class Task2OK {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите колличество строк: ");
        String lineQty = reader.readLine();
        System.out.println("Введите колличество столбцов: ");
        String columnQty = reader.readLine();
        int line = Integer.parseInt(lineQty);
        int column = Integer.parseInt(columnQty);
        int [][] array = new int[line][column];     //основная матрица
        int [] sum = new int[column];                 // массив суммы столбцов
        int count = 0;                              //число положительных элементов


        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random()*(200+1)-100);        //заполнение матрицы случайными числами
                System.out.print(array[i][j] + " ");                    //вывод матрицы

                if (array[i][j]>0){                                     //условие для подстчета положительного числа
                    sum[j] += array[i][j];                              // суммирование по столбцу
                    count++;                                            //счетчик положительного числа

                }
            }
            System.out.println();
        }

        System.out.println("\nКол-во положительных чисел: "+ count+"\n");
        System.out.println("Сумма положительных чисел матрицы по столбцам: " + Arrays.toString(sum));
    }
}
