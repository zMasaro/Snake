/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.GameController;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author emman
 */
public class GameStates {
    private GameController controller;
    private boolean running = true;
    private Snake snake = new Snake();
    private Food food = new Food();
    private Obstacle obstacle = new Obstacle();
    private Animation animation = new Animation();

    public GameStates() {
        food.spawn(GameConfig.PARALLEL_FRAMES, GameConfig.PARALLEL_FRAMES);
        obstacle.spawnObstacle(GameConfig.PARALLEL_FRAMES, GameConfig.PARALLEL_FRAMES);
        animation.setController(controller);
    }

    public Animation getAnimation() {
        return animation;
    }

    public void checkCollision() {
        if (checkWallCollision() || checkSelfCollision() || checkObstacleCollision()) {
            sound("src/Access/Sounds/collisionpad.wav");
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
            controller.getTimer().setDelay(controller.getTimer().getDelay()-1);
            sound("src/Access/Sounds/collision.wav");
            food.spawn(GameConfig.PARALLEL_FRAMES, GameConfig.PARALLEL_FRAMES);
            animation.setB(running);
        }
    }
    
    public boolean checkObstacleCollision() {
        if(snake.getSnakeX()[0]  == obstacle.getX() && snake.getSnakeY()[0] == obstacle.getY()){
            obstacle.spawnObstacle(GameConfig.PARALLEL_FRAMES, GameConfig.PARALLEL_FRAMES);
            return true;
        }
        return false;
    }
    
    public void sound(String url) {
        try{
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(url));
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        }catch(Exception e){ 
            e.printStackTrace();
        }
    }

    public Snake getSnake() {
        return snake;
    }

    public Food getFood() {
        return food;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }
    
    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setController(GameController controller) {
        this.controller = controller;
    }
}
