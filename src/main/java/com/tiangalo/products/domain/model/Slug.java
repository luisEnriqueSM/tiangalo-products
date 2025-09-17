package com.tiangalo.products.domain.model;

import java.text.Normalizer;
import java.util.Objects;

public final class Slug {
    private final String value;

    private Slug(String value){
        if (value == null || value.isBlank()) throw new IllegalArgumentException("Slug vacío");
        this.value = normalize(value);
    }
    public static Slug of(String value){ return new Slug(value); }
    public String getValue(){ return value; }

    private static String normalize(String s){
        String nowhitespace = s.trim().toLowerCase().replaceAll("\\s+", "-");
        String normalized = Normalizer.normalize(nowhitespace, Normalizer.Form.NFD)
                .replaceAll("\\p{M}","")
                .replaceAll("[^a-z0-9-]","");
        return normalized;
    }

    @Override public boolean equals(Object o){ return o instanceof Slug that && value.equals(that.value); }
    @Override public int hashCode(){ return Objects.hash(value); }
    @Override public String toString(){ return value; }
}
