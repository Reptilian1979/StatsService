package ru.netology.stats;

public class StatsService {
    public int totalSalesCalc(int[] sales) {
        int totalSales = 0;
        for (int i = 0; i < sales.length; i++)
            totalSales = totalSales + sales[i];
        return totalSales;
    }

    public int averageSalesCalc(int[] sales) {
        int totalSales = totalSalesCalc(sales);
        for (int i = 0; i < sales.length; i++) ;
        int averageSales = totalSales / sales.length;
        return averageSales;
    }

    public int maxMonthCalc(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonthCalc(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int badMonthsSalesCalc(int[] sales) {
        int averageSales = averageSalesCalc(sales);
        int badMonths = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                badMonths = badMonths + 1;
            }
        }
        return badMonths;
    }

    public int goodMonthsCalc(int[] sales) {
        int averageSales = averageSalesCalc(sales);
        int goodMonths = 0;
        for (int sale : sales) {
            if (sale > averageSales) {
                goodMonths = goodMonths + 1;
            }
        }
        return goodMonths;
    }
}