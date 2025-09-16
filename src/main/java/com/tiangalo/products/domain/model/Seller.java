package com.tiangalo.products.domain.model;

import java.util.Objects;

public final class Seller {
    private final String id;        // seller_id
    private final Address address;

    public Seller(String id, Address address) {
        this.id = Objects.requireNonNull(id, "id");
        this.address = address;
    }

    public String getId() { return id; }
    public Address getAddress() { return address; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller)) return false;
        return id.equals(((Seller)o).id);
    }
    @Override public int hashCode() { return Objects.hash(id); }
    @Override public String toString() { return "Seller{" + id + "}"; }
}
