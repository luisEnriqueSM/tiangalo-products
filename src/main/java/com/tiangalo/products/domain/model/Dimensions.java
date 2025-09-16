package com.tiangalo.products.domain.model;

import java.util.Objects;

public final class Dimensions {
    private final Integer lengthCm;
    private final Integer heightCm;
    private final Integer widthCm;

    public Dimensions(Integer lengthCm, Integer heightCm, Integer widthCm) {
        this.lengthCm = lengthCm;
        this.heightCm = heightCm;
        this.widthCm  = widthCm;
    }

    public static Dimensions of(Integer lengthCm, Integer heightCm, Integer widthCm) {
        return new Dimensions(lengthCm, heightCm, widthCm);
    }

    public Integer lengthCm() { return lengthCm; }
    public Integer heightCm() { return heightCm; }
    public Integer widthCm()  { return widthCm; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dimensions)) return false;
        Dimensions that = (Dimensions) o;
        return Objects.equals(lengthCm, that.lengthCm)
            && Objects.equals(heightCm, that.heightCm)
            && Objects.equals(widthCm, that.widthCm);
    }
    @Override public int hashCode() { return Objects.hash(lengthCm, heightCm, widthCm); }
    @Override public String toString() { return "LxHxW=" + lengthCm + "x" + heightCm + "x" + widthCm + " cm"; }
}
