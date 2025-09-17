package com.tiangalo.products.domain.model;

import java.util.Objects;

public final class SKU {
    private final String value;

    private SKU(String value) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException("SKU vacío");
        if (value.length() > 64) throw new IllegalArgumentException("SKU demasiado largo");
        this.value = value;
    }
    public static SKU of(String value){ return new SKU(value.trim()); }
    public String getValue(){ return value; }

    @Override public boolean equals(Object o){ return o instanceof SKU that && value.equals(that.value); }
    @Override public int hashCode(){ return Objects.hash(value); }
    @Override public String toString(){ return value; }
}
