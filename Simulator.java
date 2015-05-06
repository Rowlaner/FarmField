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
  
  // give each actor a random starting point
  public void Populate()
  {
    TODO..
  }
  
  // iterates of populations of bean plants, weeds and farmers
  public void SimulateOneStep(Field field, Field updateField)
  {
    TODO...
  }
}
