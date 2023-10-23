package seminars.second.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.second.hw.Car;
import seminars.second.hw.Motorcycle;
import seminars.second.hw.Vehicle;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//    *Задание 1.
//    Проект Vehicle. Написать следующие тесты с использованием JUnit5:
//
//            - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
//
//            - Проверить, что объект Car создается с 4-мя колесами.
//
//            - Проверить, что объект Motorcycle создается с 2-мя колесами.
//
//            - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
//
//            - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
//
//            - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
//
//            - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
public class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void setCar() {
        car = new Car("toyota", "m1000", 2026);
        motorcycle = new Motorcycle("kawasaki", "gt555", 2056);

    }

    //            - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    void instanceOfTest() {
        assertThat(car instanceof Vehicle);
    }

    //            - Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void CarWheelsTest() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    //
//            - Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void MotorcycleWheelsTest() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    //
//            - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void testDriveCarTest() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    //
//            - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void testDriveMotorcycleTest() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    //
//            - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
//
    @Test
    void parkCarTest() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
//            - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).

    @Test
    void parkMotorcycleTest() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}