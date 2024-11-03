package Model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Obstacle {

    private int x;
    private int y;
    private final float lifespan;
    private boolean isActive;
    private static final Random random = new Random();

    private static final int MIN_LIFESPAN = 3000;
    private static final int MAX_LIFESPAN = 9000;

    private static final ArrayList<Obstacle> obstacles = new ArrayList<>();

    public Obstacle(int x, int y, long lifespan) {
        this.x = x;
        this.y = y;
        this.lifespan = lifespan;
        this.isActive = true;
    }

    public static void spawnObstacle(int maxX, int maxY) {
        int x = random.nextInt(maxX) * GameConfig.SQUARE_SIZE;
        int y = random.nextInt(maxY) * GameConfig.SQUARE_SIZE;
        long lifespan = randomLifespan();

        Obstacle obstacle = new Obstacle(x, y, lifespan);
        obstacles.add(obstacle);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                obstacle.isActive = false;
                obstacles.remove(obstacle);
            }
        }, lifespan);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isIsActive() {
        return isActive;
    }

    private static long randomLifespan() {
        return MIN_LIFESPAN + random.nextInt(MAX_LIFESPAN - MIN_LIFESPAN + 1);
    }

    public static ArrayList<Obstacle> getObstacles() {
        return obstacles;
    }

}
