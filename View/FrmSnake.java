/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controller.GameController;
import Model.Animation;
import Model.Chronometer;
import Model.GameConfig;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author zulay
 */
public class FrmSnake extends javax.swing.JInternalFrame implements ActionListener {

    private ImageIcon fontIcon = new ImageIcon(getClass().getResource("/Access/Img/Fondo.png"));
    private ImageIcon foodIcon = new ImageIcon(getClass().getResource("/Access/Img/aple.png"));
    private ImageIcon obstacleIcon = new ImageIcon(getClass().getResource("/Access/Img/spider.png"));

    private Animation animacion;
    
    private GameController controller;
    private Chronometer chronometer;
    private FrmMenu menu;
    private int apple;
    private int animation = 0;
    private Image circleYellow, circle;

    public void setController(GameController controller) {
        this.controller = controller;
    }

    public void setAnimacion(Animation animacion) {
        this.animacion = animacion;
    }
    

    public JLabel getLbTime() {
        return lbTime;
    }
    
    public void setMenu(FrmMenu menu) {
        this.menu = menu;
    }

    public int getApple() {
        return controller.getGameState().getSnake().getSnakeBody() - 5;
    }

    public int getAnimation() {
        return animation;
    }

    public Image getCircleYellow() {
        return circleYellow;
    }

    public Image getCircle() {
        return circle;
    }

    public JPanel getJpSnake() {
        return jpSnake;
    }
    
    /**
     * Creates new form FrmSnake
     */
    public FrmSnake() {
        initComponents();
        this.addKeyListener(new Controls());
        UpdateImg();
        chronometer = new Chronometer(this);
        chronometer.start();
    }


    public void UpdateImg() {
        circleYellow = new ImageIcon(getClass().getResource("/Access/Img/SnakeBody/circleYellow.png")).getImage();
        circle = new ImageIcon(getClass().getResource("/Access/Img/SnakeBody/circle.png")).getImage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.controller.action();
        apple = controller.getGameState().getSnake().getSnakeBody() - 5;
        txtApple.setText(Integer.toString(apple));
        jpSnake.repaint();
        
    }

    public void loose() {
        this.controller.getGameState().getObstacle().getObstacleRespawn().cancel();
//        chronometer.stop();
        FrmReboot reboot = new FrmReboot(null, true);
        reboot.setMenu(menu);
        reboot.setLocation((menu.getDesktop().getWidth() - reboot.getWidth()) / 2,
                (menu.getDesktop().getHeight() - reboot.getHeight()) / 2);
        reboot.setBtnApple(apple);
        reboot.setBtnRecord(apple);
        reboot.setVisible(true);
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon ficon = new ImageIcon(getClass().getResource("/Access/Img/FondoPerfecto.png"));
        jpSnake = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);

                g.drawImage(ficon.getImage(),0,0,getWidth(),getHeight(),this);
                g.drawImage(foodIcon.getImage(),controller.getGameState().getFood().getX(),
                    controller.getGameState().getFood().getY(),
                    GameConfig.SQUARE_SIZE, GameConfig.SQUARE_SIZE,this);
                //Obstacle
                g.drawImage(obstacleIcon.getImage(),controller.getGameState().getObstacle().getX(),
                    controller.getGameState().getObstacle().getY(),
                    GameConfig.SQUARE_SIZE, GameConfig.SQUARE_SIZE,this);

                for (int i = 0; i < controller.getGameState().getSnake().getSnakeBody(); i++) {
                    g.drawImage(controller.getGameView().getCircle(), controller.getGameState().getSnake().getSnakeX()[i], controller.getGameState().getSnake().getSnakeY()[i], GameConfig.SQUARE_SIZE, GameConfig.SQUARE_SIZE, controller.getGameView().getJpSnake());
                }

                animacion.animation(g);
            }
        };
        ImageIcon icon = new ImageIcon(getClass().getResource("/Access/Img/cap.png"));
        jPanel2 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(icon.getImage(),0,0,getWidth(),getHeight(),this);
            }
        };
        txtApple = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 255, 51));
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 255));
        setTitle("SNAKE GAME");

        jpSnake.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpSnake.setPreferredSize(new java.awt.Dimension(600, 600));
        // Variable para el color de la serpiente

        // Modifica el método paintComponent para usar snakeCol

        javax.swing.GroupLayout jpSnakeLayout = new javax.swing.GroupLayout(jpSnake);
        jpSnake.setLayout(jpSnakeLayout);
        jpSnakeLayout.setHorizontalGroup(
            jpSnakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );
        jpSnakeLayout.setVerticalGroup(
            jpSnakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(66, 149, 25));

        txtApple.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        txtApple.setForeground(new java.awt.Color(0, 0, 0));
        txtApple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/aple.png"))); // NOI18N
        txtApple.setText("0");
        txtApple.setFocusable(false);
        txtApple.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtApple.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(txtApple);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/alarm-clock_563949.png"))); // NOI18N
        jPanel2.add(jLabel2);

        lbTime.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        lbTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbTime);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpSnake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpSnake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpSnake;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel txtApple;
    // End of variables declaration//GEN-END:variables
public class Controls extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyChar()) {
                case 'w', 'W' -> {
                    controller.keyPressed('w');
                }
                case 'a', 'A' -> {
                    controller.keyPressed('a');
                }
                case 's', 'S' -> {
                    controller.keyPressed('s');
                }
                case 'd', 'D' -> {
                    controller.keyPressed('d');
                }
            }
        }
    }

}
