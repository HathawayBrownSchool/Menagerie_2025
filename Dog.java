public class Dog extends Animal
{
    EasySound voice = new EasySound("two_dogs_barking_9LS.wav");
    EasySound bark = new EasySound("BEEPING_ELECTRONICALLY_AND_DOG_BARK_lrX.wav");
    
    public Dog (String name)
    {
        super(name);
    }

    public String speak()
    {
        voice.play();
        bark.play();
        return "roof";
    }

    public String eat()
    {
        return "food";
    }

}

