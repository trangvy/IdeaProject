package com.company;

public class ComplexNumber {
    int re;
    int im;

    static ComplexNumber add(ComplexNumber a, ComplexNumber b) {

        ComplexNumber num = new ComplexNumber();
        num.re = a.re + b.re;
        num.im = a.im + b.im;

        return num;
    }

    ComplexNumber subtract(ComplexNumber b) {
        ComplexNumber num = new ComplexNumber();
        num.re = this.re - b.re;
        num.im = this.im - b.im;

        return num;
    }

    ComplexNumber subtract(int a) {
        ComplexNumber b = new ComplexNumber();
        b.re = this.re + a;
        return b;
    }

    static int getMagnitude(ComplexNumber a) {
        int dolon = Math.abs(a.re) + Math.abs(a.im);

        return dolon;
    }

    static ComplexNumber findMaxMagnitudeNumber(ComplexNumber[] numbers) {
        int maxMagnitude = 0;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            ComplexNumber number = numbers[i];
            int magnitude = getMagnitude(number);

            if (magnitude > maxMagnitude) {
                maxMagnitude = magnitude;
                index = i;
            }

        }

        return numbers[index];

    }
}
