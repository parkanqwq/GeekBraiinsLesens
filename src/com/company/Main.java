package com.company;

import java.util.Arrays;

public class Main {

    public static int[] a = {2, 2, 2, 1, 2, 2, 10, 1}; //для 6 задания
    public static int n = -2; //для 7 задания
    public static int[] arr = {1, 2, 3, 4}; //для 7 задания

    public static void main(String[] args) {

        System.out.println();
        task1();
        task2();
        task3();
        task4();
        task5();
        System.out.println("Массив " + Arrays.toString(a) + " возвращает - " + task6(a));
        task7(arr, n);
    }

    public static void task1(){

        int[] i = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1");
        System.out.println("был массив " + Arrays.toString(i));
        for (int j = 0; j < i.length; j++) {
            if (i[j] == 1) i[j] = 0;
            else i[j] = 1;
        }
        System.out.println("стал массив " + Arrays.toString(i));
    }

    public static void task2(){

        System.out.println();
        System.out.println("Задание 2");
        int[] i = new int[8];
        for (int j = 0 , mas = 0; j < i.length; j++, mas += 3) {
            if (j == 0) i[j] = 0;
            else i[j] = mas;
        }
        System.out.println(Arrays.toString(i));
    }

    public static void task3(){

        System.out.println();
        System.out.println("Задание 3");
        int[] i = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Был массив" + Arrays.toString(i));
        for (int j = 0; j < i.length; j++) {
            if (i[j] < 6) i[j] = i[j]*2;
        }
        System.out.println("Стал массив" + Arrays.toString(i));
    }

    public static void task4(){

        System.out.println();
        System.out.println("Задание 4");
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0, x = a[i].length; j < a[i].length; j++, x--) {
                if (i == j || i == x - 1) a[i][j] = 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void task5(){

        System.out.println();
        System.out.println("Задание 5");
        int[] a = {3, 7, 5, 10, 2, 18, 6};
        int min = a[0];
        int max =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        System.out.println("Взяли массив " + Arrays.toString(a) + "\n" + "Где минимальное значение " + min + ". А максимально " + max);
    }

    public static boolean task6(int[] arr){
        System.out.println();
        System.out.println("Задание 6");
        int left = arr[0];
        int right = arr[arr.length-1];
        for (int i = 0 ,r = 1, l = 0; i < arr.length-2; i++) {
            if (left > right){
                r++;
                right += arr[arr.length-r];
            } else {
                l++;
                left += arr[l];
            }
        }
        if (left == right) return true;
        else return false;
    }

    public static void task7(int[] arr, int n){
        System.out.println();
        System.out.println("Задание 7");
        int save;
        if (n > 0) {
            System.out.println("Был массив " + Arrays.toString(arr) + " и мы его сдвинули в право на "
                    + n + " элемента(ов)");
            for (int r = 0; r < n; r++) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr.length - i > 1) {
                        save = arr[i + 1];
                        arr[i + 1] = arr[0];
                        arr[0] = save;
                    }
                }
            }
        } else {
            int s = n + -n*2;
            System.out.println("Был массив " + Arrays.toString(arr) + " и мы его сдвинули в лево на "
                    + s + " элемента(ов)");
            for (int r = 0; r < s; r++) {
                for (int i = 1; i < arr.length; i++) {
                   save = arr[arr.length-i];
                   arr[arr.length-i] = arr[0];
                   arr[0] = save;
                }
            }
        }
        System.out.println("Получился новый массив " + Arrays.toString(arr));
    }
}
