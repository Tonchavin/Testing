package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle moto;

    /* Создаются экземпляры объекта Car и Motorcycle. */
    @BeforeEach
    public void createVehicle() {
        car = new Car("Dodge", "Ram", 2010);
        moto = new Motorcycle("Suzuki", "GSX-R", 2010);
    }

    /* Проверка, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof). */
    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    /* Проверка, что объект Car создается с 4-мя колесами. */
    @Test
    public void createCarWithFourWheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    /* Проверка, что объект Motorcycle создается с 2-мя колесами. */
    @Test
    public void createMotorcycleWithFourWheels() {
        assertEquals(moto.getNumWheels(), 2);
    }

    /* Проверка, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()). */
    @Test
    public void carSpeedInTestDrive() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    /* Проверка, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()). */
    @Test
    public void motoSpeedInTestDrive() {
        moto.testDrive();
        assertEquals(moto.getSpeed(), 75);
    }

    /* Проверка, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    машина останавливается (speed = 0). */
    @Test
    public void carSpeedInTestDriveToParking() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    /* Проверка, что в режиме парковки (сначала testDrive, потом park,
     т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0). */
    @Test
    public void motoSpeedInTestDriveToParking() {
        moto.testDrive();
        moto.park();
        assertEquals(moto.getSpeed(), 0);
    }
}