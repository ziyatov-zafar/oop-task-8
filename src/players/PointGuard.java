package players;

public class PointGuard extends BasketballPlayer {
    private int countOfGuard;

    public PointGuard(String name, int position, String team, int goals, int guards) {
        super(name, position, team, goals);
        this.countOfGuard = guards;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Guards: " + countOfGuard;
    }
}
