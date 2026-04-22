import java.util.ArrayList;

public class Race
{
    private ArrayList<AbstractRacer> racers;
    private int trackLength;
    private boolean finished;

    public Race(int trackLength)
    {
        this.trackLength = trackLength;
        racers = new ArrayList<>();
        finished = false;
    }

    public void addRacer(AbstractRacer r)
    {
        racers.add(r);
    }

    public AbstractRacer findWinner()
    {
        for (AbstractRacer r : racers)
        {
            if (r.getPosition()>=trackLength)
            {
                return r;
            }
        }
        return null;
    }

    public boolean checkWin(AbstractRacer r)
    {
        return (r.getPosition()==trackLength);
    }

    public void nextMove()
    {
        if (findWinner()==null)
        {
            for (AbstractRacer r : racers)
            {
                r.move();
                if (checkWin(r))
                {
                    finished = true;
                }
            }
        }
    }

    public String toString()
    {
        String s = "";
        for (AbstractRacer r : racers)
        {
            s += r.toString()+"\n";
        }
        return s;
    }

}