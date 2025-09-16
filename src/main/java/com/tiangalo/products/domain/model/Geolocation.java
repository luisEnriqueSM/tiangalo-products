package com.tiangalo.products.domain.model;

import java.util.Objects;

public final class Geolocation {
    private final Integer zipCodePrefix;
    private final Double latitude;
    private final Double longitude;
    private final String city;
    private final String state;

    public Geolocation(Integer zipCodePrefix, Double latitude, Double longitude, String city, String state) {
        this.zipCodePrefix = zipCodePrefix;
        this.latitude = latitude;
        this.longitude = longitude;
        this.city = city;
        this.state = state != null ? state.toUpperCase() : null;
    }

    public static Geolocation of(Integer zipCodePrefix, Double latitude, Double longitude, String city, String state) {
        return new Geolocation(zipCodePrefix, latitude, longitude, city, state);
    }

    public Integer zipCodePrefix() { return zipCodePrefix; }
    public Double latitude() { return latitude; }
    public Double longitude() { return longitude; }
    public String city() { return city; }
    public String state() { return state; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Geolocation)) return false;
        Geolocation that = (Geolocation) o;
        return Objects.equals(zipCodePrefix, that.zipCodePrefix)
            && Objects.equals(latitude, that.latitude)
            && Objects.equals(longitude, that.longitude)
            && Objects.equals(city, that.city)
            && Objects.equals(state, that.state);
    }
    @Override public int hashCode() { return Objects.hash(zipCodePrefix, latitude, longitude, city, state); }
    @Override public String toString() { return "Geo(" + zipCodePrefix + "): " + latitude + "," + longitude; }
}
