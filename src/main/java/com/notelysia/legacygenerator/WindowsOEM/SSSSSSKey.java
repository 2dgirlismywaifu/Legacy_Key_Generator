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
public class SSSSSSKey {
    //Generate random number with 6 digits. Sum of digits in it is divisible by 7. If not, generate again until it is divisible by 7
    public String generateKey() {
        Random rand = new Random();
        int num = rand.nextInt(900000) + 100000;
        while (sumOfDigits(num) % 7 != 0) {
            num = rand.nextInt(900000) + 100000;
        }
        return String.valueOf(num);
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
