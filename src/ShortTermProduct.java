package com.example.myapplication;

public class ShortTermProduct implements Product {

    @Override
    public double calculateProfit(double amount) {
        return amount * 120 * 0.015;
    }
}
