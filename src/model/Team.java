/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/

package model;
import java.util.*;

// line 38 "../model.ump"
// line 85 "../model.ump"
public class Team
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static int nextId = 1;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Team Attributes
  private String name;
  private int wins;
  private int losses;
  private int draws;
  private int points;
  private int rank;

  //Autounique Attributes
  private int id;

  //Team Associations
  private List<Player> players;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Team(String aName, int aWins, int aLosses, int aDraws, int aPoints, int aRank)
  {
    name = aName;
    wins = aWins;
    losses = aLosses;
    draws = aDraws;
    points = aPoints;
    rank = aRank;
    id = nextId++;
    players = new ArrayList<Player>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setWins(int aWins)
  {
    boolean wasSet = false;
    wins = aWins;
    wasSet = true;
    return wasSet;
  }

  public boolean setLosses(int aLosses)
  {
    boolean wasSet = false;
    losses = aLosses;
    wasSet = true;
    return wasSet;
  }

  public boolean setDraws(int aDraws)
  {
    boolean wasSet = false;
    draws = aDraws;
    wasSet = true;
    return wasSet;
  }

  public boolean setPoints(int aPoints)
  {
    boolean wasSet = false;
    points = aPoints;
    wasSet = true;
    return wasSet;
  }

  public boolean setRank(int aRank)
  {
    boolean wasSet = false;
    rank = aRank;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public int getWins()
  {
    return wins;
  }

  public int getLosses()
  {
    return losses;
  }

  public int getDraws()
  {
    return draws;
  }

  public int getPoints()
  {
    return points;
  }

  public int getRank()
  {
    return rank;
  }

  public int getId()
  {
    return id;
  }

  public Player getPlayer(int index)
  {
    Player aPlayer = players.get(index);
    return aPlayer;
  }

  public List<Player> getPlayers()
  {
    List<Player> newPlayers = Collections.unmodifiableList(players);
    return newPlayers;
  }

  public int numberOfPlayers()
  {
    int number = players.size();
    return number;
  }

  public boolean hasPlayers()
  {
    boolean has = players.size() > 0;
    return has;
  }

  public int indexOfPlayer(Player aPlayer)
  {
    int index = players.indexOf(aPlayer);
    return index;
  }

  public static int minimumNumberOfPlayers()
  {
    return 0;
  }

  public boolean addPlayer(Player aPlayer)
  {
    boolean wasAdded = false;
    if (players.contains(aPlayer)) { return false; }
    players.add(aPlayer);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePlayer(Player aPlayer)
  {
    boolean wasRemoved = false;
    if (players.contains(aPlayer))
    {
      players.remove(aPlayer);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addPlayerAt(Player aPlayer, int index)
  {  
    boolean wasAdded = false;
    if(addPlayer(aPlayer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPlayers()) { index = numberOfPlayers() - 1; }
      players.remove(aPlayer);
      players.add(index, aPlayer);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePlayerAt(Player aPlayer, int index)
  {
    boolean wasAdded = false;
    if(players.contains(aPlayer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPlayers()) { index = numberOfPlayers() - 1; }
      players.remove(aPlayer);
      players.add(index, aPlayer);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPlayerAt(aPlayer, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    players.clear();
  }


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "name" + ":" + getName()+ "," +
            "wins" + ":" + getWins()+ "," +
            "losses" + ":" + getLosses()+ "," +
            "draws" + ":" + getDraws()+ "," +
            "points" + ":" + getPoints()+ "," +
            "rank" + ":" + getRank()+ "]"
     + outputString;
  }
}