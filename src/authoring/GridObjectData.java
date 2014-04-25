package authoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.Constants;

public class GridObjectData {

	protected String myImage;
	protected int width;
	protected int height;

	private int myX;
	private int myY;
	private List<Item> itemList=new ArrayList<Item>();
	private String myID;
	private List<Object> myArguments = new ArrayList<Object>();
	
	// BarrierData
	public GridObjectData(int x, int y, String image, String id) {
		myID = id;
		myX = x;
		myY = y;
		
		myArguments.add(1);
		myArguments.add(1);
		myArguments.add(Constants.GRIDOBJECTPATH+image);
	}
	
	// DoorData
	public GridObjectData(int x, int y, String image, int toX, int toY, String toMap, String id) {
		myID = id;
		myX = x;
		myY = y;

		myArguments.add(1);
		myArguments.add(1);
		myArguments.add(Constants.GRIDOBJECTPATH+image);
		myArguments.add(toX);
		myArguments.add(toY);
		myArguments.add(toMap);
	}
	
	// EnemyData
	public GridObjectData(int x, int y, String image, String name, Map<String,Integer> startVals, String[] weps, int movement, String id) {
		myID = id;
		myX = x;
		myY = y;
		
		myArguments.add(1);
		myArguments.add(1);
		myArguments.add(Constants.GRIDOBJECTPATH+image);
		myArguments.add(name);
		myArguments.add(startVals);
		myArguments.add(weps);
		myArguments.add(movement);
	}
	
	// NPCData
	public GridObjectData(int x, int y, String image, NPCResponseNode root, String id) {
		myID = id;
		myX = x;
		myY = y;
		
		myArguments.add(1);
		myArguments.add(1);
		myArguments.add(new String[] {Constants.GRIDOBJECTPATH+image, Constants.GRIDOBJECTPATH+image, Constants.GRIDOBJECTPATH+image, Constants.GRIDOBJECTPATH+image});
//		myArguments.add(Constants.GRIDOBJECTPATH+image);
		myArguments.add(root);
	}

    // Base empty constructor
    public GridObjectData() {
    }

    public void init(){
		FeatureManager.getWorldData().getCurrentMap().getTileData(width,height).addGridObjectData(this);
	}
	
	public String getID() {
		return myID;
	}

	public String getImageName(){
		return myImage;
	}
	public int getX(){
		return myX;
	}
	public int getY(){
		return myY;
	}
	public void addItem(Item i){
		
	}
	
	public List<Object> getArguments(){
		return myArguments;
	}
}
