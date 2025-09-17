package com.tiangalo.products.domain.model;

import java.util.Objects;
import java.util.UUID;

public final class ProductId {
    private final String value;

    private ProductId(String value) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException("ProductId vacío");
        this.value = value;
    }
    public static ProductId of(String value) { return new ProductId(value); }
    public static ProductId newId() { return new ProductId(UUID.randomUUID().toString()); }
    public String getValue() { return value; }

    @Override public boolean equals(Object o){ return o instanceof ProductId that && value.equals(that.value); }
    @Override public int hashCode(){ return Objects.hash(value); }
    @Override public String toString(){ return value; }
}
