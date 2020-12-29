package ArhitekturazOK.Task5OK;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Разработать программу, которая в матрице размерности M*N  меняет
 * местами строку, содержащую элемент с  минимальным  значением  со
 * строкой, содержащей элемент с максимальным значением.
 */

public class Task1OK {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите колличество строк: ");
        String lineQty = reader.readLine();
        System.out.print("Введите колличество столбцов: ");
        String columQty = reader.readLine();
        int line = Integer.parseInt(lineQty);
        int coulumn = Integer.parseInt(columQty);
        int maxIndexI = 0;
        int minIndexI = 0;
        int max = -101;
        int min = 101;
        int [][] array = new int[line][coulumn];
        for (int i = 0; i < array.length; i++,System.out.println()){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random()*(200+1)-100);
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println("__________________\n");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] >= max){
                    max = array[i][j];
                    maxIndexI = i;
                }
            }
        }
        System.out.print(max +"-");
        System.out.println(maxIndexI);
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] <= min){
                    min = array[i][j];
                    minIndexI = i;
                }
            }
        }
        System.out.print(min +"-");
        System.out.println(minIndexI);
        if(maxIndexI != minIndexI || maxIndexI == minIndexI){
            int []bufI = array[maxIndexI];
            array[maxIndexI] = array[minIndexI];
            array[minIndexI] = bufI;

            for (int i=0;i < array.length;i++,System.out.println()){
                for (int j=0;j < array[i].length;j++){
                    System.out.print(array[i][j]+" ");
                }
            }
        }
    }
}
