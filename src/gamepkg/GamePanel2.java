/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamepkg;

import java.awt.Cursor;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class GamePanel2 extends javax.swing.JPanel {

    /**
     * Creates new form GamePanel2
     */
    int randomnum;
    Random random=new Random();
    int turns=5;
    StringBuffer val=new StringBuffer("");
    int range;
    int score=0;
    int level;
    String username;
    TimerClass timerClass;
    
    
    public GamePanel2(int level,String username) {
        initComponents();
        this.username=username;
        this.level=level;
        txtusernumber.setEditable(false);
        setRange();
        randomnum=random.nextInt(range);
        System.out.println(randomnum);
        lblscore.setText(""+score);
        lblLevel.setText(""+level);
        lblUsername.setText(username);
        lblrange.setText("Pick a number from 0-"+range);
        btnGuess.setEnabled(false);
               
        
              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblrange = new javax.swing.JLabel();
        lblresult = new javax.swing.JLabel();
        btnGuess = new javax.swing.JButton();
        lblturns = new javax.swing.JLabel();
        btnPlayAgain = new javax.swing.JButton();
        txtusernumber = new javax.swing.JTextField();
        btn_0 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        lblscore = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        lblLevel = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        lblbackground = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 500));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(null);

        lblrange.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblrange.setForeground(new java.awt.Color(255, 0, 0));
        lblrange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrange.setText("Pick a Number from  0-5");
        add(lblrange);
        lblrange.setBounds(180, 410, 250, 60);

        lblresult.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblresult.setForeground(new java.awt.Color(255, 255, 255));
        lblresult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblresult.setText("Lets Start");
        add(lblresult);
        lblresult.setBounds(170, 330, 260, 82);

        btnGuess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/btnguess.png"))); // NOI18N
        btnGuess.setMaximumSize(new java.awt.Dimension(55, 55));
        btnGuess.setMinimumSize(new java.awt.Dimension(55, 55));
        btnGuess.setPreferredSize(new java.awt.Dimension(55, 55));
        btnGuess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuessMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuessMouseExited(evt);
            }
        });
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });
        add(btnGuess);
        btnGuess.setBounds(360, 120, 70, 50);

        lblturns.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblturns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblturns.setText("5");
        add(lblturns);
        lblturns.setBounds(500, 300, 50, 60);

        btnPlayAgain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/btnplay.png"))); // NOI18N
        btnPlayAgain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlayAgain.setMaximumSize(new java.awt.Dimension(55, 55));
        btnPlayAgain.setMinimumSize(new java.awt.Dimension(55, 55));
        btnPlayAgain.setPreferredSize(new java.awt.Dimension(55, 55));
        btnPlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayAgainActionPerformed(evt);
            }
        });
        add(btnPlayAgain);
        btnPlayAgain.setBounds(360, 180, 70, 50);

        txtusernumber.setBackground(new java.awt.Color(255, 255, 128));
        txtusernumber.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtusernumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusernumber.setText("0");
        txtusernumber.setBorder(null);
        txtusernumber.setOpaque(false);
        add(txtusernumber);
        txtusernumber.setBounds(500, 160, 50, 50);

        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/btn0.png"))); // NOI18N
        btn_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_0.setPreferredSize(new java.awt.Dimension(55, 55));
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        add(btn_0);
        btn_0.setBounds(230, 290, 50, 50);

        btn_1.setBackground(new java.awt.Color(0, 255, 255));
        btn_1.setForeground(new java.awt.Color(255, 153, 153));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/btn1.png"))); // NOI18N
        btn_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_1.setBorderPainted(false);
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1.setPreferredSize(new java.awt.Dimension(55, 55));
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        add(btn_1);
        btn_1.setBounds(170, 110, 50, 50);

        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/btn2.png"))); // NOI18N
        btn_2.setBorderPainted(false);
        btn_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2.setPreferredSize(new java.awt.Dimension(55, 55));
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        add(btn_2);
        btn_2.setBounds(230, 110, 50, 50);

        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/btn3.png"))); // NOI18N
        btn_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3.setPreferredSize(new java.awt.Dimension(55, 55));
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        add(btn_3);
        btn_3.setBounds(290, 110, 50, 50);

        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/btn4.png"))); // NOI18N
        btn_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_4.setPreferredSize(new java.awt.Dimension(55, 55));
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        add(btn_4);
        btn_4.setBounds(170, 170, 50, 50);

        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/btn5.png"))); // NOI18N
        btn_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_5.setPreferredSize(new java.awt.Dimension(55, 55));
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        add(btn_5);
        btn_5.setBounds(230, 170, 50, 50);

        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/btn6.png"))); // NOI18N
        btn_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_6.setPreferredSize(new java.awt.Dimension(55, 55));
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        add(btn_6);
        btn_6.setBounds(290, 170, 50, 50);

        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/btn7.png"))); // NOI18N
        btn_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_7.setPreferredSize(new java.awt.Dimension(55, 55));
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        add(btn_7);
        btn_7.setBounds(170, 230, 50, 50);

        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/btn8.png"))); // NOI18N
        btn_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_8.setPreferredSize(new java.awt.Dimension(55, 55));
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        add(btn_8);
        btn_8.setBounds(230, 230, 50, 50);

        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/btn9.png"))); // NOI18N
        btn_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_9.setPreferredSize(new java.awt.Dimension(55, 55));
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        add(btn_9);
        btn_9.setBounds(290, 230, 50, 50);

        lblscore.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblscore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblscore.setText("0");
        add(lblscore);
        lblscore.setBounds(50, 170, 50, 30);

        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/btnclear.png"))); // NOI18N
        btnclear.setActionCommand("clear");
        btnclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnclear.setPreferredSize(new java.awt.Dimension(55, 55));
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        add(btnclear);
        btnclear.setBounds(360, 240, 70, 40);

        lblLevel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLevel.setText("1");
        add(lblLevel);
        lblLevel.setBounds(390, 50, 60, 20);

        lblUsername.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(204, 0, 51));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Arshjot");
        add(lblUsername);
        lblUsername.setBounds(210, 40, 130, 40);

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        add(btnStart);
        btnStart.setBounds(40, 50, 80, 29);
        add(lblTime);
        lblTime.setBounds(480, 50, 100, 40);

        lblbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamepkg/gamebk.png"))); // NOI18N
        add(lblbackground);
        lblbackground.setBounds(0, 0, 600, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        
        val.append("8");
        txtusernumber.setText(val.toString());
        
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btnPlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayAgainActionPerformed
        // TODO add your handling code here:
        
        btnStart.setEnabled(true);
        btnGuess.setEnabled(false);
        
        lblLevel.setText(""+level);
        lblrange.setText("Pick a number from 0-"+range);
        randomnum=random.nextInt(range);System.out.println(randomnum);
        
        turns=5;
        lblturns.setText(""+turns);
        lblresult.setText("Lets Start");
        txtusernumber.setText("");
        //btnGuess.setEnabled(true);
           
        val.delete(0, val.length());
        
        
        

    }//GEN-LAST:event_btnPlayAgainActionPerformed

    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed
        // TODO add your handling code here:
        
        //------------- Empty String Check
        if(val.toString().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter Number");
           
        }
        
       else
        {
            
            int guessnum=Integer.parseInt(val.toString());
        
        //-----------Out of Range check
            if(guessnum>range)
            {
                JOptionPane.showMessageDialog(null, "Out of range value\n Insert value from range 0-"+range);
                txtusernumber.setText("");
                val.delete(0, val.length());
            }
        //----------- if Validation true, Start game    
            else
            {
                //===================== Thread Stop
            timerClass.stop();
            
            setTurns();
                        
            //turns--;
            //lblturns.setText(""+turns);

            if(turns>0)
            {

                if(guessnum==randomnum)
                {
                    lblresult.setText("You Won... The number is "+guessnum);
                    btnGuess.setEnabled(false);
                    updateScore();
                    
                }

                else if(guessnum>randomnum)
                {
                    lblresult.setText("Your number is too high");
                    timerClass =new TimerClass(btnGuess,btnStart,lblTime,this);
                    timerClass.start();
                }

                else if (guessnum<randomnum)
                {
                    lblresult.setText("Your number is too low");
                    timerClass =new TimerClass(btnGuess,btnStart,lblTime,this);
                    timerClass.start();
                }

                ///---------------- Clearing textbox

                txtusernumber.setText("");
                val.delete(0, val.length());
                //---------------Start new Timer wrong Guess
                 
            }
            else
            {
                btnGuess.setEnabled(false);
                lblresult.setText("Please try again");
               // ImageIcon imgicon=new ImageIcon(getClass().getResource("btn1.png"));
                JOptionPane.showMessageDialog(null, "No turns left. Computer number was "+randomnum, "Play again", JOptionPane.ERROR_MESSAGE);
            }
            }
        }
    }//GEN-LAST:event_btnGuessActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
       
        val.append("1");
        txtusernumber.setText(val.toString());
       
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        
        val.append("2");
        txtusernumber.setText(val.toString());
                
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
       
        val.append("3");
        txtusernumber.setText(val.toString());
        
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
       
        val.append("4");
        txtusernumber.setText(val.toString());
        
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
      
        val.append("5");
        txtusernumber.setText(val.toString());
        
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
       
        val.append("6");
        txtusernumber.setText(val.toString());
        
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
       
        val.append("7");
        txtusernumber.setText(val.toString());
       
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        
        val.append("9");
        txtusernumber.setText(val.toString());
        
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // TODO add your handling code here:
      
        val.append("0");
        txtusernumber.setText(val.toString());
        
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtusernumber.setText("");
        val.delete(0, val.length());
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnGuessMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuessMouseEntered
        // TODO add your handling code here:
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnGuessMouseEntered

    private void btnGuessMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuessMouseExited
        // TODO add your handling code here:
         setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnGuessMouseExited

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        timerClass =new TimerClass(btnGuess,btnStart,lblTime,this);
        timerClass.start();
        btnStart.setEnabled(false);
        btnGuess.setEnabled(true);
    }//GEN-LAST:event_btnStartActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuess;
    private javax.swing.JButton btnPlayAgain;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btnclear;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblbackground;
    private javax.swing.JLabel lblrange;
    private javax.swing.JLabel lblresult;
    private javax.swing.JLabel lblscore;
    private javax.swing.JLabel lblturns;
    private javax.swing.JTextField txtusernumber;
    // End of variables declaration//GEN-END:variables

    private void updateScore() {
       switch(level){
           case 1:
               score=score+10;
               break;
           case 2:
                score=score+15;
               break;
           case 3:
                score=score+20;
               break;
           default:
               System.out.println("score err");
               break;
       }
       lblscore.setText(""+score);
       if(score>=30&&score<50)
       {
           range=15;
           level=2;
       }
        
       else if(score>=50)
       {
           range=20;
           level=3;
       }
       
             
    }

    private void setRange() {
       switch(level){
           case 1:
               range=10;
               break;
           case 2:
               range=15;
               break;
           case 3:
               range=20;
               break;
           default:
               System.out.println("Range err");
               break;
       }
           
    }

    public void setTurns() {
        turns--;
        lblturns.setText(""+turns);
    }
}
