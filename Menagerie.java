import java.util.ArrayList;

public class Menagerie
{

    public static void main (String[] args)
    {
        Animal f1 = new Frog ("Froggy");
        Animal f2 = new Animal("Bubba");
        Frog f3 = new Frog("Fish");
        // Frog f4 = new Animal("Theo James");
        // f1.pooped();
        // f2.pooped();
        System.out.println("\n" + f1.eat() + "\n");

        f3.pooped();
        f1 = new Monkey("Bananas");
        f2 = new Dog("fido");
        //f3 = new Snake("Sylvester");


        ArrayList <Animal> zoo = new ArrayList<Animal>();

        zoo.add(new Animal());
        zoo.add(new Animal("Poppy"));
        zoo.add(new Frog("Jessie with a Y"));
        zoo.add(new Snake("Bubbles"));
        zoo.add(new Chinchilladae("Pooper"));
        zoo.add(new Monkey("Tom"));
        zoo.add(new Dog("Tomas"));
        zoo.add(new Chicken("Clucky McCluckster"));

        for (Animal a : zoo)
        {
            System.out.println(a);
        }
    }


}
