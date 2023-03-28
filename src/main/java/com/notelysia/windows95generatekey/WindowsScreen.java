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

import com.notelysia.windows95generatekey.WindowsRTM.WindowsRTMExplain;
import com.notelysia.windows95generatekey.WindowsOEM.WindowsOEMExplain;
import com.notelysia.windows95generatekey.WindowsOEM.WindowsOEMKey;
import com.notelysia.windows95generatekey.WindowsRTM.WindowsRTMKey;

public class WindowsScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    WindowsOEMExplain windows95Explain;
    WindowsOEMKey windowsOEMKey;
    WindowsRTMKey windowsRTMKey;
    WindowsRTMExplain windowsNTExplain;
    SetTheme setTheme;
    IconImageUtilities iconImageUtilities = new IconImageUtilities();
    public WindowsScreen() {
        initComponents();
        iconImageUtilities.setWindowsImage(this);
        DefaultContextMenu.addDefaultContextMenu(WindowsOEMReturn);
        DefaultContextMenu.addDefaultContextMenu(WindowsRTMReturn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Windows95Pane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GenereateWindowsOEM = new javax.swing.JButton();
        WindowsOEMReturn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        KeyWindowsOEMExplain = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        WindowsNT4Key = new javax.swing.JCheckBox();
        WindowsNTPane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GenereateWindowsRTM = new javax.swing.JButton();
        WindowsRTMReturn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        KeyWindowsRTMExplain = new javax.swing.JLabel();
        WindowsNTRTM = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MainMenu = new javax.swing.JMenu();
        Office9597KeyGenerate = new javax.swing.JMenuItem();
        Windows95Explain = new javax.swing.JMenuItem();
        WindowsNTExplain = new javax.swing.JMenuItem();
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
        setTitle("Windows 95, Windows NT 4.0 Generate Key");
        setIconImages(null);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Windows 95 and Windows NT 4.0 OEM");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-windows-95-96.png"))); // NOI18N

        GenereateWindowsOEM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GenereateWindowsOEM.setText("Generate Key");
        GenereateWindowsOEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenereateWindowsOEMActionPerformed(evt);
            }
        });

        WindowsOEMReturn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        WindowsOEMReturn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WindowsOEMReturn.setToolTipText("");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-help-48.png"))); // NOI18N

        KeyWindowsOEMExplain.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        KeyWindowsOEMExplain.setForeground(new java.awt.Color(51, 51, 255));
        KeyWindowsOEMExplain.setText("How this key can generate ?");
        KeyWindowsOEMExplain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeyWindowsOEMExplainMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Format: XXXXX-OEM-XXXXXXX-XXXXX");

        WindowsNT4Key.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        WindowsNT4Key.setText("Windows NT 4.0 OEM Key");

        javax.swing.GroupLayout Windows95PaneLayout = new javax.swing.GroupLayout(Windows95Pane);
        Windows95Pane.setLayout(Windows95PaneLayout);
        Windows95PaneLayout.setHorizontalGroup(
            Windows95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Windows95PaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(Windows95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Windows95PaneLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(Windows95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Windows95PaneLayout.createSequentialGroup()
                        .addComponent(WindowsNT4Key)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Windows95PaneLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KeyWindowsOEMExplain, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Windows95PaneLayout.createSequentialGroup()
                        .addComponent(WindowsOEMReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(GenereateWindowsOEM)
                        .addGap(43, 43, 43))))
        );
        Windows95PaneLayout.setVerticalGroup(
            Windows95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Windows95PaneLayout.createSequentialGroup()
                .addGroup(Windows95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Windows95PaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(Windows95PaneLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Windows95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WindowsOEMReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenereateWindowsOEM))
                .addGap(18, 18, 18)
                .addComponent(WindowsNT4Key)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Windows95PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Windows95PaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(KeyWindowsOEMExplain)
                        .addGap(13, 13, 13)))
                .addGap(18, 18, 18))
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Windows 95 RTM, Windows NT 4.0, Office 95");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-windows-95-96.png"))); // NOI18N

        GenereateWindowsRTM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GenereateWindowsRTM.setText("Generate Key");
        GenereateWindowsRTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenereateWindowsRTMActionPerformed(evt);
            }
        });

        WindowsRTMReturn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        WindowsRTMReturn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WindowsRTMReturn.setToolTipText("");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-help-48.png"))); // NOI18N

        KeyWindowsRTMExplain.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        KeyWindowsRTMExplain.setForeground(new java.awt.Color(51, 51, 255));
        KeyWindowsRTMExplain.setText("How this key can generate ?");
        KeyWindowsRTMExplain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeyWindowsRTMExplainMouseClicked(evt);
            }
        });

        WindowsNTRTM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        WindowsNTRTM.setText("Windows  NT 4.0 RTM Key (NOT OEM KEY)");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Format: XXX-XXXXXXX");

        javax.swing.GroupLayout WindowsNTPaneLayout = new javax.swing.GroupLayout(WindowsNTPane);
        WindowsNTPane.setLayout(WindowsNTPaneLayout);
        WindowsNTPaneLayout.setHorizontalGroup(
            WindowsNTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(WindowsNTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(WindowsNTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                        .addComponent(WindowsNTRTM)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KeyWindowsRTMExplain, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                        .addComponent(WindowsRTMReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(GenereateWindowsRTM)
                        .addGap(43, 43, 43))))
        );
        WindowsNTPaneLayout.setVerticalGroup(
            WindowsNTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                .addGroup(WindowsNTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(WindowsNTPaneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WindowsNTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WindowsRTMReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenereateWindowsRTM))
                .addGap(18, 18, 18)
                .addComponent(WindowsNTRTM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(WindowsNTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WindowsNTPaneLayout.createSequentialGroup()
                        .addComponent(KeyWindowsRTMExplain)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WindowsNTPaneLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18))))
        );

        MainMenu.setText("File");

        Office9597KeyGenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office95-24.png"))); // NOI18N
        Office9597KeyGenerate.setText("Office 95 - 97 Key Generator");
        Office9597KeyGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Office9597KeyGenerateActionPerformed(evt);
            }
        });
        MainMenu.add(Office9597KeyGenerate);

        Windows95Explain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-windows-95-24.png"))); // NOI18N
        Windows95Explain.setText("Windows 95, Windows NT OEM Explain Key");
        Windows95Explain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Windows95ExplainActionPerformed(evt);
            }
        });
        MainMenu.add(Windows95Explain);

        WindowsNTExplain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-windows-95-24.png"))); // NOI18N
        WindowsNTExplain.setText("Windows 95, Windows NT 4.0 RTM,  Office 95 Explain Key");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GenereateWindowsOEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenereateWindowsOEMActionPerformed
        // TODO add your handling code here:
        windowsOEMKey = new WindowsOEMKey();
        if (WindowsNT4Key.isSelected()) {
            WindowsOEMReturn.setText(windowsOEMKey.getWindowsNTKey());
        } else {
            WindowsOEMReturn.setText(windowsOEMKey.getWindows95Key());
        }            
    }//GEN-LAST:event_GenereateWindowsOEMActionPerformed

    private void GenereateWindowsRTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenereateWindowsRTMActionPerformed
        // TODO add your handling code here:
        windowsRTMKey = new WindowsRTMKey();
        if (WindowsNTRTM.isSelected()) {                      
            WindowsRTMReturn.setText(windowsRTMKey.getWindowsNTRTMKey());
        }
        else {
            WindowsRTMReturn.setText(windowsRTMKey.getWindows95RTMKey());
        }
        
    }//GEN-LAST:event_GenereateWindowsRTMActionPerformed

    private void Windows95ExplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Windows95ExplainActionPerformed
        // TODO add your handling code here:
        windows95Explain = new WindowsOEMExplain();
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
        windowsNTExplain = new WindowsRTMExplain();
        windowsNTExplain.setVisible(true);
        windowsNTExplain.setTitle("Windows NT 4.0/Office 95 Explain");
        windowsNTExplain.setResizable(false);
    }//GEN-LAST:event_WindowsNTExplainActionPerformed

    private void KeyWindowsOEMExplainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeyWindowsOEMExplainMouseClicked
        // TODO add your handling code here:
        windows95Explain = new WindowsOEMExplain();
        windows95Explain.setVisible(true);
        windows95Explain.setTitle("Windows 95 Explain");
        windows95Explain.setResizable(false);
    }//GEN-LAST:event_KeyWindowsOEMExplainMouseClicked

    private void KeyWindowsRTMExplainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeyWindowsRTMExplainMouseClicked
        // TODO add your handling code here:
        windowsNTExplain = new WindowsRTMExplain();
        windowsNTExplain.setVisible(true);
        windowsNTExplain.setTitle("Windows NT 4.0/Office 95 Explain");
        windowsNTExplain.setResizable(false);
    }//GEN-LAST:event_KeyWindowsRTMExplainMouseClicked

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

    private void Office9597KeyGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Office9597KeyGenerateActionPerformed
        // TODO add your handling code here:
        dispose();
        OfficeScreen frame = new OfficeScreen();    
        frame.setVisible(true);
        frame.setTitle("Office 95 - 97 Generate Key");
        frame.setResizable(false);
    }//GEN-LAST:event_Office9597KeyGenerateActionPerformed
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
                
              
                new WindowsScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutProgram;
    private javax.swing.JMenu ChangeTheme;
    private javax.swing.JMenuItem ExitProgram;
    private javax.swing.JMenuItem FlatlafDark;
    private javax.swing.JMenuItem FlatlafLight;
    private javax.swing.JButton GenereateWindowsOEM;
    private javax.swing.JButton GenereateWindowsRTM;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JMenuItem IntelliJDark;
    private javax.swing.JMenuItem IntelliJLight;
    private javax.swing.JLabel KeyWindowsOEMExplain;
    private javax.swing.JLabel KeyWindowsRTMExplain;
    private javax.swing.JMenu MainMenu;
    private javax.swing.JMenuItem Office9597KeyGenerate;
    private javax.swing.JMenuItem Windows95Explain;
    private javax.swing.JPanel Windows95Pane;
    private javax.swing.JCheckBox WindowsNT4Key;
    private javax.swing.JMenuItem WindowsNTExplain;
    private javax.swing.JPanel WindowsNTPane;
    private javax.swing.JCheckBox WindowsNTRTM;
    private javax.swing.JTextField WindowsOEMReturn;
    private javax.swing.JTextField WindowsRTMReturn;
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
