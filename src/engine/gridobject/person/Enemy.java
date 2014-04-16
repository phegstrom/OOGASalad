package engine.gridobject.person;

import engine.ProximityChecker;
import engine.world.ArenaWorld;



public class Enemy extends NPC {
	private boolean battleOnSight=false;
	private boolean battleInitiated=false;
	private ArenaWorld myWorld;

	public Enemy(String[] animImages, double speed, int numTilesWidth, int numTilesHeight, int movementType, Player player) {
		super(animImages,speed, numTilesWidth, numTilesHeight,movementType,player);
	}
	
	public void setWorld(ArenaWorld world){
		myWorld = world;
	}
	
	public ArenaWorld getWorld(){
		return myWorld;
	}

	public void doBattleOnSight(){
		battleOnSight=true;
	}

	public boolean isBattle(){
		battleInitiatedOnSight();
		return battleInitiated;
	}

	public void battleInitiatedOnSight(){
		if(battleOnSight && inSight()){	
			doAction();
		}
	}

	@Override 
	public void doAction(){
		doDialogue();
		battleInitiated=true;
	}

	public boolean inSight(){
		if(Math.abs(ProximityChecker.isLeftProximity(this, getPlayer()))<100 && 
				ProximityChecker.isTopProximity(this, getPlayer())<=2 && getFacing() == 1)
			return true;
		if(Math.abs(ProximityChecker.isRightProximity(this,  getPlayer()))<100 && 
				ProximityChecker.isRightProximity(this, getPlayer())>=-2 && getFacing()==3)
			return true;
		if(Math.abs(ProximityChecker.isTopProximity(this, getPlayer()))<100 && 
				ProximityChecker.isTopProximity(this, getPlayer())<=2 && getFacing()==2)
			return true;
		if(Math.abs(ProximityChecker.isBottomProximity(this, getPlayer()))<100 && 
				ProximityChecker.isTopProximity(this, getPlayer())>=-2 && getFacing()==0)
			return true;
		return false;
	}



}
