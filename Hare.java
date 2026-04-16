public class Hare extends AbstractRacer
{

    final int SCALE = 5;//changes the probability of moving and the amount of movement
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
        int rand = (int) Math.random()*SCALE;
        if (rand == 0)
        {
            super.setPosition(getPosition()+SCALE);
        }
    }
}