public class Snake extends Animal {
    EasySound voice = new EasySound("snake.wav");
    
    public Snake(String s) {
        super(s);
    }

    @Override
    public String eat() {
        return "Ate a mouse! Yum!";
    }

    @Override
    public String speak() {
        return "Hissssssss...";
    }

    @Override
    public String toString() {
        String str = "";
        str += "Hi! I'm a Snake named " + getName() + "! ";
        voice.play();
        str += speak() + " " + eat();
        return str;
    }
}
