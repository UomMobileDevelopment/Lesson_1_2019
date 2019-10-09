package com.example.myapplication;

public enum Currency {

    EURO("20AC", "EUR"), DOLLAR("&#x24");

    private String hexCode;
    private String code;

    Currency(String hexCode) {
        this.hexCode = hexCode;
    }

    Currency(String hexCode, String code) {
        this.hexCode = hexCode;
        this.code = code;
    }

    public String getHexCode() {
        return hexCode;
    }

    public String getCode() {
        return code;
    }
}
