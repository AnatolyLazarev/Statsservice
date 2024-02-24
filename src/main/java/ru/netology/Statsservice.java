package ru.netology;

public class Statsservice {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = findSum(sales);
        System.out.println("Сумма всех продаж: " + sum + " рублей");

        int average = findAverage(sales);
        System.out.println("Средняя сумма продаж в месяц: " + average + " рублей");

        int monthMax = findMax(sales);
        System.out.println("Максимальные продажи в месяце номер " + monthMax);

        int monthMin = findMin(sales);
        System.out.println("Минимальные продажи в месяце номер " + monthMin);

        int monthUnderAverage = findUnderAverage(sales);
        System.out.println("Количество месяцев с продажами ниже среднего: " + monthUnderAverage);

        int monthOverAverage = findOverAverage(sales);
        System.out.println("Количество месяцев с продажами выше среднего: " + monthOverAverage);
    }

    public static int findSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public static int findAverage(int[] sales) {
        return findSum(sales) / sales.length;
    }

    public static int findMax(int[] sales) {
        int max = sales[0];
        int number = 0;
        int numberMax = 0;
        for (int sale : sales) {
            number++;
            if (max <= sale) {
                max = sale;
                numberMax = number;
            }
        }
        return numberMax;
    }

    public static int findMin(int[] sales) {
        int min = sales[0];
        int number = 0;
        int numberMin = 0;
        for (int sale : sales) {
            number++;
            if (min >= sale) {
                min = sale;
                numberMin = number;
            }
        }
        return numberMin;
    }

    public static int findUnderAverage(int[] sales) {
        int average = findAverage(sales);
        int month = 0;
        int quantityUnder = 0;
        for (int sale : sales) {
            if (sale < average) {
                month++;
                quantityUnder = month;
            }
        }
        return quantityUnder;
    }

    public static int findOverAverage(int[] sales) {
        int average = findAverage(sales);
        int month = 0;
        int quantityOver = 0;
        for (int sale : sales) {
            if (sale > average) {
                month++;
                quantityOver = month;
            }
        }
        return quantityOver;
    }
}

//Сумма всех продаж: 180 рублей
//Средняя сумма продаж в месяц: 15 рублей
//Максимальные продажи в месяце номер 8
//Минимальные продажи в месяце номер 9
//Количество месяцев с продажами ниже среднего: 5
//Количество месяцев с продажами выше среднего: 5

//Process finished with exit code 0
