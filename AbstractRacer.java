/**
 * The abstract class AbstractRacer is used to describe a participant
 * in a race. The abstract method move() is defined differently
 * according to each different subclass that inherits from Racer.
 * 
 * @author Ryan Kim & Conner Wang
 * @version 2026.4.14
 */



public abstract class AbstractRacer
{
    // instance variables
    private String name;
    private int position;
    /**
     * Constructs an object according to the subclass
     * that inherits from Racer. (You can't construct an
     * actual Racer object because it's abstract. Go ahead,
     * try it!)
     */
    public AbstractRacer(String name)
    {
        this.name = name;
        position = 0;
    }
    /**
     * The abstract method move() must be defined by
     * subclasses.
     */
    public abstract void move();
    /**
     * Overrides the toString method
     */
    public String toString()
    {
    // to be completed
        return "";
    }
    /**
     * The getPosition() method returns the current position
     * of the racer.
     */

    // to be completed
    /**
     * The setPosition() method takes a parameter specifying the
     * next position and mutates position to that specified location.
     */

    // to be completed

}