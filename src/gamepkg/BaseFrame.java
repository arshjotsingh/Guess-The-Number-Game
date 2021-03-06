/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamepkg;

import javax.swing.JMenu;

/**
 *
 * @author aa
 */
public class BaseFrame extends javax.swing.JFrame {

    /**
     * Creates new form BaseFrame
     */
    
    public BaseFrame() {
        initComponents();
        menugoto.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basepanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        menufile = new javax.swing.JMenu();
        menuitemlogin = new javax.swing.JMenuItem();
        menuitemNewUser = new javax.swing.JMenuItem();
        menuitemExit = new javax.swing.JMenuItem();
        menugoto = new javax.swing.JMenu();
        menuitemSelectGame = new javax.swing.JMenuItem();
        menuitemSelectLevel = new javax.swing.JMenuItem();
        menuitemScoreboard = new javax.swing.JMenuItem();
        menuhelp = new javax.swing.JMenu();
        menuitemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        basepanel.setMaximumSize(new java.awt.Dimension(600, 500));
        basepanel.setMinimumSize(new java.awt.Dimension(600, 500));
        basepanel.setPreferredSize(new java.awt.Dimension(600, 500));
        basepanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/bkgstart.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        basepanel.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(basepanel);
        basepanel.setBounds(0, 0, 600, 500);

        menufile.setText("File");

        menuitemlogin.setText("Login");
        menuitemlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemloginActionPerformed(evt);
            }
        });
        menufile.add(menuitemlogin);

        menuitemNewUser.setText("New User");
        menuitemNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemNewUserActionPerformed(evt);
            }
        });
        menufile.add(menuitemNewUser);

        menuitemExit.setText("Exit");
        menuitemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemExitActionPerformed(evt);
            }
        });
        menufile.add(menuitemExit);

        menubar.add(menufile);

        menugoto.setText("Goto");

        menuitemSelectGame.setText("Select Game");
        menuitemSelectGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemSelectGameActionPerformed(evt);
            }
        });
        menugoto.add(menuitemSelectGame);

        menuitemSelectLevel.setText("Select Level");
        menuitemSelectLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemSelectLevelActionPerformed(evt);
            }
        });
        menugoto.add(menuitemSelectLevel);

        menuitemScoreboard.setText("Scoreboard");
        menugoto.add(menuitemScoreboard);

        menubar.add(menugoto);

        menuhelp.setText("Help");

        menuitemAbout.setText("About");
        menuhelp.add(menuitemAbout);

        menubar.add(menuhelp);

        setJMenuBar(menubar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuitemloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemloginActionPerformed
        // TODO add your handling code here:
       // LoginPanel loginpanel=new LoginPanel();
        LoginPanel loginpanel=new LoginPanel(basepanel,menugoto);
        basepanel.removeAll();
        basepanel.validate();
        basepanel.add(loginpanel);
        basepanel.revalidate();
             
    }//GEN-LAST:event_menuitemloginActionPerformed

    private void menuitemNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemNewUserActionPerformed
        // TODO add your handling code here:
        SignupPanel signuppanel=new SignupPanel();
        basepanel.removeAll();
        basepanel.validate();
        basepanel.add(signuppanel);
        basepanel.revalidate();
    }//GEN-LAST:event_menuitemNewUserActionPerformed

    private void menuitemSelectLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemSelectLevelActionPerformed
        // TODO add your handling code here:
       /* LevelPanel lvl=new LevelPanel(basepanel,);
         basepanel.removeAll();
         basepanel.validate();
         basepanel.add(lvl);
        basepanel.revalidate();*/
    }//GEN-LAST:event_menuitemSelectLevelActionPerformed

    private void menuitemSelectGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemSelectGameActionPerformed
        // TODO add your handling code here:
       /* LevelPanel levelpanel=new LevelPanel(basepanel);
         basepanel.removeAll();
         basepanel.validate();
         basepanel.add(levelpanel);
        basepanel.revalidate();
        */
    }//GEN-LAST:event_menuitemSelectGameActionPerformed

    private void menuitemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_menuitemExitActionPerformed

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
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenu menufile;
    private javax.swing.JMenu menugoto;
    private javax.swing.JMenu menuhelp;
    private javax.swing.JMenuItem menuitemAbout;
    private javax.swing.JMenuItem menuitemExit;
    private javax.swing.JMenuItem menuitemNewUser;
    private javax.swing.JMenuItem menuitemScoreboard;
    private javax.swing.JMenuItem menuitemSelectGame;
    private javax.swing.JMenuItem menuitemSelectLevel;
    private javax.swing.JMenuItem menuitemlogin;
    // End of variables declaration//GEN-END:variables
}
