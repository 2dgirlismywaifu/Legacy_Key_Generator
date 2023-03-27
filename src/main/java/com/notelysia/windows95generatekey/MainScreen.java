package com.notelysia.windows95generatekey;

import com.notelysia.windows95generatekey.WindowsNTAndOffice95.WindowsNTExplain;
import com.notelysia.windows95generatekey.Windows95.Windows95Explain;
import com.notelysia.windows95generatekey.Windows95.Windows95Key;
import com.notelysia.windows95generatekey.WindowsNTAndOffice95.Windows95RTMKey;
import com.notelysia.windows95generatekey.WindowsNTAndOffice95.WindowsNTKey;

public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    Windows95Explain windows95Explain;
    Windows95Key windows95Key;
    Windows95RTMKey windows95RTMKey;
    WindowsNTExplain windowsNTExplain;
    WindowsNTKey windowsNTKey;
    public MainScreen() {
        initComponents();
        IconImageUtilities.setIconImage(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Windows95Pane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GenereateWindows95 = new javax.swing.JButton();
        KeyWindows95Return = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        KeyWindows95Explain = new javax.swing.JLabel();
        WindowsNTPane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GenereateWindowsNT = new javax.swing.JButton();
        KeyWindowsNTReturn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        KeyWindowsNTExplain = new javax.swing.JLabel();
        Windows95RTM = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        MainMenu = new javax.swing.JMenu();
        Windows95Explain = new javax.swing.JMenuItem();
        WindowsNTExplain = new javax.swing.JMenuItem();
        ExitProgram = new javax.swing.JMenuItem();
        HelpMenu = new javax.swing.JMenu();
        AboutProgram = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Windows 95 Generate Key");
        setIconImages(null);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Windows 95 OEM");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-windows-95-96.png"))); // NOI18N

        GenereateWindows95.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GenereateWindows95.setText("Generate Key");
        GenereateWindows95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenereateWindows95ActionPerformed(evt);
            }
        });

        KeyWindows95Return.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        KeyWindows95Return.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KeyWindows95Return.setToolTipText("");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-help-48.png"))); // NOI18N

        KeyWindows95Explain.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        KeyWindows95Explain.setForeground(new java.awt.Color(51, 51, 255));
        KeyWindows95Explain.setText("How this key can generate ?");
        KeyWindows95Explain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeyWindows95ExplainMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Windows95PaneLayout = new javax.swing.GroupLayout(Windows95Pane);
        Windows95Pane.setLayout(Windows95PaneLayout);
        Windows95PaneLayout.setHorizontalGroup(
            Windows95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Windows95PaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Windows95PaneLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(Windows95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Windows95PaneLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KeyWindows95Explain, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Windows95PaneLayout.createSequentialGroup()
                        .addComponent(KeyWindows95Return, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GenereateWindows95)
                        .addGap(43, 43, 43))))
        );
        Windows95PaneLayout.setVerticalGroup(
            Windows95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Windows95PaneLayout.createSequentialGroup()
                .addGroup(Windows95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Windows95PaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Windows95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KeyWindows95Return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenereateWindows95)))
                    .addGroup(Windows95PaneLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Windows95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Windows95PaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(KeyWindows95Explain)
                        .addGap(13, 13, 13)))
                .addGap(18, 18, 18))
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Windows 95 RTM, Windows NT 4.0 / Office 95");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-windows-95-96.png"))); // NOI18N

        GenereateWindowsNT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GenereateWindowsNT.setText("Generate Key");
        GenereateWindowsNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenereateWindowsNTActionPerformed(evt);
            }
        });

        KeyWindowsNTReturn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        KeyWindowsNTReturn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KeyWindowsNTReturn.setToolTipText("");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-help-48.png"))); // NOI18N

        KeyWindowsNTExplain.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        KeyWindowsNTExplain.setForeground(new java.awt.Color(51, 51, 255));
        KeyWindowsNTExplain.setText("How this key can generate ?");
        KeyWindowsNTExplain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeyWindowsNTExplainMouseClicked(evt);
            }
        });

        Windows95RTM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Windows95RTM.setText("Windows 95 RTM Key (NOT OEM KEY)");

        javax.swing.GroupLayout WindowsNTPaneLayout = new javax.swing.GroupLayout(WindowsNTPane);
        WindowsNTPane.setLayout(WindowsNTPaneLayout);
        WindowsNTPaneLayout.setHorizontalGroup(
            WindowsNTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(WindowsNTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                        .addComponent(Windows95RTM)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KeyWindowsNTExplain, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                        .addComponent(KeyWindowsNTReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GenereateWindowsNT)
                        .addGap(43, 43, 43))))
        );
        WindowsNTPaneLayout.setVerticalGroup(
            WindowsNTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                .addGroup(WindowsNTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(WindowsNTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KeyWindowsNTReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenereateWindowsNT)))
                    .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Windows95RTM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(WindowsNTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WindowsNTPaneLayout.createSequentialGroup()
                        .addComponent(KeyWindowsNTExplain)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WindowsNTPaneLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18))))
        );

        MainMenu.setText("File");

        Windows95Explain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-windows-95-24.png"))); // NOI18N
        Windows95Explain.setText("Windows 95 Explain Key");
        Windows95Explain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Windows95ExplainActionPerformed(evt);
            }
        });
        MainMenu.add(Windows95Explain);

        WindowsNTExplain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-windows-95-24.png"))); // NOI18N
        WindowsNTExplain.setText("Windows NT 4.0 / Office 95 Explain Key");
        WindowsNTExplain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WindowsNTExplainActionPerformed(evt);
            }
        });
        MainMenu.add(WindowsNTExplain);

        ExitProgram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-close-window-24.png"))); // NOI18N
        ExitProgram.setText("Exit");
        ExitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitProgramActionPerformed(evt);
            }
        });
        MainMenu.add(ExitProgram);

        jMenuBar1.add(MainMenu);

        HelpMenu.setText("Help");

        AboutProgram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-help-24.png"))); // NOI18N
        AboutProgram.setText("About Program");
        AboutProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutProgramActionPerformed(evt);
            }
        });
        HelpMenu.add(AboutProgram);

        jMenuBar1.add(HelpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Windows95Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WindowsNTPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Windows95Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WindowsNTPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GenereateWindows95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenereateWindows95ActionPerformed
        // TODO add your handling code here:
        windows95Key = new Windows95Key();     
        KeyWindows95Return.setText(windows95Key.getWindows95Key());
        
    }//GEN-LAST:event_GenereateWindows95ActionPerformed

    private void GenereateWindowsNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenereateWindowsNTActionPerformed
        // TODO add your handling code here:
        if (Windows95RTM.isSelected()) {
            windows95RTMKey = new Windows95RTMKey();
            KeyWindowsNTReturn.setText(windows95RTMKey.getWindows95RTMKey());
        }
        else {
            windowsNTKey = new WindowsNTKey();     
            KeyWindowsNTReturn.setText(windowsNTKey.getWindowsNTKey());
        }
        
    }//GEN-LAST:event_GenereateWindowsNTActionPerformed

    private void Windows95ExplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Windows95ExplainActionPerformed
        // TODO add your handling code here:
        windows95Explain = new Windows95Explain();
        windows95Explain.setVisible(true);
        windows95Explain.setTitle("Windows 95 Explain");
        windows95Explain.setResizable(false);
    }//GEN-LAST:event_Windows95ExplainActionPerformed

    private void ExitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProgramActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitProgramActionPerformed

    private void WindowsNTExplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WindowsNTExplainActionPerformed
        // TODO add your handling code here:
        windowsNTExplain = new WindowsNTExplain();
        windowsNTExplain.setVisible(true);
        windowsNTExplain.setTitle("Windows NT 4.0/Office 95 Explain");
        windowsNTExplain.setResizable(false);
    }//GEN-LAST:event_WindowsNTExplainActionPerformed

    private void KeyWindows95ExplainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeyWindows95ExplainMouseClicked
        // TODO add your handling code here:
        windows95Explain = new Windows95Explain();
        windows95Explain.setVisible(true);
        windows95Explain.setTitle("Windows 95 Explain");
        windows95Explain.setResizable(false);
    }//GEN-LAST:event_KeyWindows95ExplainMouseClicked

    private void KeyWindowsNTExplainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeyWindowsNTExplainMouseClicked
        // TODO add your handling code here:
        windowsNTExplain = new WindowsNTExplain();
        windowsNTExplain.setVisible(true);
        windowsNTExplain.setTitle("Windows NT 4.0/Office 95 Explain");
        windowsNTExplain.setResizable(false);
    }//GEN-LAST:event_KeyWindowsNTExplainMouseClicked

    private void AboutProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutProgramActionPerformed
        // TODO add your handling code here:
        AboutSoftware frame = new AboutSoftware();    
        frame.setVisible(true);
        frame.setTitle("About Software");
        frame.setResizable(false);
    }//GEN-LAST:event_AboutProgramActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Use FlatLaf theme */
        LookandFeel.setTheme();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
              
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutProgram;
    private javax.swing.JMenuItem ExitProgram;
    private javax.swing.JButton GenereateWindows95;
    private javax.swing.JButton GenereateWindowsNT;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JLabel KeyWindows95Explain;
    private javax.swing.JTextField KeyWindows95Return;
    private javax.swing.JLabel KeyWindowsNTExplain;
    private javax.swing.JTextField KeyWindowsNTReturn;
    private javax.swing.JMenu MainMenu;
    private javax.swing.JMenuItem Windows95Explain;
    private javax.swing.JPanel Windows95Pane;
    private javax.swing.JCheckBox Windows95RTM;
    private javax.swing.JMenuItem WindowsNTExplain;
    private javax.swing.JPanel WindowsNTPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
