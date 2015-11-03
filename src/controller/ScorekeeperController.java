package controller;
import model.*;
public class ScorekeeperController extends ScrubController{

	private Game activeGame;
	
	public ScorekeeperController(){
		super();
		//TODO
	}
	

	public Game createGame(Team homeTeam, Team awayTeam){
		return new Game(0,0,false,false,false,-1,homeTeam, awayTeam);
		// TODO... this needed a game to return
	}
	
	public void registerShot(boolean goal, Player player){
		//TODO
	}
	
	public void registerInfraction(String type, Player player){
		//TODO
	}
	
	public void endGame(){
		//TODO
	}
	
	public void abortActiveGame(){
		//TODO
	}
	
	public void abortAndReturnToHome(){
		
	}
	
	
}
