package Tugas8.BassicPattern;

import java.lang.reflect.Constructor;

public class ImmuTable {
    private final String firstName;
    private final String lastName;
    private final String SSN;
    private final String address;
    private final Car car;

    public ImmuTable(String fn, String ln, String ssn, String addr, Car c) {
        if (c == null) {
            throw new NullPointerException("Car cannot be null");
        }

        firstName = fn;
        lastName = ln;
        SSN = ssn;
        address = addr;
        car = c;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public String getAddress() {
        return address;
    }

    public Car getCar() {
        if (car == null) {
            return null;
        }

        return car;
    }
}
