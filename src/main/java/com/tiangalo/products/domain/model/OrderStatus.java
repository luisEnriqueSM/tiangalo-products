package com.tiangalo.products.domain.model;

public enum OrderStatus {
    CREATED, APPROVED, INVOICED, PROCESSING, SHIPPED, DELIVERED, CANCELED, UNAVAILABLE, NOT_DEFINED;

    public static OrderStatus fromRaw(String raw) {
        if (raw == null) return NOT_DEFINED;
        switch (raw.trim().toLowerCase()) {
            case "created": return CREATED;
            case "approved": return APPROVED;
            case "invoiced": return INVOICED;
            case "processing": return PROCESSING;
            case "shipped": return SHIPPED;
            case "delivered": return DELIVERED;
            case "canceled": return CANCELED;
            case "unavailable": return UNAVAILABLE;
            default: return NOT_DEFINED;
        }
    }
}
