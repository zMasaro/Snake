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

    private void growRecursive(int index) {
        // Caso base: si estamos en el último segmento actual de la serpiente
        if (index == 0) {
            // El nuevo segmento toma la posición del último segmento actual
            snakeX[snakeBody] = snakeX[snakeBody - 1];
            snakeY[snakeBody] = snakeY[snakeBody - 1];
        } else {
            // Paso recursivo: mueve cada segmento hacia adelante
            snakeX[index] = snakeX[index - 1];
            snakeY[index] = snakeY[index - 1];
            growRecursive(index - 1);
        }
    }

    public void snakeMove() {
        growRecursive(snakeBody);
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

    public void changeDirection(char direction) {
        if ((this.direction == 'w' && direction != 's')
                || (this.direction == 's' && direction != 'w')
                || (this.direction == 'a' && direction != 'd')
                || (this.direction == 'd' && direction != 'a')) {
            this.direction = direction;
        }
    }

}
