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

package com.notelysia.windows95generatekey.OfficeKey;


import com.notelysia.windows95generatekey.WindowsRTM.*;
import java.util.Random;

public class XXXXXXXKey {
    //Generate random number with 7 digits. Sum of digits in it is divisible by 7.    
       
    public String generateKey() {
        Random rand = new Random();
        int num = rand.nextInt(9000000) + 1000000;
        while (sumOfDigits(num) % 7 != 0) {
            num = rand.nextInt(9000000) + 1000000;
        }      
        return String.valueOf(num);
    }
    
    
    public  int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
