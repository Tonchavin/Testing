package seminars.third.coverage;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seminars.third.coverage.SomeService.evenOddNumber;
import static seminars.third.coverage.SomeService.numberInInterval;


class SomeServiceTest {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).

    @ParameterizedTest
    @ValueSource(ints = {-100, 0, 100})
    public void evenNumberSentForTrue(int n) {
        assertTrue(evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {-101, 101})
    public void oddNumberSentForFalse(int n) {
        assertFalse(evenOddNumber(n));
    }


    // HW 3.2. Нужно написать метод, который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true,
    // если попадает и false - если нет, покрыть тестами метод на 100%

    @ParameterizedTest
    @ValueSource(ints = {25, 100})
    public void numberInIntervalIsTrue(int n) {
        assertTrue(numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 24,})
    public void numberInIntervalIsFalseMin(int n) {
        assertFalse(numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {101, 110,})
    public void numberInIntervalIsFalseMax(int n) {
        assertFalse(numberInInterval(n));
    }
}