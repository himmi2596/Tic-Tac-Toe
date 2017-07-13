package Project;

import javax.swing.JOptionPane;
public class TicTacToe extends javax.swing.JFrame {

    String selectedvalue;
    String newselectedvalue;
    String valuematch;
    int check;
    String pl1="",pl2="";
    public TicTacToe() { 
        initComponents();
        
        restart();
    }
    void restart()
    {
        pl1=JOptionPane.showInputDialog(TicTacToe.this,"Enter the Name Of Player 1");
        pl2=JOptionPane.showInputDialog(TicTacToe.this,"Enter the Name Of Player 2");
        
        lb1.setText(pl1+" : O");
        lb2.setText(pl2+" : X");
        
        selectedvalue=new String("");
        newselectedvalue=new String("");
        valuematch=new String("a");
        check=0;
        this.setVisible(true);
        this.setSize(600,500);  
        myp.setVisible(false);
        bt1.setEnabled(true);
        bt2.setEnabled(true);
        bt3.setEnabled(true);
        bt4.setEnabled(true);
        bt5.setEnabled(true);
        bt6.setEnabled(true);
        bt7.setEnabled(true);
        bt8.setEnabled(true);
        bt9.setEnabled(true);
        
        bt1.setLabel("");
        bt2.setLabel("");
        bt3.setLabel("");
        bt4.setLabel("");
        bt5.setLabel("");
        bt6.setLabel("");
        bt7.setLabel("");
        bt8.setLabel("");
        bt9.setLabel("");
        
    }
    void chooseWinner()
    {
        String b1=bt1.getLabel();
        String b2=bt2.getLabel();
        String b3=bt3.getLabel();
        String b4=bt4.getLabel();
        String b5=bt5.getLabel();
        String b6=bt6.getLabel();
        String b7=bt7.getLabel();
        String b8=bt8.getLabel();
        String b9=bt9.getLabel();
        if(b1==b2 && b2==b3 && b1==b3 && b1!="")
        {
            if(b1=="O")
                lb3.setText("  Congratulations!  "+pl1+" won the game.");
            else
                lb3.setText("  Congratulations!  "+pl2+" won the game.");
            myp.setVisible(true);
            chooseExit();
        }
        else if(b4==b5 && b5==b6 && b4==b6 && b4!="")
        {
            if(b4=="O")
                lb3.setText("  Congratulations!  "+pl1+" won the game.");
            else
                lb3.setText("  Congratulations!  "+pl2+" won the game.");
            myp.setVisible(true);
            chooseExit();
        }
        else if(b7==b8 && b8==b9 && b7==b9 && b7!="")
        {
            if(b7=="O")
                lb3.setText("  Congratulations!  "+pl1+" won the game.");
            else
                lb3.setText("  Congratulations!  "+pl2+" won the game.");
            myp.setVisible(true);
            chooseExit();
        }
        else if(b1==b4 && b4==b7 && b1==b7 && b1!="")
        {
            if(b1=="O")
                lb3.setText("  Congratulations!  "+pl1+" won the game.");
            else
                lb3.setText("  Congratulations!  "+pl2+" won the game.");
            myp.setVisible(true);
            chooseExit();
        }
        else if(b2==b5 && b5==b8 && b2==b8 && b2!="")
        {
            if(b2=="O")
                lb3.setText("  Congratulations!  "+pl1+" won the game.");
            else
                lb3.setText("  Congratulations!  "+pl2+" won the game.");
            myp.setVisible(true);
            chooseExit();
        }
        else if(b3==b6 && b6==b9 && b3==b9 && b3!="")
        {
            if(b3=="O")
                lb3.setText("  Congratulations!  "+pl1+" won the game.");
            else
                lb3.setText("  Congratulations!  "+pl2+" won the game.");
            myp.setVisible(true);
            chooseExit();
        }
        else if(b1==b5 && b5==b9 && b1==b9 && b1!="")
        {
            if(b1=="O")
                lb3.setText("  Congratulations!  "+pl1+" won the game.");
            else
                lb3.setText("  Congratulations!  "+pl2+" won the game.");
            myp.setVisible(true);
            chooseExit();
        }
        else if(b3==b5 && b5==b7 && b3==b7 && b3!="")
        {
            if(b3=="O")
                lb3.setText("  Congratulations!  "+pl1+" won the game.");
            else
                lb3.setText("  Congratulations!  "+pl2+" won the game.");
            myp.setVisible(true);
            chooseExit();
        }
        else
        {
            if(selectedvalue!="")
            {
                check++;
                if(check==9)
                {
                    JOptionPane.showMessageDialog(TicTacToe.this,"Game Tied");
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch(Exception ex)
                    {
                        ex.printStackTrace();
                    }
                    chooseExit();
                }
            }
        }
    }
    void chooseExit()
    {
        int ans=JOptionPane.showConfirmDialog(TicTacToe.this,"Do you want to play again?","Tic-Tac-Toe",JOptionPane.YES_NO_OPTION);
        if(ans==JOptionPane.YES_OPTION)
        {
            restart();        
        }
        else                
        {
            TicTacToe.this.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        bt10 = new javax.swing.JButton();
        bt11 = new javax.swing.JButton();
        myp = new javax.swing.JPanel();
        lb3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bt1.setBackground(new java.awt.Color(255, 0, 0));
        bt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt1.setForeground(new java.awt.Color(255, 0, 0));
        bt1.setText("");
        bt1.setFocusable(false);
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(160, 160, 50, 50);

        bt2.setBackground(new java.awt.Color(255, 0, 0));
        bt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt2.setForeground(new java.awt.Color(255, 0, 0));
        bt2.setText("");
        bt2.setFocusable(false);
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(210, 160, 50, 50);

        bt3.setBackground(new java.awt.Color(255, 0, 0));
        bt3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt3.setForeground(new java.awt.Color(255, 0, 0));
        bt3.setText("");
        bt3.setFocusable(false);
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(260, 160, 50, 50);

        bt4.setBackground(new java.awt.Color(255, 0, 0));
        bt4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt4.setForeground(new java.awt.Color(255, 0, 0));
        bt4.setText("");
        bt4.setFocusable(false);
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        getContentPane().add(bt4);
        bt4.setBounds(160, 210, 50, 50);

        bt5.setBackground(new java.awt.Color(255, 0, 0));
        bt5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt5.setForeground(new java.awt.Color(255, 0, 0));
        bt5.setText("");
        bt5.setFocusable(false);
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        getContentPane().add(bt5);
        bt5.setBounds(210, 210, 50, 50);

        bt6.setBackground(new java.awt.Color(255, 0, 0));
        bt6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt6.setForeground(new java.awt.Color(255, 0, 0));
        bt6.setText("");
        bt6.setFocusable(false);
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        getContentPane().add(bt6);
        bt6.setBounds(260, 210, 50, 50);

        bt7.setBackground(new java.awt.Color(255, 0, 0));
        bt7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt7.setForeground(new java.awt.Color(255, 0, 0));
        bt7.setText("");
        bt7.setFocusable(false);
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        getContentPane().add(bt7);
        bt7.setBounds(160, 260, 50, 50);

        bt8.setBackground(new java.awt.Color(255, 0, 0));
        bt8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt8.setForeground(new java.awt.Color(255, 0, 0));
        bt8.setText("");
        bt8.setFocusable(false);
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        getContentPane().add(bt8);
        bt8.setBounds(210, 260, 50, 50);

        bt9.setBackground(new java.awt.Color(255, 0, 0));
        bt9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt9.setForeground(new java.awt.Color(255, 0, 0));
        bt9.setText("");
        bt9.setFocusable(false);
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        getContentPane().add(bt9);
        bt9.setBounds(260, 260, 50, 50);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        lb1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("Player 1 : O");
        jPanel3.add(lb1);
        lb1.setBounds(10, 10, 390, 20);

        lb2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2.setText("Player 2 : X");
        jPanel3.add(lb2);
        lb2.setBounds(10, 30, 390, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(60, 80, 410, 60);

        bt10.setBackground(new java.awt.Color(255, 0, 0));
        bt10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt10.setForeground(new java.awt.Color(255, 255, 255));
        bt10.setText("O");
        bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt10ActionPerformed(evt);
            }
        });
        getContentPane().add(bt10);
        bt10.setBounds(320, 180, 50, 50);

