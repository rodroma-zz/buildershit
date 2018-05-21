package com.rodrigo.buildershit.groovish;

public class Address {
    private String street;
    private int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "com.rodrigo.buildershit.javabeans.Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
