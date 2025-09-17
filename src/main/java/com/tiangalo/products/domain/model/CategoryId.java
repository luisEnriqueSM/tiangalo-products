package com.tiangalo.products.domain.model;

import java.util.Objects;

public final class CategoryId {
    // Puedes usar el slug como id canónico (del CSV) o un UUID si normalizas categorías.
    private final String value;

    private CategoryId(String value) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException("CategoryId vacío");
        this.value = value;
    }
    public static CategoryId of(String value){ return new CategoryId(value.trim().toLowerCase()); }
    public String getValue(){ return value; }

    @Override public boolean equals(Object o){ return o instanceof CategoryId that && value.equals(that.value); }
    @Override public int hashCode(){ return Objects.hash(value); }
    @Override public String toString(){ return value; }
}
