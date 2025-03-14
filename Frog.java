public class Frog extends Animal
{
    public Frog (String n)
    {
        super(n);

    }

    @Override
    public String speak()
    {
        return "ribbit ribbit";
    }

    @Override
    public String eat()
    {
        return "ate a flying walk 🪰";
    }

    public String pooped()
    {
        return "The frog pooped!";
    }

}
