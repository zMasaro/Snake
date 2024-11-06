package Main;


import Model.GameConfig;
import Model.GameStates;
import javax.swing.*;
import java.awt.*;

//public class GameView extends JPanel {
//    private GameStates gameState;
//
//    public GameView(GameStates gameState) {
//        this.gameState = gameState;
//        this.setPreferredSize(new Dimension(GameConfig.SCREEN, GameConfig.SCREEN));
//        this.setBackground(Color.black);
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.setColor(Color.red);
//        g.fillOval(gameState.getFood().getX(), gameState.getFood().getY(), GameConfig.SQUARE_SIZE, GameConfig.SQUARE_SIZE);
//        g.setColor(Color.blue);
//        g.fillOval(gameState.getObstacle().getX(), gameState.getObstacle().getY(), GameConfig.SQUARE_SIZE, GameConfig.SQUARE_SIZE);
//        g.setColor(Color.green);
//        for (int i = 0; i < gameState.getSnake().getSnakeBody(); i++) {
//            g.fillRect(gameState.getSnake().getSnakeX()[i], gameState.getSnake().getSnakeY()[i], GameConfig.SQUARE_SIZE, GameConfig.SQUARE_SIZE);
//        }
//    }
//}
