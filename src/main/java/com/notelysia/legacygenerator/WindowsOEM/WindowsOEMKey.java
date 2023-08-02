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

package com.notelysia.legacygenerator.WindowsOEM;


public class WindowsOEMKey {
    
    String XXXKey = new XXXKey().generateKey();
    String YY95 = new YYKey().generateWin95Key();
    String YYNT = new YYKey().generateWinNTKey();
    String NNKey = new NKey().getNNKeyReturn();
    String SSSSSKey = new SSSSSSKey().generateKey();
    String ZZZZZKey = new ZZZZZKey().generateKey();
    String Windows95Key = XXXKey + YY95 + "-OEM-" + NNKey + SSSSSKey + "-" + ZZZZZKey;
    String WindowsNTKey = XXXKey + YYNT + "-OEM-" + NNKey + SSSSSKey + "-" + ZZZZZKey;
    
    public String getWindows95Key() {
        return Windows95Key;
    }
    
    public String getWindowsNTKey() {
        return WindowsNTKey;
    }
    
}
