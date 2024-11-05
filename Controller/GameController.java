/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.GameStates;
import View.FrmSnake;

/**
 *
 * @author emman
 */
public class GameController extends Thread {

    private GameStates gameState;
    private FrmSnake gameView;
    private javax.swing.Timer timer;
    private static int delay = 120;
    
    public GameStates getGameState() {
        return gameState;
    }

    public GameController(GameStates gameState, FrmSnake gameView) {
        this.gameState = gameState;
        gameState.setController(this);
        this.gameView = gameView;
        this.gameView.setController(this);
        this.gameView.setFocusable(true);
        timer = new javax.swing.Timer(delay, gameView);
        timer.start();
    }

    public javax.swing.Timer getTimer() {
        return timer;
    }
    
    public void action() {
        if (gameState.isRunning()) {
            gameState.getSnake().snakeMove();
            gameState.checkFoodCollision();
            gameState.checkCollision();
        }else {
            timer.stop();
            gameView.loose();
        
        }
        gameView.repaint();
    }
    
    public void keyPressed(char direction) {
        gameState.getSnake().changeDirection(direction);
    }

}

