package com.tiangalo.products.domain.model;

import java.util.Objects;

public final class Payment {
    private final String orderId;
    private final int sequential;
    private final PaymentType type;
    private final int installments;
    private final Money value;

    public Payment(String orderId, int sequential, PaymentType type, int installments, Money value) {
        this.orderId = Objects.requireNonNull(orderId, "orderId");
        this.sequential = sequential;
        this.type = type != null ? type : PaymentType.NOT_DEFINED;
        this.installments = Math.max(installments, 0);
        this.value = value;
    }

    public String getOrderId() { return orderId; }
    public int getSequential() { return sequential; }
    public PaymentType getType() { return type; }
    public int getInstallments() { return installments; }
    public Money getValue() { return value; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;
        Payment other = (Payment) o;
        return sequential == other.sequential && orderId.equals(other.orderId);
    }
    @Override public int hashCode() { return Objects.hash(orderId, sequential); }
    @Override public String toString() { return "Payment{" + orderId + "#" + sequential + "}"; }
}
