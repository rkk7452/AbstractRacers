public class Hare extends AbstractRacer
{
    /**
     * Constructor for the Tortoise class
     */
    public Hare()
    {
        super("Hare");
    }

    /**
     * the move method for the hare moves the hare forward
     * The hare has a 1/3 chance of moving 3 positions, if not, it stays still
     */
    public void move()
    {
        int rand = (int) Math.random()*3;
        if (rand == 0)
        {
            super.setPosition(getPosition()+3);
        }
    }
}