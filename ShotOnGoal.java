/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/



// line 30 "model.ump"
// line 79 "model.ump"
public class ShotOnGoal
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ShotOnGoal Attributes
  private boolean goal;

  //ShotOnGoal Associations
  private Player suban;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ShotOnGoal(boolean aGoal, Player aSuban)
  {
    goal = aGoal;
    if (!setSuban(aSuban))
    {
      throw new RuntimeException("Unable to create ShotOnGoal due to aSuban");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setGoal(boolean aGoal)
  {
    boolean wasSet = false;
    goal = aGoal;
    wasSet = true;
    return wasSet;
  }

  public boolean getGoal()
  {
    return goal;
  }

  public Player getSuban()
  {
    return suban;
  }

  public boolean setSuban(Player aNewSuban)
  {
    boolean wasSet = false;
    if (aNewSuban != null)
    {
      suban = aNewSuban;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    suban = null;
  }


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "goal" + ":" + getGoal()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "suban = "+(getSuban()!=null?Integer.toHexString(System.identityHashCode(getSuban())):"null")
     + outputString;
  }
}