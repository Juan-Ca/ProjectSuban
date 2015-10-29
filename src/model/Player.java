package model;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/



// line 8 "model.ump"
// line 63 "model.ump"
public class Player
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static int nextId = 1;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Player Attributes
  private String name;
  private int number;
  private int shotsOnGoal;
  private int goals;
  private int penalties;

  //Autounique Attributes
  private int id;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Player(String aName, int aNumber, int aShotsOnGoal, int aGoals, int aPenalties)
  {
    name = aName;
    number = aNumber;
    shotsOnGoal = aShotsOnGoal;
    goals = aGoals;
    penalties = aPenalties;
    id = nextId++;
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

  public boolean setNumber(int aNumber)
  {
    boolean wasSet = false;
    number = aNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setShotsOnGoal(int aShotsOnGoal)
  {
    boolean wasSet = false;
    shotsOnGoal = aShotsOnGoal;
    wasSet = true;
    return wasSet;
  }

  public boolean setGoals(int aGoals)
  {
    boolean wasSet = false;
    goals = aGoals;
    wasSet = true;
    return wasSet;
  }

  public boolean setPenalties(int aPenalties)
  {
    boolean wasSet = false;
    penalties = aPenalties;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public int getNumber()
  {
    return number;
  }

  public int getShotsOnGoal()
  {
    return shotsOnGoal;
  }

  public int getGoals()
  {
    return goals;
  }

  public int getPenalties()
  {
    return penalties;
  }

  public int getId()
  {
    return id;
  }

  public void delete()
  {}


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "name" + ":" + getName()+ "," +
            "number" + ":" + getNumber()+ "," +
            "shotsOnGoal" + ":" + getShotsOnGoal()+ "," +
            "goals" + ":" + getGoals()+ "," +
            "penalties" + ":" + getPenalties()+ "]"
     + outputString;
  }
}