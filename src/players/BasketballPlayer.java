package players;

public class BasketballPlayer extends Player {
    private int numberOfGoals;

    public BasketballPlayer(String name, int position, String team, int goals) {
        super(name, "Basketball", position, team);
        this.numberOfGoals = goals;
    }

    @Override
    public String getInfo() {
        return "Basketball Player: " + nameOfPlayer + " | Goals: " + numberOfGoals;
    }
}
