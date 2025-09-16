package com.tiangalo.products.domain.model;

import java.time.Instant;
import java.util.Objects;

public final class OrderItem {
    private final String orderId;
    private final int orderItemId; // sequence within the order
    private final String productId;
    private final String sellerId;
    private final Instant shippingLimitDate;
    private final Money price;
    private final Money freight;

    private OrderItem(Builder b) {
        this.orderId = Objects.requireNonNull(b.orderId, "orderId");
        this.orderItemId = b.orderItemId;
        this.productId = Objects.requireNonNull(b.productId, "productId");
        this.sellerId = Objects.requireNonNull(b.sellerId, "sellerId");
        this.shippingLimitDate = b.shippingLimitDate;
        this.price = b.price;
        this.freight = b.freight;
    }

    public static Builder builder(String orderId, int orderItemId) { return new Builder(orderId, orderItemId); }

    public String getOrderId() { return orderId; }
    public int getOrderItemId() { return orderItemId; }
    public String getProductId() { return productId; }
    public String getSellerId() { return sellerId; }
    public Instant getShippingLimitDate() { return shippingLimitDate; }
    public Money getPrice() { return price; }
    public Money getFreight() { return freight; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItem)) return false;
        OrderItem other = (OrderItem) o;
        return orderItemId == other.orderItemId && orderId.equals(other.orderId);
    }
    @Override public int hashCode() { return Objects.hash(orderId, orderItemId); }

    public static final class Builder {
        private final String orderId;
        private final int orderItemId;
        private String productId;
        private String sellerId;
        private Instant shippingLimitDate;
        private Money price;
        private Money freight;

        private Builder(String orderId, int orderItemId) {
            this.orderId = orderId;
            this.orderItemId = orderItemId;
        }

        public Builder productId(String v) { this.productId = v; return this; }
        public Builder sellerId(String v) { this.sellerId = v; return this; }
        public Builder shippingLimitDate(Instant v) { this.shippingLimitDate = v; return this; }
        public Builder price(Money v) { this.price = v; return this; }
        public Builder freight(Money v) { this.freight = v; return this; }

        public OrderItem build() { return new OrderItem(this); }
    }
}
