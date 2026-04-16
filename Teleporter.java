/**
 * The  class Teleporter includes a constructor for pace
 * and a unique move method that moves at a slow & steady
 * pace, but has a chance of teleporting either forwards or
 * backwards.
 * 
 * @author Ryan Kim
 * @version 2026.4.16
 */
public class Teleporter extends AbstractRacer
{

    final int SCALE = 10;//changes the probability of moving and the amount of movement
    /**
     * Constructor for the Tortoise class
     */
    public Teleporter()
    {
        super("Teleporter");
    }

    /**
     * the move method for the teleporter moves the teleporter forward
     * The hare has a 1/3 chance of moving 3 positions, if not, it stays still
     */
    public void move()
    {
        int rand = (int) Math.random()*SCALE/5;//determines whether or not it teleports; 1 in SCALE chance of teleporting
        int dir = (int) Math.random()*2;//0 means moves forward, 1 means backwards
        if (rand == 0)
        {
            if (dir==0)
            {
                super.setPosition(getPosition()+SCALE);
            }
            else{
                super.setPosition(getPosition()-SCALE);
            }
        }
        else{
            super.setPosition(getPosition()+1);
        }
    }
}