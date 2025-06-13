package players;

public class FootballPlayer extends Player {
    public int countOfRedCard;
    public int countOfYellowCard;
    public int countOfGoals;

    public FootballPlayer(String name, int position, String team, int redCards, int yellowCards, int goals) {
        super(name, "Football", position, team);
        this.countOfRedCard = redCards;
        this.countOfYellowCard = yellowCards;
        this.countOfGoals = goals;
    }

    @Override
    public String getInfo() {
        return "Football Player: " + nameOfPlayer +
                " | Red Cards: " + countOfRedCard +
                " | Yellow Cards: " + countOfYellowCard +
                " | Goals: " + countOfGoals;
    }
}
