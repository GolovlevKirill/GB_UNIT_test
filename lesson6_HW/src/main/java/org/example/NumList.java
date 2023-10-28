package org.example;

import java.util.ArrayList;
import java.util.List;

public class NumList {
    public Double averageNum(List<Integer> list) {
        Double result = 0.0;
        for (int i = 0; i < list.size(); i++) {
            result = result + list.get(i);
        }
        result = result / list.size();
        return result;
    }

    public String comparisonsList(Double averageNumList1, Double averageNumList2) {
        if(averageNumList1 > averageNumList2){
            return "Первый список имеет большее среднее значение";
        } else if (averageNumList1 < averageNumList2) {
            return "Второй список имеет большее среднее значение";
        } else return "Средние значения равны";
    }
}
