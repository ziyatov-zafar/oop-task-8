import converter.BaseConverter.*;
import players.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("25°C -> Kelvin: " + new KelvinConverter().convert(25));
        System.out.println("25°C -> Fahrenheit: " + new FahrenheitConverter().convert(25));
        System.out.println("25°C -> Reaumur: " + new ReaumurConverter().convert(25));

        Player f = new FootballPlayer("Zafar", 9, "Real Madrid", 1, 2, 10);
        Player v = new Setter("Sardor", 7, "UzVol", 30, 15);
        Player b = new PointGuard("Ali", 3, "NBA-UZ", 20, 7);

        System.out.println(f.getInfo());
        System.out.println(v.getInfo());
        System.out.println(b.getInfo());
    }
}
