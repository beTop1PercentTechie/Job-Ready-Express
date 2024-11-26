package oct23.maps_sets;

import java.util.*;
class Address {
    String city;
    String state;

    // Constructor
    Address(String cityP, String stateP) {
        city = cityP;
        state = stateP;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

class Person {
    String name;
    Address address;

    // Constructor
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy constructor
    Person(Person other) {
        this.name = other.name;
        this.address = other.address; // Shallow copy of reference
    }
}
public class MapSet {

    public static void main(String[] args) {
        Address address = new Address("Ntv", "UP");
        System.out.println(address.toString());
    }
}
