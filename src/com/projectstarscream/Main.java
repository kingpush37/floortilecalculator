package com.projectstarscream;

public class Main {

    public static void main(String[] args) {

	var bedroomDimensions = new RoomDimensions();
	bedroomDimensions.setWidth(60);
	bedroomDimensions.setLength(10);
	var totalRoomArea = bedroomDimensions.roomSqFeet();

	var tileDimensions = new TileSize();
	tileDimensions.setTileWidth(12);
	tileDimensions.setTileLength(24);
	tileDimensions.setPriceOfTile(1.99);
	var totalTileArea = tileDimensions.getTileSqInches();



	var tilesNeeded = tileDimensions.amountOfTilesNeeded(totalRoomArea);
	var totalCost = tileDimensions.totalCostOfTiles(tilesNeeded);

        System.out.println("Total Area of Bedroom: " + totalRoomArea);
        System.out.println("Tile total Square Inches: " + totalTileArea);
        System.out.println("Amount of tiles needed: " + tilesNeeded);
		System.out.println(totalCost);
    }
}
