package com.projectstarscream;

public class TileSize extends Dimensions {
    private int width;
    private int length;
    private int oneSqFtInInches = 144;


    public TileSize(int width, int length) {
        //TODO research inheritance
        super(60,10);
        this.width = width;
        this.length = length;
    }

    int getTileSize() {
        return (length * width);
    }

    int amountOfTilesNeeded() {
        int totalSqInch = getTileSize();
        int tileSqFt = totalSqInch / oneSqFtInInches;
        int roomSquareFeet = getSquareFeet();
        return roomSquareFeet / tileSqFt;
    }

    //TODO make material cost method

}
