/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;
import Controller.GameController;
import Model.GameStates;
import java.awt.Graphics;
import javax.swing.ImageIcon;


/**
 *
 * @author zulay
 */
public class FrmReboot extends javax.swing.JDialog {
    private FrmMenu menu;
    
    /**
     * Creates new form FrmReboot
     */

    public void setBtnApple(int apple) {
        btnAple1.setText(Integer.toString(apple));
    }
    
    public void setBtnRecord(int apple) {
        
        if (apple > menu.getRecord()) {
            btnRecord.setText(Integer.toString(apple));
            menu.setRecord(apple);
        }
        btnRecord.setText(Integer.toString(menu.getRecord()));
    }
    
    

    public FrmReboot(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }

    public void setMenu(FrmMenu menu) {
        this.menu = menu;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Access/Img/reinicio.png"));
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(icon.getImage(),0,0,getWidth(),getHeight(),this);
            }
        };
        btnReiniciar = new javax.swing.JButton();
        btnRecord = new javax.swing.JLabel();
        btnAple1 = new javax.swing.JLabel();
        btnMenu1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(91, 182, 89));

        btnReiniciar.setBackground(new java.awt.Color(0, 153, 51));
        btnReiniciar.setFont(new java.awt.Font("Showcard Gothic", 0, 15)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(0, 0, 0));
        btnReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/actu72.png"))); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReiniciar.setBorderPainted(false);
        btnReiniciar.setContentAreaFilled(false);
        btnReiniciar.setFocusable(false);
        btnReiniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReiniciar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/actu64.png"))); // NOI18N
        btnReiniciar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/actu96.png"))); // NOI18N
        btnReiniciar.setVerifyInputWhenFocusTarget(false);
        btnReiniciar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnRecord.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        btnRecord.setForeground(new java.awt.Color(0, 0, 0));
        btnRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/premio.png"))); // NOI18N
        btnRecord.setText("0");
        btnRecord.setFocusable(false);
        btnRecord.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRecord.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnAple1.setBackground(new java.awt.Color(158, 240, 252));
        btnAple1.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        btnAple1.setForeground(new java.awt.Color(0, 0, 0));
        btnAple1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/aple.png"))); // NOI18N
        btnAple1.setText("0");
        btnAple1.setAutoscrolls(true);
        btnAple1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAple1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnMenu1.setBackground(new java.awt.Color(0, 153, 51));
        btnMenu1.setFont(new java.awt.Font("Showcard Gothic", 0, 15)); // NOI18N
        btnMenu1.setForeground(new java.awt.Color(0, 0, 0));
        btnMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/play72.png"))); // NOI18N
        btnMenu1.setText("Volver al menu");
        btnMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenu1.setBorderPainted(false);
        btnMenu1.setContentAreaFilled(false);
        btnMenu1.setFocusable(false);
        btnMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/play72.png"))); // NOI18N
        btnMenu1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/play128.png"))); // NOI18N
        btnMenu1.setVerifyInputWhenFocusTarget(false);
        btnMenu1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btnAple1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRecord)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRecord)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAple1)
                        .addGap(57, 57, 57)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
       menu.initGame();
       this.dispose();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        this.dispose();
        menu.getBtnplay1().setEnabled(true);
    }//GEN-LAST:event_btnMenu1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmReboot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReboot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReboot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReboot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmReboot dialog = new FrmReboot(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAple1;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JLabel btnRecord;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
