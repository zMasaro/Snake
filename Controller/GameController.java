/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Main.GameView;
import Model.GameConfig;
import Model.GameStates;
import View.FrmSnake;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import javax.swing.JPanel;

/**
 *
 * @author emman
 */
public class GameController extends Thread {

    private GameStates gameState;
    private FrmSnake gameView;
    private javax.swing.Timer timer;

    public GameStates getGameState() {
        return gameState;
    }

    public GameController(GameStates gameState, FrmSnake gameView) {
        this.gameState = gameState;
        this.gameView = gameView;
        this.gameView.setController(this);
//        this.gameView.addKeyListener(this);
        this.gameView.setFocusable(true);
        timer = new javax.swing.Timer(120, gameView);
        timer.start();
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (gameState.isRunning()) {
//            gameState.getSnake().snakeMove();
//            gameState.checkFoodCollision();
//            gameState.checkCollision();
//        }
//        gameView.repaint();
//    }
    
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

//    @Override
//    public void keyPressed(KeyEvent e) {
//        switch (e.getKeyCode()) {
//            case KeyEvent.VK_W ->
//                gameState.getSnake().changeDirection('w');
//            case KeyEvent.VK_S ->
//                gameState.getSnake().changeDirection('s');
//            case KeyEvent.VK_A ->
//                gameState.getSnake().changeDirection('a');
//            case KeyEvent.VK_D ->
//                gameState.getSnake().changeDirection('d');
//        }
//    }
    
    public void keyPressed(char direction) {
        gameState.getSnake().changeDirection(direction);
    }

}

