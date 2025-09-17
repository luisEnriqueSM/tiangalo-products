package com.tiangalo.products.domain.model;

import java.util.Locale;
import java.util.Objects;

public final class LocalizedName {
    private final Locale locale;
    private final String name;

    private LocalizedName(Locale locale, String name){
        if (locale == null) throw new IllegalArgumentException("Locale nulo");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Nombre vacío");
        this.locale = locale;
        this.name = name.trim();
    }

    public static LocalizedName of(String languageTag, String name){
        return new LocalizedName(Locale.forLanguageTag(languageTag), name);
    }

    public Locale locale(){ return locale; }
    public String name(){ return name; }

    @Override public boolean equals(Object o){
        return o instanceof LocalizedName that &&
               locale.equals(that.locale) && name.equalsIgnoreCase(that.name);
    }
    @Override public int hashCode(){ return Objects.hash(locale, name.toLowerCase()); }
    @Override public String toString(){ return name + " (" + locale.toLanguageTag() + ")"; }
}
