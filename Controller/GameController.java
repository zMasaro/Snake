/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Main.GameView;
import Model.GameConfig;
import Model.GameStates;
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
public class GameController extends Thread implements ActionListener, KeyListener {

    private GameStates gameState;
    private GameView gameView;
    private javax.swing.Timer timer;

    public GameController(GameStates gameState, GameView gameView) {
        this.gameState = gameState;
        this.gameView = gameView;
        this.gameView.addKeyListener(this);
        this.gameView.setFocusable(true);
        timer = new javax.swing.Timer(120, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameState.isRunning()) {
            gameState.getSnake().snakeMove();
            gameState.checkFoodCollision();
            gameState.checkCollision();
        }
        gameView.repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W ->
                gameState.getSnake().changeDirection('w');
            case KeyEvent.VK_S ->
                gameState.getSnake().changeDirection('s');
            case KeyEvent.VK_A ->
                gameState.getSnake().changeDirection('a');
            case KeyEvent.VK_D ->
                gameState.getSnake().changeDirection('d');
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}

