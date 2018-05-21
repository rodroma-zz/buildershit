package com.rodrigo.buildershit.groovish;

import java.util.function.Consumer;

public class AddressBuilder {
    public String street;
    public int number;

    public AddressBuilder with(Consumer<AddressBuilder> consumer) {
        consumer.accept(this);
        return this;
    }

    public Address build() {
        if (street == null) throw new BuildException("street");
        if (number == 0) throw new BuildException("number");
        return new Address(this.street, this.number);
    }
}
