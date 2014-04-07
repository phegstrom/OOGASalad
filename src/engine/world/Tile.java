package engine.world;

import java.awt.Graphics2D;
import java.awt.Image;

import engine.gridobject.GridObject;

public class Tile {


	private int mySize;
	private int myX;
	private int myY;
	private GridObject myObject;
	private Image myImage;


	/**
	 * Instantiates a new tile.
	 *
	 * @param width the width
	 * @param height the height
	 */
	public Tile(int size, int x, int y) {
		mySize = size;
		myX = x;
		myY=y;
	}
	
	
	/**
	 * Sets the tile object.
	 *
	 * @param sprite the new tile object
	 */
	public void setTileObject(GridObject obj){
		myObject = obj;
		obj.setPosition(myX, myY);
		obj.setSize(mySize*obj.getNumTiles()[0], mySize*obj.getNumTiles()[1]);
		obj.setImage(obj.getImageFile());
		
	}
	
	public int[] getPosition(){
		return new int[] {myX,myY};
	}
	
	public void paint(Graphics2D g) {
		g.drawImage(myImage, myX, myY, null);
	}
	
	
	

}
