public class Tortoise extends AbstractRacer
{
    /**
     * Constructor for the Tortoise class
     */
    public Tortoise()
    {
        super("Tortoise");
    }

    /**
     * the move method for the tortoise moves the tortoise forward
     * The tortoise moves slowly at a rate of one unit per move
     */
    public void move()
    {
        super.setPosition(getPosition()+1);;
    }
}