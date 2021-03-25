package ru.netology.ststs;

public class StatsService {

    public long annualSales(long[] monthSales) {
        long cumulativeSales = 0;
        for (long monthSalesAmount : monthSales) {
            cumulativeSales += monthSalesAmount;
        }
        return cumulativeSales;
    }

    public long averageSalesPerMonth(long[] monthSales) {
        return annualSales(monthSales) / 12;
    }

    public long maximumSalesRecentMonthNumber(long[] monthSales) {
        long currentMaximumSalesRecentMonthNumber = 1;
        long currentMaximumSales = monthSales[0];
        for (int i = 0; i < monthSales.length; i++) {
            if (i != 0) {
                if (monthSales[i] >= currentMaximumSales) {
                    currentMaximumSalesRecentMonthNumber = i + 1;
                    currentMaximumSales = monthSales[i];
                }
            }
        }
        return currentMaximumSalesRecentMonthNumber;
    }

    public long minimumSalesRecentMonthNumber(long[] monthSales) {
        long currentMinimumSalesRecentMonthNumber = 1;
        long currentMinimumSales = monthSales[0];
        for (int i = 0; i < monthSales.length; i++) {
            if (i != 0) {
                if (monthSales[i] <= currentMinimumSales) {
                    currentMinimumSalesRecentMonthNumber = i + 1;
                    currentMinimumSales = monthSales[i];
                }
            }
        }
        return currentMinimumSalesRecentMonthNumber;
    }

    public long belowAverageSalesMonthQuantity(long[] monthSales) {
        long belowAverageSalesMonthQuantity = 0;
        long averageSalesAmount = averageSalesPerMonth(monthSales);
        for (long monthSalesAmount : monthSales) {
            if (monthSalesAmount < averageSalesAmount) {
                belowAverageSalesMonthQuantity++;
            }
        }
        return belowAverageSalesMonthQuantity;
    }

    public long aboveAverageSalesMonthQuantity(long[] monthSales) {
        long aboveAverageSalesMonthQuantity = 0;
        long averageSalesAmount = averageSalesPerMonth(monthSales);
        for (long monthSalesAmount : monthSales) {
            if (monthSalesAmount < averageSalesAmount) {
                aboveAverageSalesMonthQuantity++;
            }
        }
        return aboveAverageSalesMonthQuantity;
    }

}
