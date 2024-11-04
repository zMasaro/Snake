/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;


import Controller.GameController;
import Model.GameStates;
import View.FrmSnake;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;


/**
 *
 * @author emman
 */
public class Main {
    public static void main(String[] args) {
        GameStates gameState = new GameStates();
        FrmSnake gameView = new FrmSnake();
        GameController gameController = new GameController(gameState, gameView);

        JFrame frame = new JFrame("Snake Game");
        JDesktopPane desk = new JDesktopPane();
        frame.add(desk);
        desk.add(gameView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}