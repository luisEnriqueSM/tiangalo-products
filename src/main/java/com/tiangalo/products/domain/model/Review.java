package com.tiangalo.products.domain.model;

import java.time.Instant;
import java.util.Objects;

public final class Review {
    private final String id;  // review_id
    private final String orderId;
    private final Integer score;  // 1..5
    private final String title;
    private final String message;
    private final Instant createdAt;
    private final Instant answeredAt;

    public Review(String id, String orderId, Integer score, String title, String message,
                  Instant createdAt, Instant answeredAt) {
        this.id = Objects.requireNonNull(id, "id");
        this.orderId = Objects.requireNonNull(orderId, "orderId");
        this.score = score;
        this.title = title;
        this.message = message;
        this.createdAt = createdAt;
        this.answeredAt = answeredAt;
    }

    public String getId() { return id; }
    public String getOrderId() { return orderId; }
    public Integer getScore() { return score; }
    public String getTitle() { return title; }
    public String getMessage() { return message; }
    public Instant getCreatedAt() { return createdAt; }
    public Instant getAnsweredAt() { return answeredAt; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Review)) return false;
        return id.equals(((Review)o).id);
    }
    @Override public int hashCode() { return Objects.hash(id); }
    @Override public String toString() { return "Review{" + id + "}"; }
}
