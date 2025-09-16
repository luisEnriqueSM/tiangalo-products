package com.tiangalo.products.domain.model;

import java.time.LocalDate;

public class ProductStats {

    private Product product_id;
    private Long order_count;
    private LocalDate first_order_at;
    private LocalDate last_order_at;
    private Long rating_avg;
    private Long rating_cout;
    private Long popularity_score;
    private LocalDate as_of;
    
    public ProductStats(Product product_id, Long order_count, LocalDate first_order_at, LocalDate last_order_at,
            Long rating_avg, Long rating_cout, Long popularity_score, LocalDate as_of) {
        this.product_id = product_id;
        this.order_count = order_count;
        this.first_order_at = first_order_at;
        this.last_order_at = last_order_at;
        this.rating_avg = rating_avg;
        this.rating_cout = rating_cout;
        this.popularity_score = popularity_score;
        this.as_of = as_of;
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    public Long getOrder_count() {
        return order_count;
    }

    public void setOrder_count(Long order_count) {
        this.order_count = order_count;
    }

    public LocalDate getFirst_order_at() {
        return first_order_at;
    }

    public void setFirst_order_at(LocalDate first_order_at) {
        this.first_order_at = first_order_at;
    }

    public LocalDate getLast_order_at() {
        return last_order_at;
    }

    public void setLast_order_at(LocalDate last_order_at) {
        this.last_order_at = last_order_at;
    }

    public Long getRating_avg() {
        return rating_avg;
    }

    public void setRating_avg(Long rating_avg) {
        this.rating_avg = rating_avg;
    }

    public Long getRating_cout() {
        return rating_cout;
    }

    public void setRating_cout(Long rating_cout) {
        this.rating_cout = rating_cout;
    }

    public Long getPopularity_score() {
        return popularity_score;
    }

    public void setPopularity_score(Long popularity_score) {
        this.popularity_score = popularity_score;
    }

    public LocalDate getAs_of() {
        return as_of;
    }

    public void setAs_of(LocalDate as_of) {
        this.as_of = as_of;
    }

    
}
