package com.projectstarscream;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);


	// Enter Room Dimensions
	var bedroomDimensions = new RoomDimensions();

	System.out.print("Enter Room Type: ");
	var roomType = scanner.next();

	System.out.print("Enter Floor Width: ");
	var width = scanner.nextInt();
	bedroomDimensions.setWidth(width);

	System.out.print("Enter Floor Length: ");
	var length = scanner.nextInt();
	bedroomDimensions.setLength(length);
	var totalRoomArea = bedroomDimensions.roomSqFeet();

// Enter Title Dimensions
	var tileDimensions = new TileSize();

	System.out.print("Enter Tile Width: ");
	var tileWidth = scanner.nextInt();
	tileDimensions.setTileWidth(tileWidth);

	System.out.print("Enter Tile Length: ");
	var tileLength = scanner.nextInt();
	tileDimensions.setTileLength(tileLength);

	System.out.print("Enter Tile Price: ");
	var tilePrice = scanner.nextDouble();
	tileDimensions.setPriceOfTile(tilePrice);


	var tilesNeeded = tileDimensions.amountOfTilesNeeded(totalRoomArea);
	var totalCost = tileDimensions.totalCostOfTiles(tilesNeeded);

		System.out.println("---------------------------");
		System.out.println("Calculating...");
		System.out.println("---------------------------");
		System.out.println(tilesNeeded + " Tiles Needed");
		System.out.println(totalCost + " Estimated Price");
		System.out.println("Your " + roomType.toUpperCase() + " has " + totalRoomArea + " total square feet.");
    }
}
