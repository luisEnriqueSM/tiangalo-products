package com.tiangalo.products.domain.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Order {
    private final String id;                       // order_id
    private final String customerId;
    private final OrderStatus status;
    private final Instant purchasedAt;
    private final Instant approvedAt;
    private final Instant deliveredCarrierAt;
    private final Instant deliveredCustomerAt;
    private final Instant estimatedDeliveryAt;

    private final List<OrderItem> items;
    private final List<Payment> payments;

    private Order(Builder b) {
        this.id = Objects.requireNonNull(b.id, "id");
        this.customerId = Objects.requireNonNull(b.customerId, "customerId");
        this.status = b.status != null ? b.status : OrderStatus.NOT_DEFINED;
        this.purchasedAt = b.purchasedAt;
        this.approvedAt = b.approvedAt;
        this.deliveredCarrierAt = b.deliveredCarrierAt;
        this.deliveredCustomerAt = b.deliveredCustomerAt;
        this.estimatedDeliveryAt = b.estimatedDeliveryAt;
        this.items = Collections.unmodifiableList(new ArrayList<>(b.items));
        this.payments = Collections.unmodifiableList(new ArrayList<>(b.payments));
    }

    public static Builder builder(String id, String customerId) { return new Builder(id, customerId); }

    // Getters
    public String getId() { return id; }
    public String getCustomerId() { return customerId; }
    public OrderStatus getStatus() { return status; }
    public Instant getPurchasedAt() { return purchasedAt; }
    public Instant getApprovedAt() { return approvedAt; }
    public Instant getDeliveredCarrierAt() { return deliveredCarrierAt; }
    public Instant getDeliveredCustomerAt() { return deliveredCustomerAt; }
    public Instant getEstimatedDeliveryAt() { return estimatedDeliveryAt; }
    public List<OrderItem> getItems() { return items; }
    public List<Payment> getPayments() { return payments; }

    // Domain convenience
    public Money total(Money zero) {
        Money acc = zero;
        for (OrderItem it : items) {
            if (it.getPrice() != null) acc = acc.add(it.getPrice());
            if (it.getFreight() != null) acc = acc.add(it.getFreight());
        }
        return acc;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        return id.equals(((Order)o).id);
    }
    @Override public int hashCode() { return Objects.hash(id); }
    @Override public String toString() { return "Order{" + id + "}"; }

    public static final class Builder {
        private final String id;
        private final String customerId;
        private OrderStatus status;
        private Instant purchasedAt;
        private Instant approvedAt;
        private Instant deliveredCarrierAt;
        private Instant deliveredCustomerAt;
        private Instant estimatedDeliveryAt;
        private List<OrderItem> items = new ArrayList<>();
        private List<Payment> payments = new ArrayList<>();

        private Builder(String id, String customerId) {
            this.id = id;
            this.customerId = customerId;
        }

        public Builder status(OrderStatus v) { this.status = v; return this; }
        public Builder purchasedAt(Instant v) { this.purchasedAt = v; return this; }
        public Builder approvedAt(Instant v) { this.approvedAt = v; return this; }
        public Builder deliveredCarrierAt(Instant v) { this.deliveredCarrierAt = v; return this; }
        public Builder deliveredCustomerAt(Instant v) { this.deliveredCustomerAt = v; return this; }
        public Builder estimatedDeliveryAt(Instant v) { this.estimatedDeliveryAt = v; return this; }
        public Builder addItem(OrderItem item) { this.items.add(item); return this; }
        public Builder addPayment(Payment payment) { this.payments.add(payment); return this; }

        public Order build() { return new Order(this); }
    }
}
