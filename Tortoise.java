/**
 * The  class Tortoise includes a constructor for pace
 * and a unique move method that moves at a slow & steady
 * pace. The getPace() and setPace() methods allow the
 * use to view and change the move increments.
 * 
 * @author Ryan Kim
 * @version 2026.4.16
 */

public class Tortoise extends AbstractRacer
{
    private int pace;
    /**
     * Constructor for the Tortoise class
     */
    public Tortoise(int pace)
    {
        super("Tortoise");
        this.pace = pace;
    }

    /**
     * Constructor for the Tortoise class
     */
    public Tortoise()
    {
        super("Tortoise");
        this.pace = 1;
    }

    /**
     * the move method for the tortoise moves the tortoise forward
     * The tortoise moves at the rate of one pace per move
     */
    public void move()
    {
        super.setPosition(getPosition()+pace);;
    }

    /**
     * the getPace method returns the pace of the turle
     * @return the pace the turtle moves at
     */
    public int getPace()
    {
        return pace;
    }

    /**
     * The method setPace sets the pace to a new pace
     * @param newPace the new pace to move at
     */
    public void setPace(int newPace)
    {
        pace = newPace;
    }
}