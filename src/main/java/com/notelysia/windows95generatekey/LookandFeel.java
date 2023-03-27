package com.notelysia.windows95generatekey;

import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LookandFeel {
    public static void setTheme() {
        try { 
            UIManager.setLookAndFeel(new FlatIntelliJLaf());           
        } catch (UnsupportedLookAndFeelException ex) { 
            ex.printStackTrace(); 
        }
            }
    
}
