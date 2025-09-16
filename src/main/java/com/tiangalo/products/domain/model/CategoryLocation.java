package com.tiangalo.products.domain.model;

import java.util.UUID;

public class CategoryLocation {

    private UUID category_id;
    private String locale;
    private String display_name;
    private String description;

    public CategoryLocation(UUID category_id, String locale, String display_name, String description) {
        this.category_id = category_id;
        this.locale = locale;
        this.display_name = display_name;
        this.description = description;
    }

    public UUID getCategory_id() {
        return category_id;
    }

    public void setCategory_id(UUID category_id) {
        this.category_id = category_id;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
