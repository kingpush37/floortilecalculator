package com.projectstarscream;

public class Dimensions {
   private int width;
   private int length;
   private double wasteMaterial = .15;

    public Dimensions(int width, int length) {
        this.width = width;
        this.length = length;
    }

    int getSquareFeet() {
        int extraMaterial = (int) ((int) (length * width) * wasteMaterial);
        return extraMaterial + (width * length);
    }

}
