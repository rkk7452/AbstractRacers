public class Tortoise extends AbstractRacer
{
    public Tortoise()
    {
        super("Tortoise");
    }

    public void move()
    {
        super.setPosition(getPosition()+1);;
    }
}