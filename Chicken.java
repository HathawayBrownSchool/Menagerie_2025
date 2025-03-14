public class Chicken extends Animal {

  EasySound voice = new EasySound("chicken.wav");

  public Chicken(String name)
  {
      super(name);
  }

  // Overriding the toString method
  @Override
  public String toString()
  {
      return (getName() + " is a Chicken!" + speak());
  }
  
  // sound and text!
  @Override
  public String speak()
  {
      voice.play();
      return "cluck... cluck... cluckity cluck cluck!";
  }
}
