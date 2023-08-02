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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SetTheme {
    //log4j
    private final static Logger logger = LogManager.getLogger(SetTheme.class);
    public void FlatLafTheme (String theme) {
        FileInputStream fis = null;
        try {
            Properties props = new Properties();
            fis = new FileInputStream("flatlaf/theme.properties");
            props.load(fis);
            fis.close();
            //updating value
            props.setProperty("flatlaf_theme", theme);
            try (FileOutputStream fos = new FileOutputStream("flatlaf/theme.properties")) {
                props.store(fos, "updated theme settings");
            }
        } catch (FileNotFoundException ex) {
            logger.error("Exceptions happen: " + ex, ex);
        } catch (IOException ex) {
            logger.error("Exceptions happen: " + ex, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                logger.error("Exceptions happen: " + ex, ex);
            }
        }
        RestartProgram();
    }

    private void RestartProgram() {
        int  dialogResult = JOptionPane.showConfirmDialog(null, "Progam need restart to update theme work properly!\nRestart Now??",
                "Theme Update", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            try {
                String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
                File currentJar = new File(SplashScreen.class.getProtectionDomain().getCodeSource().getLocation().toURI());
                
                /* is it a jar file? */
                if(!currentJar.getName().endsWith(".jar"))
                    return;
                
                /* Build command: java -jar application.jar */
                ArrayList<String> command = new ArrayList<>();
                command.add(javaBin);
                command.add("-jar");
                command.add(currentJar.getPath());
                
                ProcessBuilder builder = new ProcessBuilder(command);
                builder.start();
                System.exit(0);
            } catch (IOException | URISyntaxException ex) {
                logger.error("Exceptions happen: " + ex, ex);
            }
        }       
    }
}
