public class Animal
{
    String name;

    public Animal (String n)
    {
        name = n;
    }

    public Animal ()
    {
    }

    public String speak ()
    {
        return "[animal sound]";
    }

    public String eat ()
    {
        return "Yum!!";
    }

    public String getName() {
        return name;
    }

    public String toString()
    {
        String str;
        if (name == null)
        {
            str = "An animal with no name 😭  ";
        }
        else
        {
            str = name + " is an Animal!  ";
        }
        str += speak() + "  " + eat();
        return str;
    }
}
