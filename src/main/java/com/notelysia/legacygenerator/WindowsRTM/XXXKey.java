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

package com.notelysia.legacygenerator.WindowsRTM;

import java.util.Random;

public class XXXKey {
    //generates a random number with 3 digits
    //if it is Windows 95 and Windows NT 4.0 RTM key, 333, 444, 555, 666, 777, 888, 999 is NOT ALLOW
    public String generateWin95Key() {
        Random rand = new Random();
        int num = rand.nextInt(900) + 100;
         while (num == 333 || 
                 num == 444 || 
                 num == 555 || 
                 num == 666 || 
                 num == 777 || 
                 num == 888 || 
                 num == 999) {
            num = rand.nextInt(900) + 100;
        }
        return String.valueOf(String.format("%03d", num));
    }
    //if it is Windows NT 4.0 RTM key, start from 000 to 998
    public String generateWinNTKey() {
        Random rand = new Random();
        int num = rand.nextInt(998);
        while (num == 333 || num == 444 || num == 555 || num == 777 || num == 888) {
            num = rand.nextInt(998);
        }       
        return String.valueOf(String.format("%03d", num));
    }
}
