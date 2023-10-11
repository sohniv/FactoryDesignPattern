import java.util.Random;

public class AlienFactory {
    enum Type {
        SQUID, MONKEY, TIGER, RAT;
    }
    public Alien getAlien() {
        Random r = new Random();
        int random = r.nextInt(Type.values().length);
        Alien answer = null;
        switch (Type.values()[random]) {
            case SQUID:
                answer = new SquidAlien();
                break;
            case RAT:
                answer = new RatAlien();
                break;
            case TIGER:
                answer = new TigerAlien();
                break;
            case MONKEY:
                answer = new MonkeyAlien();
                break;
            default:
                System.out.println("Unknown alien type");
                System.exit(0);
                break;
        }
        return answer;
    }
}
