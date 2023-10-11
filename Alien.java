import java.util.Random;

public class Alien {
    private final String name;
    private static Random r  = new Random();

    public Alien(String type) {
        this.name = type + r.nextInt(100);
    }
    public String getName() {
        return this.name;
    }
    @Override public String toString() {
        return this.name;
    }
}
