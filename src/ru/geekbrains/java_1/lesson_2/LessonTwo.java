package ru.geekbrains.java_1.lesson_2;
import java.util.Arrays;

public class LessonTwo {

//  Задать целочисленный массив, состоящий из элементов 0 и 1.
//  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]
//  Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    private static int[] replacesValueArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        return arr;
    }

//    Задать пустой целочисленный массив размером 8.
//    Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
    private static int[] fillsArray(int[] arr2) {
        for (int i = 0, j = -2;  i < arr2.length; ++i) {
            arr2 [i] = j += 3;
        }
        return arr2;
    }

 //    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
//    написать метод, принимающий на вход массив  и умножающий числа меньше 6 на 2;
    private static int[] multipliesNum(int[] arr3) {
        for (int i = 0; i < arr3.length; ++i) {
            if (arr3[i] < 6) arr3[i] *= 2;
        }
        return arr3;
    }

//    Задать одномерный массив.
//    Написать методы поиска в нём минимального и максимального элемента;
    private static void searchMinMax(int[] arr4) {
        int min = arr4[0]; int max = arr4[0];
        for (int i = 0; i < arr4.length; ++i) {
            if (max < arr4[i]) max = arr4[i];
            else if (min > arr4[i]) min = arr4[i];
        }
        System.out.println(min + " " + max);
    }


    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        replacesValueArr(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[8];
        fillsArray(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multipliesNum(arr3);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = {5, 10, 3, 15,55};
        searchMinMax(arr4);
    }
}