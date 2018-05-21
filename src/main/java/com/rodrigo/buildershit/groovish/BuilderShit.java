package com.rodrigo.buildershit.groovish;

public class BuilderShit {
    public static void main(String[] args) {
        Person person = new PersonBuilder().with(p -> {
            p.uuid = 1;
            p.name = "Rodrigo";
            p.address = new AddressBuilder().with(a -> {
                a.street = "Fake St.";
                a.number = 123;
            }).build();
        }).with(p -> p.favouriteColor = "RED").build();
        System.out.println(person);
    }
}
