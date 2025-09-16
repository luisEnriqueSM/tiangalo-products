package com.tiangalo.products.domain.model;

import java.util.Objects;

public final class Product {
    private final String id;                       // product_id
    private final ProductCategory category;        // optional
    private final Integer nameLength;              // as per dataset
    private final Integer descriptionLength;       // as per dataset
    private final Integer photosQty;
    private final Integer weightGrams;
    private final Dimensions dimensions;

    private Product(Builder b) {
        this.id = Objects.requireNonNull(b.id, "id");
        this.category = b.category;
        this.nameLength = b.nameLength;
        this.descriptionLength = b.descriptionLength;
        this.photosQty = b.photosQty;
        this.weightGrams = b.weightGrams;
        this.dimensions = b.dimensions;
    }

    public static Builder builder(String id) { return new Builder(id); }

    public String getId() { return id; }
    public ProductCategory getCategory() { return category; }
    public Integer getNameLength() { return nameLength; }
    public Integer getDescriptionLength() { return descriptionLength; }
    public Integer getPhotosQty() { return photosQty; }
    public Integer getWeightGrams() { return weightGrams; }
    public Dimensions getDimensions() { return dimensions; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        return id.equals(((Product)o).id);
    }
    @Override public int hashCode() { return Objects.hash(id); }
    @Override public String toString() { return "Product{" + id + "}"; }

    public static final class Builder {
        private final String id;
        private ProductCategory category;
        private Integer nameLength;
        private Integer descriptionLength;
        private Integer photosQty;
        private Integer weightGrams;
        private Dimensions dimensions;

        private Builder(String id) { this.id = id; }

        public Builder category(ProductCategory category) { this.category = category; return this; }
        public Builder nameLength(Integer v) { this.nameLength = v; return this; }
        public Builder descriptionLength(Integer v) { this.descriptionLength = v; return this; }
        public Builder photosQty(Integer v) { this.photosQty = v; return this; }
        public Builder weightGrams(Integer v) { this.weightGrams = v; return this; }
        public Builder dimensions(Dimensions d) { this.dimensions = d; return this; }

        public Product build() { return new Product(this); }
    }
}
