package com.tiangalo.products.domain.model;

import java.util.Objects;

public final class WeightGrams {
    private final int grams;

    private WeightGrams(int grams) {
        if (grams < 0) throw new IllegalArgumentException("Peso negativo");
        this.grams = grams;
    }
    public static WeightGrams of(int grams){ return new WeightGrams(grams); }
    public int asInt(){ return grams; }
    public boolean isZero(){ return grams == 0; }

    @Override public boolean equals(Object o){ return o instanceof WeightGrams that && grams == that.grams; }
    @Override public int hashCode(){ return Objects.hash(grams); }
    @Override public String toString(){ return grams + "g"; }
}
