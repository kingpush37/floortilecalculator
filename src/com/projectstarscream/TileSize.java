package com.projectstarscream;


public class TileSize extends RoomDimensions  {
    private int tileWidth;
    private int tileLength;
    private double priceOfTile;
    private int oneSqFtInInches = 144;


    int getTileSqInches() {

        return (tileLength * tileWidth);
    }

    int amountOfTilesNeeded(int tiles) {
        int totalSqInch = getTileSqInches();
        int tileSqFt = totalSqInch / oneSqFtInInches;
        return tiles / tileSqFt;
    }

    double totalCostOfTiles(int totalTiles) {

        return totalTiles * priceOfTile;
    }

    public void setTileWidth(int tileWidth) {

        this.tileWidth = tileWidth;
    }

    public void setTileLength(int tileLength) {

        this.tileLength = tileLength;
    }


    public void setPriceOfTile(double priceOfTile) {

        this.priceOfTile = priceOfTile;
    }
}
