package Model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Obstacle {

    private int x;
    private int y;
    private float lifespan;
    private boolean isActive;
    private Timer obstacleRespawn;
    private Random random = new Random();

    private static final int MIN_LIFESPAN = 3000;
    private static final int MAX_LIFESPAN = 9000;

    private static final ArrayList<Obstacle> obstacles = new ArrayList<>();

       public Obstacle() {
        lifespan = randomLifespan();
        startObstacleRespawn();
    }
    
        private void startObstacleRespawn() {
        obstacleRespawn = new Timer();
        obstacleRespawn.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                spawnObstacle(GameConfig.PARALLEL_FRAMES, GameConfig.PARALLEL_FRAMES);
            }
        }, 0, (long) lifespan);
    }

    public void spawnObstacle(int maxX, int maxY) {
        x = random.nextInt(maxX) * GameConfig.SQUARE_SIZE;
        y = random.nextInt(maxY) * GameConfig.SQUARE_SIZE;
        lifespan = randomLifespan();
        isActive = true;

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                isActive = false;
            }
        }, (long) lifespan);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Timer getObstacleRespawn() {
        return obstacleRespawn;
    }

    public boolean isIsActive() {
        return isActive;
    }

    private long randomLifespan() {
        return MIN_LIFESPAN + random.nextInt(MAX_LIFESPAN - MIN_LIFESPAN + 1);
    }

    public static ArrayList<Obstacle> getObstacles() {
        return obstacles;
    }
    
    

}
