package com.planet.exceptions;

public class ExoPlanetExceptions extends Exception{

    public ExoPlanetExceptions() {
        super();
    }

    public ExoPlanetExceptions(String message) {
        super(message);
    }

    public ExoPlanetExceptions(String message, Throwable e) {
        super(message, e);
    }

}
