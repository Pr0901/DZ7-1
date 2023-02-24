package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {

        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long sumSales(long[] sales) {

        long sumSale = 0;
        for (long sum : sales) {
            sumSale = sumSale + sum;
        }
        return sumSale;
    }

    public long middleSales(long[] sales) {

        long middleSales = sumSales(sales) / 12;

        return middleSales;
    }

    public long lessMiddleSales(long[] sales) {

        long middleSales = middleSales(sales);
        int quantity = 0;

        for (long sale : sales) {
            if (sale < middleSales) {
                quantity++;
            }
        }
        return quantity;
    }

    public long overMiddleSales(long[] sales) {

        long middleSales = middleSales(sales);
        int quantity = 0;

        for (long sale : sales) {
            if (sale > middleSales) {
                quantity++;
            }
        }
        return quantity;
    }
}
