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

package com.notelysia.legacygenerator;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LookandFeel {
    //log4j
    private final static Logger logger = LogManager.getLogger(LookandFeel.class);
    public static void setTheme() {
        //Flatlaf Theme
        FlatLightLaf flatLightLaf = new FlatLightLaf();
        FlatDarkLaf flatDarkLaf = new FlatDarkLaf();
        FlatIntelliJLaf flatIntelliJLaf = new FlatIntelliJLaf(); //IntelliJ Light
        FlatDarculaLaf flatDarculaLaf = new FlatDarculaLaf(); //IntelliJ Dark
        FlatMacLightLaf flatMacLightLaf = new FlatMacLightLaf(); //macOS Theme
        FlatMacDarkLaf flatMacDarkLaf = new FlatMacDarkLaf(); //macOS Theme
        
        Properties props = new Properties();
        FileInputStream in;
        
        try {
            in = new FileInputStream("flatlaf/theme.properties");
            props.load(in);
            in.close();
            
            String flatlaftheme = props.getProperty("flatlaf_theme");
            if (null == flatlaftheme) {
                UIManager.setLookAndFeel(flatLightLaf);              
            } else switch (flatlaftheme) {
                case "light" -> UIManager.setLookAndFeel(flatLightLaf);
                case "dark" -> UIManager.setLookAndFeel(flatDarkLaf);
                case "intelliJLight" -> UIManager.setLookAndFeel(flatIntelliJLaf);
                case "intelliJDark" -> UIManager.setLookAndFeel(flatDarculaLaf);
                case "cupertinoLight" -> UIManager.setLookAndFeel(flatMacLightLaf);
                case "cupertinoDark" -> UIManager.setLookAndFeel(flatMacDarkLaf);
                default -> UIManager.setLookAndFeel(flatLightLaf);
            }
            
        } catch (UnsupportedLookAndFeelException | IOException ex) {
            logger.error("Exceptions happen: " + ex, ex);
        }
        UIManager.put( "TextComponent.arc", 20 );
    }   
}
