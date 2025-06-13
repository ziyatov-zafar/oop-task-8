package players;

public class Setter extends VoleyballPlayer {
    private int countOfSets;

    public Setter(String name, int position, String team, int points, int sets) {
        super(name, position, team, points);
        this.countOfSets = sets;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Sets: " + countOfSets;
    }
}
