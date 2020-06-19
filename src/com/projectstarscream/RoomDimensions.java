package com.projectstarscream;

public class RoomDimensions  {
   private int width;
   private int length;
   public String roomType;



    public int roomSqFeet() {
        double wasteMaterial = .15;
        int extraMaterial = (int) ((int) (length * width) * wasteMaterial);
        return extraMaterial + (width * length);
    }


    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
