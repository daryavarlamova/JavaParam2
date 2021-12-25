package ru.netology;

public class StatsService {

        public int monthSum(int[] sales) {
            int sum = 0;
            for (int sale : sales) {
                sum = sum + sale;
            }
            return sum;
        }

        public int monthAverage(int[] sales) {
            return monthSum(sales) / sales.length;
        }

        public int monthMax(int[] sales) {
            int max = 0;
            int month = 0;
            for (int sale : sales) {
                if (sale >= sales[max]) {
                    max = month;
                }
                month++;
            }
            return max + 1;
        }

        public int monthMin(int[] sales) {
            int min = 0;
            int month = 0;
            for (int sale : sales) {
                if (sale <= sales[min]) {
                    min = month;
                }
                month++;
            }
            return min + 1;
        }

        public int monthLowAverage(int[] sales) {
            int lowAvg = 0;
            for (int sale : sales) {
                if (sale < monthAverage(sales)) {
                    lowAvg++;
                }
            }
            return lowAvg;
        }

        public int monthAboveAverage(int[] sales) {
            int aboveAvg = 0;
            for (int sale : sales) {
                if (sale > monthAverage(sales)) {
                    aboveAvg++;
                }
            }
            return aboveAvg;
        }
    }

