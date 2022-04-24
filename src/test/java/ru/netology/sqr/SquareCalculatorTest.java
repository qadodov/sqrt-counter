package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareCalculatorTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void calculate(String testName, int floor, int ceiling, int expected) {
        SquareCalculator service = new SquareCalculator();

        int actual = service.calculate(floor, ceiling);

        assertEquals(expected, actual);
    }
}