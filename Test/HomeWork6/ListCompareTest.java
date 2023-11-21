package HomeWork6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCompareTest {
    List<Number> numList1;
    List<Number> numList2;
    List<Number> numList3;
    List<Number> numList4;
    ByteArrayOutputStream outputStream;
    PrintStream printStream;

    /**
     * Создаем четыре листа из чисел.
     * Один из них пустой.
     * И один из трех числе
     **/
    @BeforeEach
    void setUp() {
        numList1 = new ArrayList<>(Arrays.asList(1.2, 2, 3.8, 5));
        numList2 = new ArrayList<>(Arrays.asList(1.2, 2, 3.8, 5));
        numList3 = new ArrayList<>(Arrays.asList(2, 4, 5));
        numList4 = new ArrayList<>();

        outputStream = new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);
    }

    /**
     * Первым делом проверяем пуст ли список.
     **/
    @Test
    void getListAverage_TestWithEmptyList() {
        Exception thrown = assertThrows(Exception.class, () -> ListCompare.getListAverage(numList4));
        assertTrue(thrown.getMessage().contains("Список пуст"));
    }

    @Test
    void getListAverage_TestWithFilledList() {
        assertEquals((1.2 + 2 + 3.8 + 5) / 4, ListCompare.getListAverage(numList1));
    }

    /**
     * Сравнение списков.
     **/
    @Test
    void compareListsAverages_TestWithEqualLists() {
        System.setOut(printStream);
        ListCompare.compareListsAverages(numList1, numList2);
        assertEquals("Средние значения равны", outputStream.toString().trim());
        System.setOut(System.out);
    }

    @Test
    void compareListsAverages_TestWithFirstAverageLarger() {
        System.setOut(printStream);
        ListCompare.compareListsAverages(numList3, numList1);
        assertEquals("Первый список имеет большее среднее значение", outputStream.toString().trim());
        System.setOut(System.out);
    }

    @Test
    void compareListsAverages_TestWithSecondAverageLarger() {
        System.setOut(printStream);
        ListCompare.compareListsAverages(numList2, numList3);
        assertEquals("Второй список имеет большее среднее значение", outputStream.toString().trim());
        System.setOut(System.out);
    }
}