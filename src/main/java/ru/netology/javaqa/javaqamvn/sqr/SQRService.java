package ru.netology.javaqa.javaqamvn.sqr;

public class SQRService {
    public int calcSqrt(int lowerLimit, int upperLimit) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (lowerLimit <= i * i && i * i <= upperLimit) {
                System.out.print("*** i= " + i + ", i**2 = " + i * i + "\n");
                number++;
            }
        }
        return number;
    }
}
