/*
Напишите программу, где пользователь вводит данные с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
*/

package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы: ");
        int line = in.nextInt(); //количество строк массива

        System.out.println("Введите количество столбцов матрицы: ");
        int column = in.nextInt(); //количество столбцов массива

        int[][] myArrayMatrix = new int[line][column]; //объявить двумерный массив

        //заполнить двумерный массив построчно
        int count = myArrayMatrix.length*myArrayMatrix[0].length;
        for (int l=0;l<myArrayMatrix.length;l++){
            for (int i=0;i<myArrayMatrix[0].length;i++) {
                System.out.println("Введите значение " + i + " элемента для " + l + " строки: ");
                myArrayMatrix[l][i] = in.nextInt()*3;
            }
        }

        //вывести первую строку массива
        System.out.print("Первая строка матрицы, где каждое число увеличено в 3 раза: ");
        for (int i=0;i<myArrayMatrix[0].length;i++) {
            System.out.print(myArrayMatrix[0][i]+" ");
        }
    }
}