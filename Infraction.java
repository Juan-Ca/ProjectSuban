/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/



// line 48 "model.ump"
// line 92 "model.ump"
public class Infraction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Infraction Attributes
  private boolean redCard;
  private boolean yellowCard;
  private boolean penaltyKick;

  //Infraction Associations
  private Player player;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Infraction(boolean aRedCard, boolean aYellowCard, boolean aPenaltyKick, Player aPlayer)
  {
    redCard = aRedCard;
    yellowCard = aYellowCard;
    penaltyKick = aPenaltyKick;
    if (!setPlayer(aPlayer))
    {
      throw new RuntimeException("Unable to create Infraction due to aPlayer");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRedCard(boolean aRedCard)
  {
    boolean wasSet = false;
    redCard = aRedCard;
    wasSet = true;
    return wasSet;
  }

  public boolean setYellowCard(boolean aYellowCard)
  {
    boolean wasSet = false;
    yellowCard = aYellowCard;
    wasSet = true;
    return wasSet;
  }

  public boolean setPenaltyKick(boolean aPenaltyKick)
  {
    boolean wasSet = false;
    penaltyKick = aPenaltyKick;
    wasSet = true;
    return wasSet;
  }

  public boolean getRedCard()
  {
    return redCard;
  }

  public boolean getYellowCard()
  {
    return yellowCard;
  }

  public boolean getPenaltyKick()
  {
    return penaltyKick;
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
            "redCard" + ":" + getRedCard()+ "," +
            "yellowCard" + ":" + getYellowCard()+ "," +
            "penaltyKick" + ":" + getPenaltyKick()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "player = "+(getPlayer()!=null?Integer.toHexString(System.identityHashCode(getPlayer())):"null")
     + outputString;
  }
}