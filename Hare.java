/**
 * The  class Hare includes a constructor for pace and energy
 * and a unique move method that moves at a fast pace that
 * requires breaks to recharge.
 * 
 * @author Ryan Kim
 * @version 2026.4.16
 */

public class Hare extends AbstractRacer
{
    private int energy;
    final int MAX_ENERGY = 12;
    int rand;//movement size
    /**
     * Constructor for the Tortoise class
     */
    public Hare()
    {
        super("Hare");
        energy = (int) Math.random()*10;
        rand = 0;
    }

    /**
     * the move method for the hare moves the hare forward
     * The hare has a 1/3 chance of moving 3 positions, if not, it stays still
     */
    public void move()
    {

        if (energy>0)
        {
            
            rand = (int) Math.random()*energy+1;
            super.setPosition(getPosition()+rand);
            energy-=rand;
        }
        else{
            if (Math.random()<0.4)
            {
                energy = MAX_ENERGY;
            }
        }
    }
}