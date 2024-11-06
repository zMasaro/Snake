/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.GameController;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author emman
 */
public class Animation extends Thread {

    private GameController controller;
    private boolean b;

    @Override
    public void run() {
        animation(controller.getGameView().getJpSnake().getGraphics());
    }

    public void setController(GameController controller) {
        this.controller = controller;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public void animation(Graphics g) {

        if (b) {
            for (int i = 0; i < controller.getGameState().getSnake().getSnakeBody(); i++) {
                g.drawImage(controller.getGameView().getCircleYellow(), controller.getGameState().getSnake().getSnakeX()[i], controller.getGameState().getSnake().getSnakeY()[i], GameConfig.SQUARE_SIZE, GameConfig.SQUARE_SIZE, controller.getGameView().getJpSnake());
            }
            b = false;

        }
    }

}
