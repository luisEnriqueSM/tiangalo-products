package com.tiangalo.products.domain.model;

import java.util.*;

public class Category {
    private final CategoryId id;     // Ej: "bed_bath_table"
    private final Slug slug;         // Normalizado
    private final List<LocalizedName> translations; // pt-BR, en-US, es-MX, etc.

    private Category(CategoryId id, Slug slug, List<LocalizedName> translations){
        if (translations == null || translations.isEmpty())
            throw new IllegalArgumentException("Category debe tener al menos 1 traducción");
        this.id = id;
        this.slug = slug;
        // copiamos inmutable
        this.translations = List.copyOf(new LinkedList<>(translations));
    }

    public static Category create(CategoryId id, Slug slug, List<LocalizedName> translations){
        return new Category(id, slug, translations);
    }

    public CategoryId id(){ return id; }
    public Slug slug(){ return slug; }

    public Optional<LocalizedName> nameForLocale(Locale locale){
        return translations.stream()
                .filter(t -> t.locale().getLanguage().equals(locale.getLanguage()))
                .findFirst()
                .or(() -> translations.stream().findFirst());
    }

    public List<LocalizedName> allTranslations(){ return translations; }
}
