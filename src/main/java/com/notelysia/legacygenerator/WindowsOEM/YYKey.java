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

import java.util.Random;

public class YYKey {
    //Generate random number with 2 digits. Start from 95 to 03 (last key must not be 03 in Windows 95)
    Random rand = new Random();
    public String generateWin95Key() {       
        int win95year = rand.nextInt(8) + 1995;       
        int thirdDigit = (win95year / 10) % 10;
        int fourthDigit = win95year % 10;
        int newNumber = thirdDigit * 10 + fourthDigit;        
        return String.format("%02d", newNumber);
    }
    public String generateWinNTKey() {
        int winntyear = rand.nextInt(9) + 1995;        
        int thirdDigit = (winntyear / 10) % 10;
        int fourthDigit = winntyear % 10;
        int newNumber = thirdDigit * 10 + fourthDigit;        
        return String.format("%02d", newNumber);
    }
}
