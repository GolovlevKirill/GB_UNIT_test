package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Создание 2х списков чисел:
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        //Добавление чисел в списки
        list1.add(13);
        list1.add(15);
        list1.add(75);
        list1.add(14);
        list1.add(125);

        list2.add(52);
        list2.add(352);
        list2.add(25);
        list2.add(24234);

        //подсчет среднее значения в каждом списке
        NumList numList = new NumList();
        Double averageNumList1 = numList.averageNum(list1);
        Double averageNumList2 = numList.averageNum(list2);

        System.out.println(averageNumList1);
        System.out.println(averageNumList2);

        String result = numList.comparisonsList(averageNumList1, averageNumList2);
        System.out.println(result);
    }

//    Задание 1. Создайте программу на Python или Java, которая принимает два списка
//    чисел и выполняет следующие действия:
//    a. Рассчитывает среднее значение каждого списка.
//    b. Сравнивает эти средние значения и выводит соответствующее сообщение:
//            - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
//            - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
//            - ""Средние значения равны"", если средние значения списков равны.
//
}