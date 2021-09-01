/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import project2.Frames.Desktop;
import project2.Frames.File;
import project2.Frames.FileRec;
import project2.Frames.Print;



/**
 *
 * @author Hp Beats Audio
 */
public class Main extends javax.swing.JFrame {
    GridBagLayout layout = new GridBagLayout();
    Desktop d;
    File f;
    Print p;
    FileRec fr;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        d = new Desktop();
        f = new File();
        p = new Print();
        fr = new FileRec();
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(d,c);
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(f,c);
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(p,c);
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(fr,c);
        d.setVisible(true);
        f.setVisible(false);
        p.setVisible(false);
        fr.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        Panelbtn = new javax.swing.JPanel();
        Deskbtn = new javax.swing.JButton();
        filebtn = new javax.swing.JButton();
        Printbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LogninMenuItem = new javax.swing.JMenuItem();
        SignupMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        RemoteMenuItem = new javax.swing.JMenuItem();
        HelpMenuItem = new javax.swing.JMenu();
        DeskkMenuItem = new javax.swing.JMenuItem();
        MenuAdmin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(16, 52, 81));
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("PC Controller");
        jInternalFrame1.setVisible(true);

        Panelbtn.setBackground(new java.awt.Color(13, 89, 153));
        Panelbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Deskbtn.setBackground(new java.awt.Color(13, 89, 153));
        Deskbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Deskbtn.setText("Desktop Sharing");
        Deskbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeskbtnActionPerformed(evt);
            }
        });

        filebtn.setBackground(new java.awt.Color(13, 89, 153));
        filebtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        filebtn.setText("File Sharing");
        filebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filebtnActionPerformed(evt);
            }
        });

        Printbtn.setBackground(new java.awt.Color(13, 89, 153));
        Printbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Printbtn.setText("Remote printing");
        Printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintbtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(13, 89, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Receive File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelbtnLayout = new javax.swing.GroupLayout(Panelbtn);
        Panelbtn.setLayout(PanelbtnLayout);
        PanelbtnLayout.setHorizontalGroup(
            PanelbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Printbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelbtnLayout.createSequentialGroup()
                .addComponent(Deskbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelbtnLayout.setVerticalGroup(
            PanelbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelbtnLayout.createSequentialGroup()
                .addComponent(Deskbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jInternalFrame1.getContentPane().add(Panelbtn, java.awt.BorderLayout.LINE_START);

        DynamicPanel.setBackground(new java.awt.Color(13, 89, 153));
        DynamicPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        jInternalFrame1.getContentPane().add(DynamicPanel, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        LogninMenuItem.setText("Log In");
        LogninMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogninMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(LogninMenuItem);

        SignupMenuItem.setText("Sign Up");
        SignupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(SignupMenuItem);

        jMenuItem1.setText("Exit");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenu6.setText("Clear");
        jMenu2.add(jMenu6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Remote");

        RemoteMenuItem.setText("Remote Control");
        RemoteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoteMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(RemoteMenuItem);

        jMenuBar1.add(jMenu3);

        HelpMenuItem.setText("Help");
        HelpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpMenuItemActionPerformed(evt);
            }
        });

        DeskkMenuItem.setText("Help Desk");
        DeskkMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeskkMenuItemActionPerformed(evt);
            }
        });
        HelpMenuItem.add(DeskkMenuItem);

        MenuAdmin.setText("Admin");
        MenuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminActionPerformed(evt);
            }
        });
        HelpMenuItem.add(MenuAdmin);

        jMenuBar1.add(HelpMenuItem);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeskbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeskbtnActionPerformed
        d.setVisible(true);
        f.setVisible(false);
        p.setVisible(false);
        fr.setVisible(false);
    }//GEN-LAST:event_DeskbtnActionPerformed

    private void filebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filebtnActionPerformed
       d.setVisible(false);
       f.setVisible(true);
       p.setVisible(false);
       fr.setVisible(false);
    }//GEN-LAST:event_filebtnActionPerformed

    private void PrintbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintbtnActionPerformed
       d.setVisible(false);
       f.setVisible(false);
       p.setVisible(true);
       fr.setVisible(false);
    }//GEN-LAST:event_PrintbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       d.setVisible(false);
       f.setVisible(false);
       p.setVisible(false);
       fr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SignupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupMenuItemActionPerformed
       SignUp sp = new SignUp();
       sp.setVisible(true);
    }//GEN-LAST:event_SignupMenuItemActionPerformed

    private void LogninMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogninMenuItemActionPerformed
      SignIn si = new SignIn();
      si.setVisible(true);
    }//GEN-LAST:event_LogninMenuItemActionPerformed

    private void RemoteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoteMenuItemActionPerformed
        Remote1 r1 = new Remote1();
        r1.setVisible(true);
    }//GEN-LAST:event_RemoteMenuItemActionPerformed

    private void DeskkMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeskkMenuItemActionPerformed
       HelpDesk h = new HelpDesk();
       h.setVisible(true);
    }//GEN-LAST:event_DeskkMenuItemActionPerformed

    private void MenuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminActionPerformed
        AdminLog ad = new AdminLog();
        ad.setVisible(true);
    }//GEN-LAST:event_MenuAdminActionPerformed

    private void HelpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpMenuItemActionPerformed
       
    }//GEN-LAST:event_HelpMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deskbtn;
    private javax.swing.JMenuItem DeskkMenuItem;
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JMenu HelpMenuItem;
    private javax.swing.JMenuItem LogninMenuItem;
    private javax.swing.JMenuItem MenuAdmin;
    private javax.swing.JPanel Panelbtn;
    private javax.swing.JButton Printbtn;
    private javax.swing.JMenuItem RemoteMenuItem;
    private javax.swing.JMenuItem SignupMenuItem;
    private javax.swing.JButton filebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
