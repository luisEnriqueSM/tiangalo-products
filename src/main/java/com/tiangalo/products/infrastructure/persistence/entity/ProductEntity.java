package com.tiangalo.products.infrastructure.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Index;


@Entity
@Table(name = "products",
    indexes = {
        @Index(name="idx_products_category", columnList="product_category_name"),
        @Index(name="idx_products_dimensions",
            columnList="product_length_cm, product_height_cm, product_width_cm")
  }
)
public class ProductEntity {

    @Id
    @Column(name = "product_id", length = 34, nullable = false)
    private String id;

    @Column(name = "product_category_name", length = 100)
    private String productCategoryName;

    @Column(name = "product_name_lenght")
    private Integer nameLenght;

    @Column(name = "product_description_lenght")
    private Integer descriptionLength;

    @Column(name = "product_photos_qty")
    private Integer photosQty;

    @Column(name = "product_weight_g")
    private Integer weightGrams;

    @Column(name = "product_length_cm")
    private Integer lengthCm;

    @Column(name = "product_height_cm")
    private Integer heightCm;

    @Column(name = "product_width_cm")
    private Integer widthCm;

    public ProductEntity(String id, String productCategoryName, Integer nameLenght, Integer descriptionLength,
            Integer photosQty, Integer weightGrams, Integer lengthCm, Integer heightCm, Integer widthCm) {
        this.id = id;
        this.productCategoryName = productCategoryName;
        this.nameLenght = nameLenght;
        this.descriptionLength = descriptionLength;
        this.photosQty = photosQty;
        this.weightGrams = weightGrams;
        this.lengthCm = lengthCm;
        this.heightCm = heightCm;
        this.widthCm = widthCm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public Integer getNameLenght() {
        return nameLenght;
    }

    public void setNameLenght(Integer nameLenght) {
        this.nameLenght = nameLenght;
    }

    public Integer getDescriptionLength() {
        return descriptionLength;
    }

    public void setDescriptionLength(Integer descriptionLength) {
        this.descriptionLength = descriptionLength;
    }

    public Integer getPhotosQty() {
        return photosQty;
    }

    public void setPhotosQty(Integer photosQty) {
        this.photosQty = photosQty;
    }

    public Integer getWeightGrams() {
        return weightGrams;
    }

    public void setWeightGrams(Integer weightGrams) {
        this.weightGrams = weightGrams;
    }

    public Integer getLengthCm() {
        return lengthCm;
    }

    public void setLengthCm(Integer lengthCm) {
        this.lengthCm = lengthCm;
    }

    public Integer getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(Integer heightCm) {
        this.heightCm = heightCm;
    }

    public Integer getWidthCm() {
        return widthCm;
    }

    public void setWidthCm(Integer widthCm) {
        this.widthCm = widthCm;
    }
}
