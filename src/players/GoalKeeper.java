package players;

public class GoalKeeper extends FootballPlayer {
    public int countOfSaves;

    public GoalKeeper(String name, int position, String team, int red, int yellow, int goals, int saves) {
        super(name, position, team, red, yellow, goals);
        this.countOfSaves = saves;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Saves: " + countOfSaves;
    }
}
