package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @org.junit.jupiter.api.Test
    public void checkMonthSum() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.monthSum(managerSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void checkMonthAverage() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.monthAverage(managerSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void checkMonthMax() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.monthMax(managerSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void checkMonthMin() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.monthMin(managerSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMonthLowAverage() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthLowAverage(managerSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMonthAboveAverage() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthAboveAverage(managerSales);
        assertEquals(expected, actual);
    }
}
