public class Farmer extends Actor
{
    private Actor actor;
  
    public Farmer()
    {
        actor.actorType = ActorType.Farmer.toString();
    }
    
    public void move()
    {
        Location newLocation = Field.freeAdjacentLocation();
    }
}
