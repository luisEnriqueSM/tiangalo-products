package com.tiangalo.products.domain.model;

public enum PaymentType {
    CREDIT_CARD, BOLETO, VOUCHER, DEBIT_CARD, NOT_DEFINED;

    public static PaymentType fromRaw(String raw) {
        if (raw == null) return NOT_DEFINED;
        switch (raw.trim().toLowerCase()) {
            case "credit_card": return CREDIT_CARD;
            case "boleto": return BOLETO;
            case "voucher": return VOUCHER;
            case "debit_card": return DEBIT_CARD;
            default: return NOT_DEFINED;
        }
    }
}
