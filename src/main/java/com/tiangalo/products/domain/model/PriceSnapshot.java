package com.tiangalo.products.domain.model;

import java.time.LocalDate;

public class PriceSnapshot {

    private Product product_id;
    private String currency;
    private Long min_price;
    private Long median_price;
    private Long max_price;
    private Long avg_price;
    private Long sample_size;
    private LocalDate as_of;

    public PriceSnapshot(Product product_id, String currency, Long min_price, Long median_price, Long max_price,
            Long avg_price, Long sample_size, LocalDate as_of) {
        this.product_id = product_id;
        this.currency = currency;
        this.min_price = min_price;
        this.median_price = median_price;
        this.max_price = max_price;
        this.avg_price = avg_price;
        this.sample_size = sample_size;
        this.as_of = as_of;
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getMin_price() {
        return min_price;
    }

    public void setMin_price(Long min_price) {
        this.min_price = min_price;
    }

    public Long getMedian_price() {
        return median_price;
    }

    public void setMedian_price(Long median_price) {
        this.median_price = median_price;
    }

    public Long getMax_price() {
        return max_price;
    }

    public void setMax_price(Long max_price) {
        this.max_price = max_price;
    }

    public Long getAvg_price() {
        return avg_price;
    }

    public void setAvg_price(Long avg_price) {
        this.avg_price = avg_price;
    }

    public Long getSample_size() {
        return sample_size;
    }

    public void setSample_size(Long sample_size) {
        this.sample_size = sample_size;
    }

    public LocalDate getAs_of() {
        return as_of;
    }

    public void setAs_of(LocalDate as_of) {
        this.as_of = as_of;
    }

    
    
}
