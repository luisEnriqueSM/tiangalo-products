package com.tiangalo.products.domain.model;

import java.util.Objects;

public final class ProductCategory {
    private final String namePt;
    private final String nameEnglish;

    private ProductCategory(String namePt, String nameEnglish) {
        this.namePt = namePt;
        this.nameEnglish = nameEnglish;
    }

    public static ProductCategory of(String namePt, String nameEnglish) {
        return new ProductCategory(namePt, nameEnglish);
    }

    public String namePt() { return namePt; }
    public String nameEnglish() { return nameEnglish; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductCategory)) return false;
        ProductCategory that = (ProductCategory) o;
        return Objects.equals(namePt, that.namePt);
    }
    @Override public int hashCode() { return Objects.hash(namePt); }
    @Override public String toString() { return nameEnglish != null ? nameEnglish : namePt; }
}
