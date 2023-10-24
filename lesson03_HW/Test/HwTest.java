import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

public class HwTest {
//
//    *Задание 1.
//
//    Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или нечетным. (код приложен в презентации)
//

    MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @Test
    void evenOddNumberTestByEven() {
        boolean result = mainHW.evenOddNumber(10);
        Assertions.assertTrue(result);
    }

    @Test
    void evenOddNumberTestByOdd() {
        boolean result = mainHW.evenOddNumber(13);
        Assertions.assertFalse(result);
    }

    //    Задание 2.
//
//    Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в интервал (25;100). (код приложен в презентации)
//
    @Test
    void numberIntervalNumInRangeTest() {
        boolean result = mainHW.numberInInterval(44);
        Assertions.assertTrue(result);
    }
    @Test
    void numberIntervalNumOutOfRangeTest() {
        boolean result = mainHW.numberInInterval(14);
        Assertions.assertFalse(result);
    }
//    Задание 3.  (необязательное)
//
//    Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей, кроме администраторов.
//    Для этого, вам потребуется расширить класс User новым свойством, указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.
}