        bt11.setBackground(new java.awt.Color(255, 0, 0));
        bt11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt11.setForeground(new java.awt.Color(255, 255, 255));
        bt11.setText("X");
        bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt11ActionPerformed(evt);
            }
        });
        getContentPane().add(bt11);
        bt11.setBounds(320, 240, 50, 50);

        myp.setBackground(new java.awt.Color(255, 0, 0));
        myp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        myp.setLayout(null);

        lb3.setBackground(new java.awt.Color(255, 255, 255));
        lb3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        myp.add(lb3);
        lb3.setBounds(20, 0, 590, 30);

        getContentPane().add(myp);
        myp.setBounds(-10, 340, 620, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/tic.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -20, 650, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt10ActionPerformed
        newselectedvalue=bt10.getLabel();
        if(newselectedvalue.equals(valuematch)==true )
            JOptionPane.showMessageDialog(TicTacToe.this, "Turn of the Opponent");
        else
            selectedvalue=newselectedvalue;
    }//GEN-LAST:event_bt10ActionPerformed

    private void bt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt11ActionPerformed
        newselectedvalue=bt11.getLabel();
        if(newselectedvalue.equals(valuematch)==true )
            JOptionPane.showMessageDialog(TicTacToe.this, "Turn of the Opponent");
        else
            selectedvalue=newselectedvalue;
    }//GEN-LAST:event_bt11ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        bt1.setLabel(selectedvalue);
        
        if(selectedvalue!="")
        {
            valuematch=selectedvalue;
            bt1.setEnabled(false);
        }
        chooseWinner();
        selectedvalue="";
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        bt2.setLabel(selectedvalue);
        
        if(selectedvalue!="")
        {
            valuematch=selectedvalue;
            bt2.setEnabled(false);
        }
        
        chooseWinner();
        selectedvalue="";
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
        bt3.setLabel(selectedvalue);  
        
        if(selectedvalue!="")
        {
            valuematch=selectedvalue;
            bt3.setEnabled(false);
        }
        chooseWinner();
        selectedvalue="";
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
        bt4.setLabel(selectedvalue);
        
        if(selectedvalue!="")
        {
            valuematch=selectedvalue;
            bt4.setEnabled(false);
        }
        chooseWinner();
        selectedvalue="";
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
        bt5.setLabel(selectedvalue);      
        
        if(selectedvalue!="")
        {
            valuematch=selectedvalue;
            bt5.setEnabled(false);
        }
        chooseWinner();
        selectedvalue="";
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        // TODO add your handling code here:
        bt6.setLabel(selectedvalue);        
        
        if(selectedvalue!="")
        {
            valuematch=selectedvalue;
            bt6.setEnabled(false);
        }
        chooseWinner();
        selectedvalue="";
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        // TODO add your handling code here:
        bt7.setLabel(selectedvalue);        
        
        if(selectedvalue!="")
        {
            valuematch=selectedvalue;
            bt7.setEnabled(false);
        }
        chooseWinner();
        selectedvalue="";
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        // TODO add your handling code here:
        bt8.setLabel(selectedvalue);        
        
        if(selectedvalue!="")
        {
            valuematch=selectedvalue;
            bt8.setEnabled(false);
        }
        chooseWinner();
        selectedvalue="";
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        // TODO add your handling code here:
        bt9.setLabel(selectedvalue);        
        
        if(selectedvalue!="")
        {
            valuematch=selectedvalue;
            bt9.setEnabled(false);
        }
        chooseWinner();
        selectedvalue="";
    }//GEN-LAST:event_bt9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt11;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JPanel myp;
    // End of variables declaration//GEN-END:variables
}
