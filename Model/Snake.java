/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author emman
 */
public class Snake {

    private int[] snakeX;
    private int[] snakeY;
    private int snakeBody;
    private char direction;

    public int[] getSnakeX() {
        return snakeX;
    }

    public int[] getSnakeY() {
        return snakeY;
    }

    public int getSnakeBody() {
        return snakeBody;
    }

    public char getDirection() {
        return direction;
    }

    public void grow() {
        this.snakeBody++;
    }

    public Snake() {
        snakeX = new int[GameConfig.TOTAL_SNAKE];
        snakeY = new int[GameConfig.TOTAL_SNAKE];
        snakeBody = 5;
        direction = 'd';
    }

    public void snakeMove() {
        for (int i = snakeBody; i > 0; i--) {
            snakeX[i] = snakeX[i - 1];
            snakeY[i] = snakeY[i - 1];
        }
        switch (direction) {
            case 'd' -> {
                snakeX[0] = snakeX[0] + GameConfig.SQUARE_SIZE;
            }
            case 'a' -> {
                snakeX[0] = snakeX[0] - GameConfig.SQUARE_SIZE;
            }
            case 'w' -> {
                snakeY[0] = snakeY[0] - GameConfig.SQUARE_SIZE;
            }
            case 's' -> {
                snakeY[0] = snakeY[0] + GameConfig.SQUARE_SIZE;
            }
        }
    }

    public void changeDirection(char direction ) {
        if ((this.direction == 'w' && direction != 's')
                || (this.direction == 's' && direction != 'w')
                || (this.direction == 'a' && direction != 'd')
                || (this.direction == 'd' && direction != 'a')) {
            this.direction = direction;
        }
    }

}
