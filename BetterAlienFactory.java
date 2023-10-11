import java.sql.Types;
import java.util.Random;

public class BetterAlienFactory {
    enum Type {
        SquidAlien, MonkeyAlien, TigerAlien, RatAlien;
    }
    private static Random r = new Random();
    public Alien getAlien() {
        int rand = r.nextInt(Type.values().length);
        Type t = Type.values()[rand];
        Alien alien = null;
        try {
            alien = (Alien)(Class.forName(t.toString()).getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            System.out.println("Unknown Alien Type");
        }
        return alien;
    }
        /*
        Random r = new Random();
        int random = r.nextInt(Type.values().length);
        Alien alien = null;
        switch (Type.values()[random]) {
            case SQUID:
                alien = new SquidAlien();
                break;
            case RAT:
                alien = new RatAlien();
                break;
            case TIGER:
                alien = new TigerAlien();
                break;
            case MONKEY:
                alien = new MonkeyAlien();
                break;
            default:
                System.out.println("Unknown alien type");
                System.exit(0);
                break;
        }
        return alien;
    }
    */

}
