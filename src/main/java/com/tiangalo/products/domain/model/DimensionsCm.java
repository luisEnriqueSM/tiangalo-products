package com.tiangalo.products.domain.model;

import java.util.Objects;

public final class DimensionsCm {
    private final int length;
    private final int height;
    private final int width;

    private DimensionsCm(int length, int height, int width){
        if (length < 0 || height < 0 || width < 0) throw new IllegalArgumentException("Dimensiones negativas");
        this.length = length; this.height = height; this.width = width;
    }
    public static DimensionsCm of(int length, int height, int width){ return new DimensionsCm(length, height, width); }

    public int length(){ return length; }
    public int height(){ return height; }
    public int width(){ return width; }
    public long volumeCm3(){ return 1L * length * height * width; }

    @Override public boolean equals(Object o){
        if(!(o instanceof DimensionsCm that)) return false;
        return length==that.length && height==that.height && width==that.width;
    }
    @Override public int hashCode(){ return Objects.hash(length,height,width); }
    @Override public String toString(){ return length+"x"+height+"x"+width+" cm"; }
}
