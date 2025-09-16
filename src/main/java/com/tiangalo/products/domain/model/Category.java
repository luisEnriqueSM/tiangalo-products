package com.tiangalo.products.domain.model;

import java.time.LocalDate;
import java.util.UUID;

public class Category {

    private UUID id;
    private String code;
    private String parent_id;
    private Boolean is_active;
    private LocalDate created_at;
    private LocalDate updated_at;

    public Category(UUID id, String code, String parent_id, Boolean is_active, LocalDate created_at,
            LocalDate updated_at) {
        this.id = id;
        this.code = code;
        this.parent_id = parent_id;
        this.is_active = is_active;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public UUID getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getParent_id() {
        return parent_id;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public LocalDate getUpdated_at() {
        return updated_at;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(LocalDate updated_at) {
        this.updated_at = updated_at;
    }
}
