import java.util.ArrayList;

public class Race
{
    private ArrayList<AbstractRacer> racers;
    private int trackLength;

    public Race(int trackLength)
    {
        this.trackLength = trackLength;
        racers = new ArrayList<>();
    }

    public void addRacer(AbstractRacer r)
    {
        racers.add(r);
    }

    public boolean checkWin(AbstractRacer r)
    {
        return (r.getPosition()==trackLength);
    }

    public boolean nextMove()
    {
        for (AbstractRacer r : racers)
        {
            r.move();
            if (checkWin(r))
            {
                return true;
            }
        }
        return false;

    }

}