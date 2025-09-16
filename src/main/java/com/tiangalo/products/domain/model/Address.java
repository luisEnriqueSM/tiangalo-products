package com.tiangalo.products.domain.model;

import java.util.Objects;

public final class Address {
    private final Integer zipCodePrefix; // e.g., 01037
    private final String city;           // e.g., "sao paulo"
    private final String state;          // e.g., "SP"

    public Address(Integer zipCodePrefix, String city, String state) {
        this.zipCodePrefix = zipCodePrefix;
        this.city = city;
        this.state = state != null ? state.toUpperCase() : null;
    }

    public static Address of(Integer zipCodePrefix, String city, String state) {
        return new Address(zipCodePrefix, city, state);
    }

    public Integer zipCodePrefix() { return zipCodePrefix; }
    public String city() { return city; }
    public String state() { return state; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address that = (Address) o;
        return Objects.equals(zipCodePrefix, that.zipCodePrefix)
            && Objects.equals(city, that.city)
            && Objects.equals(state, that.state);
    }
    @Override public int hashCode() { return Objects.hash(zipCodePrefix, city, state); }
    @Override public String toString() { return city + ", " + state + " " + zipCodePrefix; }
}
