/*
 * Copyright By @2dgirlismywaifu (2023)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.notelysia.windows95generatekey;

import com.notelysia.windows95generatekey.OfficeKey.Office95;
import com.notelysia.windows95generatekey.OfficeKey.Office95Explain;
import com.notelysia.windows95generatekey.OfficeKey.Office97;
import com.notelysia.windows95generatekey.OfficeKey.Office97Explain;

public class OfficeScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    Office95Explain office95Explain;
    Office97Explain office97Explain;
    Office95 office95;
    Office97 office97;
    SetTheme setTheme;
    IconImageUtilities iconImageUtilities = new IconImageUtilities();
    public OfficeScreen() {
        initComponents();
        iconImageUtilities.setOfficeImage(this);
        DefaultContextMenu.addDefaultContextMenu(Office95Return);
        DefaultContextMenu.addDefaultContextMenu(Office97Return);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Office95Pane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GenereateOffice95 = new javax.swing.JButton();
        Office95Return = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Office95ExplainMouse = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Office97Pane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GenereateOffice97 = new javax.swing.JButton();
        Office97Return = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Office97ExplainMouse = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MainMenu = new javax.swing.JMenu();
        WindowsKeyGenerate = new javax.swing.JMenuItem();
        Office95Explain = new javax.swing.JMenuItem();
        Office97Explain = new javax.swing.JMenuItem();
        ExitProgram = new javax.swing.JMenuItem();
        HelpMenu = new javax.swing.JMenu();
        ChangeTheme = new javax.swing.JMenu();
        FlatlafLight = new javax.swing.JMenuItem();
        FlatlafDark = new javax.swing.JMenuItem();
        IntelliJLight = new javax.swing.JMenuItem();
        IntelliJDark = new javax.swing.JMenuItem();
        macOSLight = new javax.swing.JMenuItem();
        macOSDark = new javax.swing.JMenuItem();
        AboutProgram = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Office 95 - 97 Generate Key");
        setIconImages(null);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Microsoft Office 95");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office95-96.png"))); // NOI18N

        GenereateOffice95.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GenereateOffice95.setText("Generate Key");
        GenereateOffice95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenereateOffice95ActionPerformed(evt);
            }
        });

        Office95Return.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Office95Return.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Office95Return.setToolTipText("");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-help-48.png"))); // NOI18N

        Office95ExplainMouse.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        Office95ExplainMouse.setForeground(new java.awt.Color(51, 51, 255));
        Office95ExplainMouse.setText("How this key can generate ?");
        Office95ExplainMouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Office95ExplainMouseMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Format: XXX-XXXXXXX");

        javax.swing.GroupLayout Office95PaneLayout = new javax.swing.GroupLayout(Office95Pane);
        Office95Pane.setLayout(Office95PaneLayout);
        Office95PaneLayout.setHorizontalGroup(
            Office95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Office95PaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(Office95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Office95PaneLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(Office95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Office95PaneLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Office95ExplainMouse, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Office95PaneLayout.createSequentialGroup()
                        .addComponent(Office95Return, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(GenereateOffice95)
                        .addGap(43, 43, 43))))
        );
        Office95PaneLayout.setVerticalGroup(
            Office95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Office95PaneLayout.createSequentialGroup()
                .addGroup(Office95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Office95PaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(Office95PaneLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Office95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Office95Return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenereateOffice95))
                .addGroup(Office95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Office95PaneLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Office95PaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Office95ExplainMouse)
                        .addGap(49, 49, 49))))
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Microsoft Office 97");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office95-96.png"))); // NOI18N

        GenereateOffice97.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GenereateOffice97.setText("Generate Key");
        GenereateOffice97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenereateOffice97ActionPerformed(evt);
            }
        });

        Office97Return.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Office97Return.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Office97Return.setToolTipText("");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-help-48.png"))); // NOI18N

        Office97ExplainMouse.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        Office97ExplainMouse.setForeground(new java.awt.Color(51, 51, 255));
        Office97ExplainMouse.setText("How this key can generate ?");
        Office97ExplainMouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Office97ExplainMouseMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Format: XXXX-XXXXXXX");

        javax.swing.GroupLayout Office97PaneLayout = new javax.swing.GroupLayout(Office97Pane);
        Office97Pane.setLayout(Office97PaneLayout);
        Office97PaneLayout.setHorizontalGroup(
            Office97PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Office97PaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Office97PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Office97PaneLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(Office97PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Office97PaneLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Office97ExplainMouse, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Office97PaneLayout.createSequentialGroup()
                        .addComponent(Office97Return, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(GenereateOffice97)
                        .addGap(43, 43, 43))))
        );
        Office97PaneLayout.setVerticalGroup(
            Office97PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Office97PaneLayout.createSequentialGroup()
                .addGroup(Office97PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Office97PaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(Office97PaneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Office97PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Office97Return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenereateOffice97))
                .addGap(25, 25, 25)
                .addGroup(Office97PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Office97PaneLayout.createSequentialGroup()
                        .addComponent(Office97ExplainMouse)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Office97PaneLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        MainMenu.setText("File");

        WindowsKeyGenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-windows-95-24.png"))); // NOI18N
        WindowsKeyGenerate.setText("Windows Key Generator");
        WindowsKeyGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WindowsKeyGenerateActionPerformed(evt);
            }
        });
        MainMenu.add(WindowsKeyGenerate);

        Office95Explain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office95-24.png"))); // NOI18N
        Office95Explain.setText("Office 95 Explain Key");
        Office95Explain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Office95ExplainActionPerformed(evt);
            }
        });
        MainMenu.add(Office95Explain);

        Office97Explain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office95-24.png"))); // NOI18N
        Office97Explain.setText("Office 97 Explain Key");
        Office97Explain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Office97ExplainActionPerformed(evt);
            }
        });
        MainMenu.add(Office97Explain);

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

        ChangeTheme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-theme-24.png"))); // NOI18N
        ChangeTheme.setText("Change Theme");

        FlatlafLight.setText("Flatlaf Light");
        FlatlafLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlatlafLightActionPerformed(evt);
            }
        });
        ChangeTheme.add(FlatlafLight);

        FlatlafDark.setText("Flatlaf Dark");
        FlatlafDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlatlafDarkActionPerformed(evt);
            }
        });
        ChangeTheme.add(FlatlafDark);

        IntelliJLight.setText("IntelliJ Light");
        IntelliJLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntelliJLightActionPerformed(evt);
            }
        });
        ChangeTheme.add(IntelliJLight);

        IntelliJDark.setText("IntelliJ Dark");
        IntelliJDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntelliJDarkActionPerformed(evt);
            }
        });
        ChangeTheme.add(IntelliJDark);

        macOSLight.setText("macOS Light");
        macOSLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macOSLightActionPerformed(evt);
            }
        });
        ChangeTheme.add(macOSLight);

        macOSDark.setText("macOS Dark");
        macOSDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macOSDarkActionPerformed(evt);
            }
        });
        ChangeTheme.add(macOSDark);

        HelpMenu.add(ChangeTheme);

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
                .addComponent(Office95Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Office97Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Office95Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Office97Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GenereateOffice95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenereateOffice95ActionPerformed
        // TODO add your handling code here:
        office95 = new Office95();
        Office95Return.setText(office95.getOffice95Key());                   
    }//GEN-LAST:event_GenereateOffice95ActionPerformed

    private void GenereateOffice97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenereateOffice97ActionPerformed
        // TODO add your handling code here:
        office97 = new Office97();
        Office97Return.setText(office97.getOffice97Key());        
    }//GEN-LAST:event_GenereateOffice97ActionPerformed

    private void Office95ExplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Office95ExplainActionPerformed
        // TODO add your handling code here:
        office95Explain = new Office95Explain();
        office95Explain.setVisible(true);
        office95Explain.setTitle("Office 95 Explain");
        office95Explain.setResizable(false);
    }//GEN-LAST:event_Office95ExplainActionPerformed

    private void ExitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProgramActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitProgramActionPerformed

    private void Office97ExplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Office97ExplainActionPerformed
        // TODO add your handling code here:
        office97Explain = new Office97Explain();
        office97Explain.setVisible(true);
        office97Explain.setTitle("Office 97 Explain");
        office97Explain.setResizable(false);
    }//GEN-LAST:event_Office97ExplainActionPerformed

    private void Office95ExplainMouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Office95ExplainMouseMouseClicked
        // TODO add your handling code here:
        office95Explain = new Office95Explain();
        office95Explain.setVisible(true);
        office95Explain.setTitle("Office 95 Explain");
        office95Explain.setResizable(false);
    }//GEN-LAST:event_Office95ExplainMouseMouseClicked

    private void Office97ExplainMouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Office97ExplainMouseMouseClicked
        // TODO add your handling code here:
        office97Explain = new Office97Explain();
        office97Explain.setVisible(true);
        office97Explain.setTitle("Office 97 Explain");
        office97Explain.setResizable(false);
    }//GEN-LAST:event_Office97ExplainMouseMouseClicked

    private void AboutProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutProgramActionPerformed
        // TODO add your handling code here:
        AboutSoftware frame = new AboutSoftware();    
        frame.setVisible(true);
        frame.setTitle("About Software");
        frame.setResizable(false);
    }//GEN-LAST:event_AboutProgramActionPerformed

    //FlatLaf Theme
    private void FlatlafLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlatlafLightActionPerformed
        // TODO add your handling code here:
        setTheme = new SetTheme();
        setTheme.FlatLafTheme("light");
    }//GEN-LAST:event_FlatlafLightActionPerformed

    private void FlatlafDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlatlafDarkActionPerformed
        // TODO add your handling code here:
        setTheme = new SetTheme();
        setTheme.FlatLafTheme("dark");
    }//GEN-LAST:event_FlatlafDarkActionPerformed

    private void IntelliJLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntelliJLightActionPerformed
        // TODO add your handling code here:
        setTheme = new SetTheme();
        setTheme.FlatLafTheme("intelliJLight");
    }//GEN-LAST:event_IntelliJLightActionPerformed

    private void IntelliJDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntelliJDarkActionPerformed
        // TODO add your handling code here:
        setTheme = new SetTheme();
        setTheme.FlatLafTheme("intelliJDark");
    }//GEN-LAST:event_IntelliJDarkActionPerformed

    private void macOSLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macOSLightActionPerformed
        // TODO add your handling code here:
        setTheme = new SetTheme();
        setTheme.FlatLafTheme("cupertinoLight");
    }//GEN-LAST:event_macOSLightActionPerformed

    private void macOSDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macOSDarkActionPerformed
        // TODO add your handling code here:
        setTheme = new SetTheme();
        setTheme.FlatLafTheme("cupertinoDark");
    }//GEN-LAST:event_macOSDarkActionPerformed

    private void WindowsKeyGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WindowsKeyGenerateActionPerformed
        // TODO add your handling code here:
        dispose();
        WindowsScreen frame = new WindowsScreen();    
        frame.setVisible(true);
        frame.setTitle("Windows 95, Windows NT 4.0 Generate Key");
        frame.setResizable(false);
    }//GEN-LAST:event_WindowsKeyGenerateActionPerformed
    //////////////////////////////////////////////////////////////////////////////
    /**
     * @param args the command line arguments
     */
    public static void main() {
        /* Use FlatLaf theme */
        LookandFeel.setTheme();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
              
                new OfficeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutProgram;
    private javax.swing.JMenu ChangeTheme;
    private javax.swing.JMenuItem ExitProgram;
    private javax.swing.JMenuItem FlatlafDark;
    private javax.swing.JMenuItem FlatlafLight;
    private javax.swing.JButton GenereateOffice95;
    private javax.swing.JButton GenereateOffice97;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JMenuItem IntelliJDark;
    private javax.swing.JMenuItem IntelliJLight;
    private javax.swing.JMenu MainMenu;
    private javax.swing.JMenuItem Office95Explain;
    private javax.swing.JLabel Office95ExplainMouse;
    private javax.swing.JPanel Office95Pane;
    private javax.swing.JTextField Office95Return;
    private javax.swing.JMenuItem Office97Explain;
    private javax.swing.JLabel Office97ExplainMouse;
    private javax.swing.JPanel Office97Pane;
    private javax.swing.JTextField Office97Return;
    private javax.swing.JMenuItem WindowsKeyGenerate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem macOSDark;
    private javax.swing.JMenuItem macOSLight;
    // End of variables declaration//GEN-END:variables
}
