
package Arhitektura.Lab1OK;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *Создать программу, вычисляющую площадь прямоугольника (S) по формуле S = АВ.
 */
public class Task1OK {
    public static void main (String[] args) throws Exception{
        System.out.println("Введите длины сторон.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String side1 = reader.readLine();
        String side2 = reader.readLine();
        int a = Integer.parseInt(side1);
        int b = Integer.parseInt(side2);
        int square = a * b;
        System.out.println("Площадь прямоугольника равна: " + square + ".");
    }
}


