package ru.netology.stats.statsservice.services;

import org.junit.jupiter.api.Test;
import ru.netology.Statsservice;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void findSumOfSales() {
        Statsservice service = new Statsservice();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findSum(sales);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void findAverageSumOfSales() {
        Statsservice service = new Statsservice();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findAverage(sales);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMaxSales() {
        Statsservice service = new Statsservice();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMax(sales);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMinSales() {
        Statsservice service = new Statsservice();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMin(sales);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void countMonthUnderAverage() {
        Statsservice service = new Statsservice();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findUnderAverage(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void countMonthOverAverage() {
        Statsservice service = new Statsservice();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findOverAverage(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }
}


//[INFO]  T E S T S
//[INFO] -------------------------------------------------------
//        [INFO] Running ru.netology.stats.statsservice.services.StatsServiceTest
//[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.214 s - in ru.netology.stats.statsservice.services.StatsServiceTest
//[INFO]
//        [INFO] Results:
//        [INFO]
//        [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
//        [INFO]
//        [INFO] ------------------------------------------------------------------------
//        [INFO] BUILD SUCCESS
//[INFO] ------------------------------------------------------------------------
//        [INFO] Total time:  19.229 s
//[INFO] Finished at: 2024-02-24T17:13:08+03:00
//        [INFO] ------------------------------------------------------------------------

//Process finished with exit code 0