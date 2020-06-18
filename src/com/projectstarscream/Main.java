package com.projectstarscream;

public class Main {

    public static void main(String[] args) {
	var dimensions = new Dimensions(60, 10);
	var tileSize = new TileSize(12,24);

	var totalArea = dimensions.getSquareFeet();
	var totalSize = tileSize.getTileSize();
	var tilesNeeded = tileSize.amountOfTilesNeeded();

        System.out.println(totalArea);
        System.out.println(totalSize);
        System.out.println(tilesNeeded);
    }
}
