public class Chinchilladae extends Animal
{
    EasySound voice = new EasySound("wook.wav");
    
    public Chinchilladae (String r)
    {
        super(r);
    }

    public String speak()
    {
        voice.play();
        return "wook";
    }

    public String eat()
    {
        return "dogs";
    }



}
