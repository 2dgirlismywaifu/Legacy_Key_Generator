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

package KeyGenerationTest;

import com.notelysia.legacygenerator.OfficeKey.Office95;
import com.notelysia.legacygenerator.OfficeKey.Office97;
import com.notelysia.legacygenerator.WindowsOEM.WindowsOEMKey;
import com.notelysia.legacygenerator.WindowsRTM.WindowsRTMKey;

public class DemoKeyTesting {
    
    //Call class to set key
    WindowsOEMKey windowsOEMKey = new WindowsOEMKey();
    WindowsRTMKey windowsRTMKey = new WindowsRTMKey();
    Office95 office95 = new Office95();
    Office97 office97 = new Office97();
   
    //Protected String
    protected String Win95RTM;
    protected String Win95OEM;
    protected String WinNT4RTM;
    protected String WinNT4OEM;
    protected String Office95;
    protected String Office97;

    public DemoKeyTesting() {
    }

    //Set key method
    public void setWin95RTM() {
        this.Win95RTM = windowsRTMKey.getWindows95RTMKey();
    }

    public void setWin95OEM() {
        this.Win95OEM = windowsOEMKey.getWindows95Key();
    }

    public void setWinNT4RTM() {
        this.WinNT4RTM = windowsRTMKey.getWindowsNTRTMKey();
    }

    public void setWinNT4OEM() {
        this.WinNT4OEM = windowsOEMKey.getWindowsNTKey();
    }

    public void setOffice95() {
        this.Office95 = office95.getOffice95Key();
    }

    public void setOffice97() {
        this.Office97 = office97.getOffice97Key();
    }
    
    //get key method
    public String getWin95RTM() {
        return Win95RTM;
    }

    public String getWin95OEM() {
        return Win95OEM;
    }

    public String getWinNT4RTM() {
        return WinNT4RTM;
    }

    public String getWinNT4OEM() {
        return WinNT4OEM;
    }

    public String getOffice95() {
        return Office95;
    }

    public String getOffice97() {
        return Office97;
    }
    
      
}
