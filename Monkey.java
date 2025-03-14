public class Monkey extends Animal{
    EasySound voice = new EasySound("mixkit-cartoon-monkey-applause-103.wav");
    
    public Monkey(String m)
    {
        super(m);
    }
    
    @Override
    public String eat(){
        return "Banannaanna";
    }
    
    @Override
    public String speak()
    {
        voice.play();
        return "oopoh aaaah";
    }
}
