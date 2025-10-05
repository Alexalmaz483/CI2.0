package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    // Все элементы равны
    @Test
    void findMax_allElementsEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {7, 7, 7, 7};
        long expected = 7;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    // Массив из одного элемента
    @Test
    void findMax_singleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {42};
        long expected = 42;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    // Максимум встречается несколько раз
    @Test
    void findMax_multipleMaxValues() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {3, 9, 5, 9, 1};
        long expected = 9;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    // Отрицательные значения
    @Test
    void findMax_withNegativeValues() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-10, -5, -3, -20};
        long expected = -3;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    // Пустой массив - проверка исключения
    @Test
    void findMax_emptyArray_shouldThrow() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {};
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> service.findMax(incomes));
    }
}
