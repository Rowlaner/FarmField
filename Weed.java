public class Weed extends Actor
{
  // the age at which the Weed can begin spreading.
  private static final int weedSpreadingAge = 20;
  
  private Actor actor;
  
  public Weed()
  {
    actor.actorType = ActorType.Weed.ToString();
  }
}
