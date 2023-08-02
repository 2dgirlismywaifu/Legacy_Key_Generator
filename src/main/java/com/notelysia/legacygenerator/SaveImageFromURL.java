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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;


public class SaveImageFromURL {
    private final String imageUrl; 
    private final String destinationFile;

    public SaveImageFromURL(String imageUrl, String destinationFile) {
        this.imageUrl = imageUrl;
        this.destinationFile = destinationFile;
    }
    public void crtDir() {
        File directory = new File("github_avatar");
        if (!directory.exists()) {
        directory.mkdirs();
        }
    }
    public void downloadImage() throws IOException {
    URL url = new URL(imageUrl);
    OutputStream os;
        try (InputStream is = url.openStream()) {
            os = new FileOutputStream("github_avatar/" + destinationFile);
            byte[] b = new byte[2048];
            int length;
            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }   }
    os.close();
    }
    public void saveImage() throws IOException {
        File imageFile = new File("github_avatar/" + destinationFile);
        if (imageFile.exists()) {
            //Keep image in 7 days
            if (System.currentTimeMillis() - imageFile.lastModified() > (7 * 24 * 60 * 60 * 1000)) {
                // Resave the image here
                downloadImage();
            }
        }
        else {
            downloadImage();
        }
    }
}
