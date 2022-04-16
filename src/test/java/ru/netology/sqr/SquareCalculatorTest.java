package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareCalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"'squares counted, bottom border included',100,144,3",
            "'squares counted, top border included',9409,9801,3",
            "'no squares in range included',1,99,0",
            "'max amount of squares in range',100,9801,90"})
    void calculate(String testName, int floor, int ceiling, int expected) {
        SquareCalculator service = new SquareCalculator();

        int actual = service.calculate(floor, ceiling);

        assertEquals(expected, actual);
    }
}