package com.tiangalo.products.domain.model;

import java.util.Objects;

public final class Customer {
    private final String id;            // customer_id
    private final String uniqueId;      // customer_unique_id (can be same across multiple addresses)
    private final Address address;

    public Customer(String id, String uniqueId, Address address) {
        this.id = Objects.requireNonNull(id, "id");
        this.uniqueId = uniqueId;
        this.address = address;
    }

    public String getId() { return id; }
    public String getUniqueId() { return uniqueId; }
    public Address getAddress() { return address; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        return id.equals(((Customer)o).id);
    }
    @Override public int hashCode() { return Objects.hash(id); }
    @Override public String toString() { return "Customer{" + id + "}"; }
}
