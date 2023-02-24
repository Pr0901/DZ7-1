package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void minSalesMonth() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);


    }

    @Test
    public void maxSalesMonth() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);


    }


    @Test
    public void sumSalesMonth() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 8;
        long actualSum = service.maxSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void mediumSalesMonth() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSale = 15;
        long actualSale = service.middleSales(sales);

        Assertions.assertEquals(expectedSale, actualSale);

    }

    @Test
    public void lessMiddleSalesMonth() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedQuantity = 5;
        long actualQuantity = service.lessMiddleSales(sales);

        Assertions.assertEquals(expectedQuantity, actualQuantity);
    }

    @Test
    public void overMiddleSalesMonth() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedQuantity = 5;
        long actualQuantity = service.overMiddleSales(sales);

        Assertions.assertEquals(expectedQuantity, actualQuantity);
    }


}



