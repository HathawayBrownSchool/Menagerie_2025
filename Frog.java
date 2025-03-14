public class Frog extends Animal
{
    EasySound frogVoice = new EasySound("frogs.wav");
    EasySound flyVoice = new EasySound("fly.wav");
    
    public Frog (String n)
    {
        super(n);

    }

    @Override
    public String speak()
    {
        frogVoice.play();
        return "ribbit ribbit";
    }

    @Override
    public String eat()
    {
        flyVoice.play();
        return "ate a flying walk 🪰";
    }

    public String pooped()
    {
        return "The frog pooped!";
    }

}
