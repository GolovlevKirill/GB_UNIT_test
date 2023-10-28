import org.example.NumList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testNumList {

    @Test
    void testAver2IsLessAver1() {
        NumList numList = new NumList();
        assertThat(numList.comparisonsList(100.0, 15.0)).isEqualTo("Первый список имеет большее среднее значение");
    }
    @Test
    void testAver1IsLessAver2() {
        NumList numList = new NumList();
        assertThat(numList.comparisonsList(10.0, 15.0)).isEqualTo("Второй список имеет большее среднее значение");
    }
    @Test
    void testAver1IsEqualAver2() {
        NumList numList = new NumList();
        assertThat(numList.comparisonsList(10.0, 10.0)).isEqualTo("Средние значения равны");
    }
    @Test
    void testFindAverNumFromList() {
        NumList numList = new NumList();
        List<Integer> list = new ArrayList<>();

        //Добавление чисел в списки
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(10);
        assertThat(numList.averageNum(list)).isEqualTo(6);
    }
}


