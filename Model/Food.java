package Model;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Food {

    private int x;
    private int y;
    private int score;
    private long lifespan;
    private boolean isActive;
    private Random random = new Random();
    private static final int MIN_SCORE = 1;
    private static final int MAX_SCORE = 10;
    private static final int MAX_LIFESPAN = 5000;
    private static final int MIN_LIFESPAN = 1000;

    public Food() {
        lifespan = calculateLifespan(score);
        startFoodRespawn();
    }

    public void spawn(int maxX, int maxY) {
        x = random.nextInt(maxX) * GameConfig.SQUARE_SIZE;
        y = random.nextInt(maxY) * GameConfig.SQUARE_SIZE;
        score = random.nextInt((MAX_SCORE - MIN_SCORE) + 1) + MIN_SCORE;
        lifespan = calculateLifespan(score);
        isActive = true;

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                isActive = false;
            }
        }, lifespan);
    }
    
    
    public void startFoodRespawn() {
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                spawn(GameConfig.PARALLEL_FRAMES, GameConfig.PARALLEL_FRAMES);
            }
        }, 0, (long) lifespan);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getScore() {
        return score;
    }

    public boolean isIsActive() {
        return isActive;
    }

    private long calculateLifespan(int score) {

        return MAX_LIFESPAN - ((score - MIN_SCORE) * (MAX_LIFESPAN - MIN_LIFESPAN) / (MAX_SCORE - MIN_SCORE));
    }

}
