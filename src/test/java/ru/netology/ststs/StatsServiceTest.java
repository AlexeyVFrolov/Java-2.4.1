package ru.netology.ststs;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateAnnualSales() {
        StatsService service = new StatsService();
        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.annualSales(monthSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAverageSalesPerMonth() {
        StatsService service = new StatsService();
        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSalesPerMonth(monthSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMaximumSalesRecentMonthNumber() {
        StatsService service = new StatsService();
        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maximumSalesRecentMonthNumber(monthSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMinimumSalesRecentMonthNumber() {
        StatsService service = new StatsService();
        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minimumSalesRecentMonthNumber(monthSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateBelowAverageSalesMonthQuantity() {
        StatsService service = new StatsService();
        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.belowAverageSalesMonthQuantity(monthSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateaboveAverageSalesMonthQuantity() {
        StatsService service = new StatsService();
        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.aboveAverageSalesMonthQuantity(monthSales);
        assertEquals(expected, actual);
    }

}