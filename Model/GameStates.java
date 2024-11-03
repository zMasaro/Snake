/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author emman
 */
public class GameStates {

    private boolean running = true;
    private Snake snake = new Snake();
    private Food food = new Food();
    private Obstacle obstacle;

    public GameStates() {
        food.spawn(GameConfig.PARALLEL_FRAMES, GameConfig.PARALLEL_FRAMES);
    }

    public void checkCollision() {
        if (checkWallCollision() || checkSelfCollision() || checkObstacleCollision()) {
            running = false;
        }
    }

    public boolean checkWallCollision() {
        return snake.getSnakeX()[0] < 0 || snake.getSnakeY()[0] < 0 || snake.getSnakeX()[0] >= GameConfig.SCREEN || snake.getSnakeY()[0] >= GameConfig.SCREEN;
    }

    public boolean checkSelfCollision() {
        for (int i = snake.getSnakeBody(); i > 0; i--) {
            if (snake.getSnakeX()[0] == snake.getSnakeX()[i] && snake.getSnakeY()[0] == snake.getSnakeY()[i]) {
                return true;
            }
        }
        return false;
    }

    public void checkFoodCollision() {
        if (snake.getSnakeX()[0] == food.getX() && snake.getSnakeY()[0] == food.getY()) {
            snake.grow();
            food.spawn(GameConfig.PARALLEL_FRAMES, GameConfig.PARALLEL_FRAMES);
        }
    }
    
    public boolean checkObstacleCollision() {
        return snake.getSnakeX()[0] == obstacle.getX() && snake.getSnakeY()[0] == obstacle.getY();
    }

    public Snake getSnake() {
        return snake;
    }

    public Food getFood() {
        return food;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
