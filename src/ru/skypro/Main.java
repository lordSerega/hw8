package ru.skypro;

import java.sql.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void task1(int year) {

        if ((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " год является високосный!");
        } else {
            System.out.println(year + " год  не является високосный!");
        }

    }

    public static void task2(int clientDeviceYear, int clientOS) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");

            }
        } else {

            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для ANDROID по ссылке");
            } else {
                System.out.println("Установите версию приложения для ANDROID по ссылке");

            }
        }
    }

    public static void task3(int deliveryDistance) {

        byte result = 1;

        if (deliveryDistance > 20) {
            result++;

        }
        if (deliveryDistance > 60) {
            result++;
        }

        System.out.println("Потребуется дней: " + (result));

    }

    public static void task4(String str) {

        char[] letters = str.toCharArray();
        char prevChar = Character.MAX_VALUE;
        for (char letter : letters) {
            if (letter == prevChar) {
                System.out.println("Дублируется символ " + letter);
                return;
            }
            prevChar = letter;
        }
    }

    public static void task5(int[] arr) {

        int beginValue = 0;
        int endValue = arr.length-1;
        while (beginValue < endValue){
            int newValue = arr[beginValue];
            arr[beginValue++] = arr[endValue];
            arr[endValue--] = newValue;
        }
    }

    public static void main(String[] args) {

        int year = 2011;
        task1(year);

        task2(year, 1);
        task3(100);
        task4("Пппрривет");

        int[] arr = new int[]{1, 2, 3,4, 5, 6, 7};
        task5(arr);
        System.out.println(Arrays.toString(arr));


    }
}
