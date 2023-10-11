import java.util.Random;

public class VideoGame {
    private static final int NUM = 10;
    public void play() {
        AlienFactory af = new AlienFactory();
        Alien [] alienArray = new Alien[NUM];
        for (int i = 0; i < alienArray.length; i++) {
            alienArray[i] = af.getAlien();
            System.out.println(alienArray[i]);
        }
    }
}
