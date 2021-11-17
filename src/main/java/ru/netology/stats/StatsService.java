package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }
    public int findAvg (int[] sales) {
        return calculateSum(sales) / sales.length;
    }
    public int findMonthMax(int[] sales) {
        int monthMax = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[monthMax]) {
                monthMax = month;
            }
            month++;
        }
        return monthMax + 1;
    }
    public int findMonthMin(int[] sales) {
        int monthMin = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[monthMin]) {
                monthMin = month;
            }
            month++;
        }
        return monthMin + 1;
    }

    public int findMonthBelowAvg(int[] sales) {
        int belowAvg = 0;
        for (int sale : sales) {
            if (sale < findAvg(sales)) {
                belowAvg++;
            }
        }
        return belowAvg;
    }

    public int findMonthAboveAvg(int[] sales) {
        int AboveAvg = 0;
        for (int sale : sales) {
            if (sale > findAvg(sales)) {
                AboveAvg++;
            }
        }
        return AboveAvg;
    }
}
