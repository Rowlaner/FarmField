public class Farmer 
{
    private Actor actor;
  
    public Farmer()
    {
        actor.actorType = ActorType.Farmer.ToString();
    }
    
    public void move()
    {
        Location newLocation = Field.freeAdjacentLocation();
    }
}
