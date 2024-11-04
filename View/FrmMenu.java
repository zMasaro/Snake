/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author zulay
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Access/Img/snake.png"));
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(icon.getImage(),0,0,getWidth(),getHeight(),this);
            }
        };
        btnRules = new javax.swing.JButton();
        btnplay1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRules.setBackground(new java.awt.Color(0, 153, 51));
        btnRules.setFont(new java.awt.Font("Showcard Gothic", 0, 15)); // NOI18N
        btnRules.setForeground(new java.awt.Color(0, 0, 0));
        btnRules.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/inbox.png"))); // NOI18N
        btnRules.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRules.setBorderPainted(false);
        btnRules.setContentAreaFilled(false);
        btnRules.setFocusable(false);
        btnRules.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRules.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/play72.png"))); // NOI18N
        btnRules.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/play128.png"))); // NOI18N
        btnRules.setVerifyInputWhenFocusTarget(false);
        btnRules.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRulesActionPerformed(evt);
            }
        });

        btnplay1.setBackground(new java.awt.Color(0, 153, 51));
        btnplay1.setFont(new java.awt.Font("Showcard Gothic", 0, 15)); // NOI18N
        btnplay1.setForeground(new java.awt.Color(0, 0, 0));
        btnplay1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/play92.png"))); // NOI18N
        btnplay1.setText("Jugar");
        btnplay1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnplay1.setBorderPainted(false);
        btnplay1.setContentAreaFilled(false);
        btnplay1.setFocusable(false);
        btnplay1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnplay1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/play72.png"))); // NOI18N
        btnplay1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Access/Img/play128.png"))); // NOI18N
        btnplay1.setVerifyInputWhenFocusTarget(false);
        btnplay1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplay1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btnRules, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnplay1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 731, Short.MAX_VALUE)
                .addComponent(btnplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRules, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnRules, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRulesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRulesActionPerformed

    private void btnplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnplay1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRules;
    private javax.swing.JButton btnplay1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
