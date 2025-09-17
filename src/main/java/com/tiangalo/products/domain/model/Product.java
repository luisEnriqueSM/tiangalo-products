package com.tiangalo.products.domain.model;

import java.util.Objects;
import java.util.Optional;

public class Product {
    private final ProductId id;
    private final CategoryId categoryId;
    private final String title;          // Puedes derivarlo o mapearlo desde una fuente externa si lo deseas
    private final String description;    // Idem
    private final int photosQty;
    private final WeightGrams weight;
    private final DimensionsCm dimensions;
    private final SKU sku;               // Opcional si decides generarlo

    private Product(ProductId id,
                    CategoryId categoryId,
                    String title,
                    String description,
                    int photosQty,
                    WeightGrams weight,
                    DimensionsCm dimensions,
                    SKU sku) {

        if (id == null) throw new IllegalArgumentException("id nulo");
        if (categoryId == null) throw new IllegalArgumentException("categoryId nulo");
        if (photosQty < 0) throw new IllegalArgumentException("photosQty negativo");
        this.id = id;
        this.categoryId = categoryId;
        this.title = (title == null) ? "" : title.trim();
        this.description = (description == null) ? "" : description.trim();
        this.photosQty = photosQty;
        this.weight = Objects.requireNonNullElse(weight, WeightGrams.of(0));
        this.dimensions = Objects.requireNonNullElse(dimensions, DimensionsCm.of(0,0,0));
        this.sku = sku; // puede ser null si no lo manejas aún
    }

    public static Product create(ProductId id,
                                 CategoryId categoryId,
                                 String title,
                                 String description,
                                 int photosQty,
                                 WeightGrams weight,
                                 DimensionsCm dimensions,
                                 SKU sku){
        return new Product(id, categoryId, title, description, photosQty, weight, dimensions, sku);
    }

    public ProductId id(){ return id; }
    public CategoryId categoryId(){ return categoryId; }
    public String title(){ return title; }
    public String description(){ return description; }
    public int photosQty(){ return photosQty; }
    public WeightGrams weight(){ return weight; }
    public DimensionsCm dimensions(){ return dimensions; }
    public Optional<SKU> sku(){ return Optional.ofNullable(sku); }

    // Reglas de negocio de ejemplo:
    public boolean isShippable(){ return !weight.isZero() && dimensions.volumeCm3() > 0; }
}
