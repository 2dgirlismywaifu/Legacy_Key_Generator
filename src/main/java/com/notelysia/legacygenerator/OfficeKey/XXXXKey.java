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

package com.notelysia.legacygenerator.OfficeKey;

import java.util.Random;

public class XXXXKey {
    
    //generate random number with 4 digits. Start from 0001 to 9991. 
    //The last digit much be 3rd digit + 1 or 2. 
    //When the result is > 9, it overflows to 0 or 1
    
    public String generateOffice97Key() {
        Random rand = new Random();
        int firstThreeDigits = rand.nextInt(999 - 1 + 1) + 1;
        int thirdDigit = firstThreeDigits % 10;
        int fourthDigit = thirdDigit + rand.nextInt(2) + 1;
        if (fourthDigit > 9) {
            fourthDigit -= 10;
            fourthDigit = rand.nextInt(2);
        }
        int randomNumber = Integer.parseInt(String.format("%03d", firstThreeDigits)) * 10 + fourthDigit;
        String formattedRandomNumber = String.format("%04d", randomNumber);      
        return String.valueOf(formattedRandomNumber);
    }
}
