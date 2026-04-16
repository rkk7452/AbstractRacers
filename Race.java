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

    public void runRace()
    {
        boolean finished = false;

        while (!finished)
        {
            for (AbstractRacer r : racers)
            {
                r.move();

                if (r.getPosition() >= trackLength)
                {
                    System.out.println(r.getName() + " wins!");
                    finished = true;
                    break;
                }
            }
        }
    }
}