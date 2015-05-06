import java.util.ArrayList;

public class Simulator
{
  private ArrayList<Weeds> weeds;
  private ArrayList<BeanPlant> beanPlants;
  private ArrayList<Farmer> farmers;
  
  // Constructor for the Simulator class, it initialises the private arraylists of actors
  public Simulator()
  {
    weeds = new ArrayList<Weeds>();
    beanPlants = new ArrayList<BeanPlant>();
    farmers = new ArrayList<Farmer>();
  }
}
