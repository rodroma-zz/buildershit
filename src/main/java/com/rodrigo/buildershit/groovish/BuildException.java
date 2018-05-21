package com.rodrigo.buildershit.groovish;

public class BuildException extends RuntimeException {

    public BuildException(String attr) {
        super(attr + " is invalid.");
    }
}
