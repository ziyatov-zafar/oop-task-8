package players;

public class VoleyballPlayer extends Player {
    private int numberOfPoints;

    public VoleyballPlayer(String name, int position, String team, int points) {
        super(name, "Voleyball", position, team);
        this.numberOfPoints = points;
    }

    @Override
    public String getInfo() {
        return "Voleyball Player: " + nameOfPlayer + " | Points: " + numberOfPoints;
    }
}
