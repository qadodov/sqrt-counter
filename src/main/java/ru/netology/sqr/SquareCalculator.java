package ru.netology.sqr;

public class SquareCalculator {

    //int counter;

    public int calculate(int floor, int ceiling) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (floor <= i * i && ceiling >= i * i) {
                counter++;
            }
        }
        return counter;
    }
}