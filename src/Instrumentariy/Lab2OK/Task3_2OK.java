package Instrumentariy.Lab2OK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать программу, реализующую следующие функции работы с массивом строк
 * (путем ввода соответствующих команд в консоли):
 * 1.	Создание строки и добавление её строки в массив на заданную позицию i
 * (с соответствующим сдвигом всех следующих за i элементов массива).
 * 2.	Вывод всех строк массива на экран.
 * 3.	Вывод i строки массива на экран.
 * 4.	Редактирование i строки массива (добавление нового слова, замена существующего слова, удаление слова).
 * 5.	Замена слова в каждой строке массива.
 * 6.	Удаление строки из массива.
 * Задание выполнить, используя методы класса StringBuilder.
 */
public class Task3_2OK {
    public static void main(String[] args) throws IOException {
        System.out.print("Создайте строку: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentance = reader.readLine();
        StringBuilder allStrBld = new StringBuilder(sentance);
        int allStrBldLength = allStrBld.length();
        String [] word = sentance.split(" ");

        //2
        System.out.println(allStrBld.substring(0));
        for (int i=0; i < word.length; i++){

            System.out.println(i+1 +" "+ word[i]);
        }
        System.out.println("");
        //3
        System.out.print("Введите нужную строку: ");
        String sOut = reader.readLine();
        int out = Integer.parseInt(sOut);
        System.out.println(word[out]);
        //4
        System.out.println("Выберите действие:");
        System.out.println("1 - добавление нового слова");
        System.out.println("2 - замена существующего");
        System.out.println("3 - удаление слова");

        String saction = reader.readLine();
        int action = Integer.parseInt(saction);
        switch (action){
            case (1):
                System.out.print("Введите значение которое хотите добавить к "+allStrBld.substring(out-1,out) +": ");
                String addNewWord = reader.readLine();
                allStrBld.insert(out,addNewWord);
                System.out.println(allStrBld.substring(0));
                break;
            case (2):
                System.out.print("Введите значение на которое хотите заменить: ");
                String changeWord = reader.readLine();
                allStrBld.replace(out,out+1,changeWord);
                System.out.println(allStrBld.substring(0));
                break;
            case (3):
                System.out.print("Строка " + allStrBld.substring(out-1,out) + " удалена : ");
                allStrBld.delete(out-1,out);
                System.out.println(allStrBld.substring(0));
                break;
        }

        //5

        System.out.print("Введите новое слово:");
        String newSentance = reader.readLine();
        allStrBld = new StringBuilder(newSentance);
        System.out.println(allStrBld.substring(0));
    }
}
