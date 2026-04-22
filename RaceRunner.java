public class RaceRunner {
    
    public static void main (String[] args)
    {
        Hare harry = new Hare("Harry");
        Tortoise timmy = new Tortoise("Timmy");
        Teleporter tommy = new Teleporter("Tommy");

        Race r = new Race(30);
        r.addRacer(harry);
        r.addRacer(timmy);
        r.addRacer(tommy);
        while (r.findWinner()==null)
        {
            r.nextMove();
            System.out.println(r.toString());
        }

        System.out.println("\n"+r.findWinner().getName()+" wins!");

    }
}
