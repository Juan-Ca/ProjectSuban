/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/

package model;
import java.util.*;

// line 19 "../model.ump"
// line 69 "../model.ump"
public class Game
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Game Attributes
  private int team0Score;
  private int team1Score;
  private boolean isOver;
  private boolean isDraw;
  private boolean isUpdated;
  private int winner;

  //Game Associations
  private List<ShotOnGoal> shotsOnGoal;
  private List<Infraction> infractions;
  private List<Team> teams;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Game(int aTeam0Score, int aTeam1Score, boolean aIsOver, boolean aIsDraw, boolean aIsUpdated, int aWinner, Team... allTeams)
  {
    team0Score = aTeam0Score;
    team1Score = aTeam1Score;
    isOver = aIsOver;
    isDraw = aIsDraw;
    isUpdated = aIsUpdated;
    winner = aWinner;
    shotsOnGoal = new ArrayList<ShotOnGoal>();
    infractions = new ArrayList<Infraction>();
    teams = new ArrayList<Team>();
    boolean didAddTeams = setTeams(allTeams);
    if (!didAddTeams)
    {
      throw new RuntimeException("Unable to create Game, must have 2 teams");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTeam0Score(int aTeam0Score)
  {
    boolean wasSet = false;
    team0Score = aTeam0Score;
    wasSet = true;
    return wasSet;
  }

  public boolean setTeam1Score(int aTeam1Score)
  {
    boolean wasSet = false;
    team1Score = aTeam1Score;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsOver(boolean aIsOver)
  {
    boolean wasSet = false;
    isOver = aIsOver;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsDraw(boolean aIsDraw)
  {
    boolean wasSet = false;
    isDraw = aIsDraw;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsUpdated(boolean aIsUpdated)
  {
    boolean wasSet = false;
    isUpdated = aIsUpdated;
    wasSet = true;
    return wasSet;
  }

  public boolean setWinner(int aWinner)
  {
    boolean wasSet = false;
    winner = aWinner;
    wasSet = true;
    return wasSet;
  }

  public int getTeam0Score()
  {
    return team0Score;
  }

  public int getTeam1Score()
  {
    return team1Score;
  }

  public boolean getIsOver()
  {
    return isOver;
  }

  public boolean getIsDraw()
  {
    return isDraw;
  }

  public boolean getIsUpdated()
  {
    return isUpdated;
  }

  public int getWinner()
  {
    return winner;
  }

  public ShotOnGoal getShotsOnGoal(int index)
  {
    ShotOnGoal aShotsOnGoal = shotsOnGoal.get(index);
    return aShotsOnGoal;
  }

  public List<ShotOnGoal> getShotsOnGoal()
  {
    List<ShotOnGoal> newShotsOnGoal = Collections.unmodifiableList(shotsOnGoal);
    return newShotsOnGoal;
  }

  public int numberOfShotsOnGoal()
  {
    int number = shotsOnGoal.size();
    return number;
  }

  public boolean hasShotsOnGoal()
  {
    boolean has = shotsOnGoal.size() > 0;
    return has;
  }

  public int indexOfShotsOnGoal(ShotOnGoal aShotsOnGoal)
  {
    int index = shotsOnGoal.indexOf(aShotsOnGoal);
    return index;
  }

  public Infraction getInfraction(int index)
  {
    Infraction aInfraction = infractions.get(index);
    return aInfraction;
  }

  public List<Infraction> getInfractions()
  {
    List<Infraction> newInfractions = Collections.unmodifiableList(infractions);
    return newInfractions;
  }

  public int numberOfInfractions()
  {
    int number = infractions.size();
    return number;
  }

  public boolean hasInfractions()
  {
    boolean has = infractions.size() > 0;
    return has;
  }

  public int indexOfInfraction(Infraction aInfraction)
  {
    int index = infractions.indexOf(aInfraction);
    return index;
  }

  public Team getTeam(int index)
  {
    Team aTeam = teams.get(index);
    return aTeam;
  }

  public List<Team> getTeams()
  {
    List<Team> newTeams = Collections.unmodifiableList(teams);
    return newTeams;
  }

  public int numberOfTeams()
  {
    int number = teams.size();
    return number;
  }

  public boolean hasTeams()
  {
    boolean has = teams.size() > 0;
    return has;
  }

  public int indexOfTeam(Team aTeam)
  {
    int index = teams.indexOf(aTeam);
    return index;
  }

  public static int minimumNumberOfShotsOnGoal()
  {
    return 0;
  }

  public boolean addShotsOnGoal(ShotOnGoal aShotsOnGoal)
  {
    boolean wasAdded = false;
    if (shotsOnGoal.contains(aShotsOnGoal)) { return false; }
    shotsOnGoal.add(aShotsOnGoal);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeShotsOnGoal(ShotOnGoal aShotsOnGoal)
  {
    boolean wasRemoved = false;
    if (shotsOnGoal.contains(aShotsOnGoal))
    {
      shotsOnGoal.remove(aShotsOnGoal);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addShotsOnGoalAt(ShotOnGoal aShotsOnGoal, int index)
  {  
    boolean wasAdded = false;
    if(addShotsOnGoal(aShotsOnGoal))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfShotsOnGoal()) { index = numberOfShotsOnGoal() - 1; }
      shotsOnGoal.remove(aShotsOnGoal);
      shotsOnGoal.add(index, aShotsOnGoal);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveShotsOnGoalAt(ShotOnGoal aShotsOnGoal, int index)
  {
    boolean wasAdded = false;
    if(shotsOnGoal.contains(aShotsOnGoal))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfShotsOnGoal()) { index = numberOfShotsOnGoal() - 1; }
      shotsOnGoal.remove(aShotsOnGoal);
      shotsOnGoal.add(index, aShotsOnGoal);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addShotsOnGoalAt(aShotsOnGoal, index);
    }
    return wasAdded;
  }

  public static int minimumNumberOfInfractions()
  {
    return 0;
  }

  public boolean addInfraction(Infraction aInfraction)
  {
    boolean wasAdded = false;
    if (infractions.contains(aInfraction)) { return false; }
    infractions.add(aInfraction);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeInfraction(Infraction aInfraction)
  {
    boolean wasRemoved = false;
    if (infractions.contains(aInfraction))
    {
      infractions.remove(aInfraction);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addInfractionAt(Infraction aInfraction, int index)
  {  
    boolean wasAdded = false;
    if(addInfraction(aInfraction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInfractions()) { index = numberOfInfractions() - 1; }
      infractions.remove(aInfraction);
      infractions.add(index, aInfraction);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveInfractionAt(Infraction aInfraction, int index)
  {
    boolean wasAdded = false;
    if(infractions.contains(aInfraction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInfractions()) { index = numberOfInfractions() - 1; }
      infractions.remove(aInfraction);
      infractions.add(index, aInfraction);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addInfractionAt(aInfraction, index);
    }
    return wasAdded;
  }

  public static int requiredNumberOfTeams()
  {
    return 2;
  }

  public static int minimumNumberOfTeams()
  {
    return 2;
  }

  public static int maximumNumberOfTeams()
  {
    return 2;
  }

  public boolean setTeams(Team... newTeams)
  {
    boolean wasSet = false;
    ArrayList<Team> verifiedTeams = new ArrayList<Team>();
    for (Team aTeam : newTeams)
    {
      if (verifiedTeams.contains(aTeam))
      {
        continue;
      }
      verifiedTeams.add(aTeam);
    }

    if (verifiedTeams.size() != newTeams.length || verifiedTeams.size() != requiredNumberOfTeams())
    {
      return wasSet;
    }

    teams.clear();
    teams.addAll(verifiedTeams);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    shotsOnGoal.clear();
    infractions.clear();
    teams.clear();
  }


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "team0Score" + ":" + getTeam0Score()+ "," +
            "team1Score" + ":" + getTeam1Score()+ "," +
            "isOver" + ":" + getIsOver()+ "," +
            "isDraw" + ":" + getIsDraw()+ "," +
            "isUpdated" + ":" + getIsUpdated()+ "," +
            "winner" + ":" + getWinner()+ "]"
     + outputString;
  }
}