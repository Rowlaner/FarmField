public class Actor
{
  private int age;
  private boolean alive = true;
  private string actorType;
  
  // (row, column)
  private Location location;
  
  // must be < 1
  // the range is a decimal from 0 to 1 in 0.1 increments
  private int creationProbability;

  // the various types of actors within the system.
  public enum ActorType
  {
    BeanPlant,
    Weed,
    Farmer
  }
  
  // updates the alive indicator for weeds and beanplant
  public void UpdateActorAliveStatus(boolean newStatus)
  {
    if(actorType == "BeanPlant" || actorType == "Weed")
    {
      alive = newStatus;  
    }
  }
}
