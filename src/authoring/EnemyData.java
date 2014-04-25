package authoring;

import java.util.List;
import java.util.Map;

import Data.FileLister;
import util.Constants;

/**
 * Created by Prit on 4/19/14.
 */
public class EnemyData extends GridObjectData {

    private Map<String,Integer> myValues;
    private String[] myWeapons;
    private String myName;
    private int myMovement;
    private String[] myImages;
    
    public EnemyData(int x, int y, String image, String name, Map<String,Integer> startVals, String[] weps, int movement) {
    	super(x, y, image, name, startVals, weps, movement, Constants.ENEMY);

        myName = name;
        myValues = startVals;
        myWeapons = weps;
        myMovement = movement;
        myImages=createSpriteImages();
    }
    private String[] createSpriteImages(){
    	FileLister f=new FileLister();
        List<String> list=f.getFileList("src/PlayerImages/Ash");
        String[] im=new String[list.size()];
        int i=0;
        for(String s: list){
        	System.out.println(s);
        	im[i]=s;
        	i++;
        }
       return im;
    }
    /*
    public EnemyData() {
        myMovement=Integer.parseInt(null);
    }
*/
    //accomodate Random Enemy constructor
    public EnemyData(int x, int y, String image, String name, Map<String, Integer> startVals, String[] weps) {}

    public String getMyName(){return myName;}
    public Map<String,Integer> getMyValues(){return myValues;}
    public String[] getMyWeapons(){return myWeapons;}
    public int getMyMovement(){return myMovement;}
    public void setImages(String[] images){
    	myImages=images;
    }
    public String[] getImages(){
    	return myImages;
    }
}