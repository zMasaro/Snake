/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;


import Controller.GameController;
import Model.GameStates;
import javax.swing.JFrame;


/**
 *
 * @author emman
 */
public class Main {
    public static void main(String[] args) {
        GameStates gameState = new GameStates();
        GameView gameView = new GameView(gameState);
        GameController gameController = new GameController(gameState, gameView);

        JFrame frame = new JFrame("Snake Game");
        frame.add(gameView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}