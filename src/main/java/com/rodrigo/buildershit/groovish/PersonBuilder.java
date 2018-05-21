package com.rodrigo.buildershit.groovish;

import java.util.function.Consumer;

public class PersonBuilder {
    public long uuid;
    public String name;
    public Address address;
    public String favouriteColor;

    public PersonBuilder with(Consumer<PersonBuilder> attributes) {
        attributes.accept(this);
        return this;
    }

    public Person build() {
        if (uuid == 0) throw new BuildException("uuid");
        if (name == null) throw new BuildException("name");
        if (address == null) throw new BuildException("address");
        return new Person(uuid, name, address, favouriteColor);
    }
}
