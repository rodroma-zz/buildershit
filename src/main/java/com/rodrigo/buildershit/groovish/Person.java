package com.rodrigo.buildershit.groovish;

public class Person {
    private long uuid;
    private String name;
    private Address address;
    private String favouriteColor;

    public Person(long uuid, String name, Address address, String favouriteColor) {
        this.uuid = uuid;
        this.name = name;
        this.address = address;
        this.favouriteColor = favouriteColor;
    }

    public long getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getFavouriteColor() {
        return favouriteColor;
    }

    @Override
    public String toString() {
        return "com.rodrigo.buildershit.javabeans.Person{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", adress=" + address +
                ", favouriteColor='" + favouriteColor + '\'' +
                '}';
    }
}
