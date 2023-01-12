package ru.netology.javaqa.javaqamvn.sqr;

public class SQRService {
    public int calcSqrt(int lower_limit, int upper_limit) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (lower_limit <= i * i && i * i <= upper_limit) {
                System.out.print("*** i= " + i + ", i**2 = " + i * i + "\n");
                number++;
            }
        }
        return number;
    }
}
