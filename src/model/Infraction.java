/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/

package model;

// line 50 "../model.ump"
// line 92 "../model.ump"
public class Infraction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Infraction Attributes
  private String type;

  //Infraction Associations
  private Player player;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Infraction(String aType, Player aPlayer)
  {
    type = aType;
    if (!setPlayer(aPlayer))
    {
      throw new RuntimeException("Unable to create Infraction due to aPlayer");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public String getType()
  {
    return type;
  }

  public Player getPlayer()
  {
    return player;
  }

  public boolean setPlayer(Player aNewPlayer)
  {
    boolean wasSet = false;
    if (aNewPlayer != null)
    {
      player = aNewPlayer;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    player = null;
  }


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "type" + ":" + getType()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "player = "+(getPlayer()!=null?Integer.toHexString(System.identityHashCode(getPlayer())):"null")
     + outputString;
  }
}