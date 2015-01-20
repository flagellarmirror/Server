/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.awt.event.KeyEvent;

/**
 *
 * @author EMA
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        lbl_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_chat = new javax.swing.JTextArea();
        lbl_shell = new javax.swing.JLabel();
        txt_send = new javax.swing.JTextField();
        btn_on = new javax.swing.JButton();
        btn_off = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SERVER FELL CHAT");

        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("SERVER FELL CHAT");

        txt_chat.setEditable(false);
        txt_chat.setColumns(20);
        txt_chat.setRows(5);
        jScrollPane1.setViewportView(txt_chat);

        lbl_shell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_shell.setText("Command shell");

        txt_send.setText("Write help for information...");
        txt_send.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_sendFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_sendFocusLost(evt);
            }
        });
        txt_send.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_sendKeyPressed(evt);
            }
        });

        btn_on.setText("ACTIVATE SERVER");
        btn_on.setPreferredSize(new java.awt.Dimension(135, 23));
        btn_on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_onActionPerformed(evt);
            }
        });

        btn_off.setText("DEACTIVATE SERVER");
        btn_off.setEnabled(false);
        btn_off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_offActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(lbl_shell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_on, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                        .addComponent(btn_off))
                    .addComponent(txt_send))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_on, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btn_off, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_shell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_send, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        setSize(new java.awt.Dimension(626, 329));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sendFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_sendFocusGained
        // TODO add your handling code here:
        txt_send.setText("/");
    }//GEN-LAST:event_txt_sendFocusGained

    private void txt_sendFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_sendFocusLost
        // TODO add your handling code here:
        txt_send.setText("Write help for information...");
    }//GEN-LAST:event_txt_sendFocusLost

    private void txt_sendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sendKeyPressed
        // TODO add your handling code here:
        //Check if the key pressed is enter
        if(evt.getExtendedKeyCode()==KeyEvent.VK_ENTER){
            System.out.println(txt_send.getText());
            txt_send.setText("/");
        }
    }//GEN-LAST:event_txt_sendKeyPressed

    private void btn_onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_onActionPerformed
        // TODO add your handling code here:
        btn_on.setEnabled(false);
        btn_off.setEnabled(true);
    }//GEN-LAST:event_btn_onActionPerformed

    private void btn_offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_offActionPerformed
        // TODO add your handling code here:
        btn_off.setEnabled(false);
        btn_on.setEnabled(true);
    }//GEN-LAST:event_btn_offActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_off;
    private javax.swing.JButton btn_on;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_shell;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextArea txt_chat;
    private javax.swing.JTextField txt_send;
    // End of variables declaration//GEN-END:variables
}
